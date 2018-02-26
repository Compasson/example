package serverbuh;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program implements server this listen port 8189 and write data at client in form [VALUE(INT) SORT(STRING) COMMENT(STRING).
 * Program echoes back info client.
 * Program have HELP.
 * @author IRINA
 *
 */

public class TestServerBuhgalter {
	
	 public static void main(String[] args) throws IOException
	   {
			ArrayList<Options> list = new ArrayList<>(); // База данных

	      // establish server socket
	      try (ServerSocket s = new ServerSocket(8189))
	      {
	         // wait for client connection
	         try (Socket incoming = s.accept()) // Как только какой нибудь клиент отправит запрос на серввер, данный метод вернет обьект типа Socket, прдставляющее установленное соединение
	         {
	            InputStream inStream = incoming.getInputStream(); // Обьект incoming использется для чтения данных в потоке ввода.
	            OutputStream outStream = incoming.getOutputStream(); // Обьект incoming использется для записи данных в потоке вывода.
	   
	            // Потоки ввода и вывода преобразуются в потоки сканирования и записи
	            try (Scanner in = new Scanner(inStream))
	            {
	               PrintWriter out = new PrintWriter(outStream, true /* autoFlush - автоматическая очистка */);
	      
	               out.println("Hello! This program is houme buhgaler. Input construction:");
	      
	               // echo client input
	               while (in.hasNextLine())
	               {
	                        String line = in.nextLine();
	                        line.toLowerCase(); // Переводим все символы в строчные
	                        // Сторку line делим на слова по пробелу проверяем первое слово, далее используем конструкции.
        	          		ArrayList<String> words = new ArrayList<>(); // Максимально в конструкции 4 слова
	               	    	for(String str : line.split("( +)|\n"))
	          		        {
	          		        	words.add(str);
	          		        	System.out.println(str);
	          	        	}
	          	
	          	        	// Для конструкции add
	          	        	if(words.size() == 4 && words.get(0).trim().equals("add"))
	          	        	{
	          	    		// В блоке try ловим ошибку перевода строкового типа в тип INTEGER
	          		           	try
	          			        {
	          		           	    int numb = Integer.parseInt(words.get(1));
	          		        	    list.add(new Options(numb, words.get(2), words.get(3)));
	          			            out.println("In the category *" + words.get(2) + "* add record.");
	          			            } catch (NumberFormatException e)
	          			            {
	          			               	out.println("Value summ is not type INTEGER. Inpute integer value!");
	          			            }
	          		            }
	          	        	
	          		        // Для конструкции view [sort]
	          		       if(words.size() == 2 && words.get(0).trim().equals("view"))
	          		       {
	          		                out.println("List of category  *" + words.get(1) + "* . SUMM --- COMMENT.");

	          		            	int summ = 0;
	          		            	for(Options l : list)
	          	            		{
	          		             		if(l.sort.trim().equals(words.get(1)))
	          		        		    {
	          					              out.println(l.value + " --- " + l.comment);
	          					              summ = summ + l.value;
	          				            }
	          			            }
          				            out.println("FINAL Summ of category = " + summ + " RUB.");
	          		        }
	          	         	// Для конструкции view and help
	          		        if(words.size() == 1)
	          		        {
	          		     	     if(words.get(0).trim().equals("view"))
	          			         {
	          				           out.println("This plase will have  Comparable or Serializable sorting!");
	          			         } else
	          			         {
	          			             	if(words.get(0).trim().equals("help"))
	          				            {
	          					               out.println("In program may be next constructions:");
	          					               out.println("add [value] [sort] [comment]     " + " {Add new summ in BUHG. Between of words is witespase.  In the end line is not witespace.}");
	          					               out.println("view [sort]      " + " {Вывод списка по выбранной категории. Также выводится общая сумма по категории.");
	          					               out.println("view      " + " {Вывод списков по всем категориям. Также выводится общая сумма по каждой категории.");
	          					               out.println("help      " + " {Выводит все используемые конструкции}");
	          				             }
	          			         }
	          			
	          		         }
	          		         // Очищаем список введенных слов в конструкции
	          		         words.clear();

	    
	               }
	            }
	         }
	      }
	   }

}
