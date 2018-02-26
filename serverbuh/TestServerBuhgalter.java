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
			ArrayList<Options> list = new ArrayList<>(); // ���� ������

	      // establish server socket
	      try (ServerSocket s = new ServerSocket(8189))
	      {
	         // wait for client connection
	         try (Socket incoming = s.accept()) // ��� ������ ����� ������ ������ �������� ������ �� �������, ������ ����� ������ ������ ���� Socket, ������������� ������������� ����������
	         {
	            InputStream inStream = incoming.getInputStream(); // ������ incoming ����������� ��� ������ ������ � ������ �����.
	            OutputStream outStream = incoming.getOutputStream(); // ������ incoming ����������� ��� ������ ������ � ������ ������.
	   
	            // ������ ����� � ������ ������������� � ������ ������������ � ������
	            try (Scanner in = new Scanner(inStream))
	            {
	               PrintWriter out = new PrintWriter(outStream, true /* autoFlush - �������������� ������� */);
	      
	               out.println("Hello! This program is houme buhgaler. Input construction:");
	      
	               // echo client input
	               while (in.hasNextLine())
	               {
	                        String line = in.nextLine();
	                        line.toLowerCase(); // ��������� ��� ������� � ��������
	                        // ������ line ����� �� ����� �� ������� ��������� ������ �����, ����� ���������� �����������.
        	          		ArrayList<String> words = new ArrayList<>(); // ����������� � ����������� 4 �����
	               	    	for(String str : line.split("( +)|\n"))
	          		        {
	          		        	words.add(str);
	          		        	System.out.println(str);
	          	        	}
	          	
	          	        	// ��� ����������� add
	          	        	if(words.size() == 4 && words.get(0).trim().equals("add"))
	          	        	{
	          	    		// � ����� try ����� ������ �������� ���������� ���� � ��� INTEGER
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
	          	        	
	          		        // ��� ����������� view [sort]
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
	          	         	// ��� ����������� view and help
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
	          					               out.println("view [sort]      " + " {����� ������ �� ��������� ���������. ����� ��������� ����� ����� �� ���������.");
	          					               out.println("view      " + " {����� ������� �� ���� ����������. ����� ��������� ����� ����� �� ������ ���������.");
	          					               out.println("help      " + " {������� ��� ������������ �����������}");
	          				             }
	          			         }
	          			
	          		         }
	          		         // ������� ������ ��������� ���� � �����������
	          		         words.clear();

	    
	               }
	            }
	         }
	      }
	   }

}
