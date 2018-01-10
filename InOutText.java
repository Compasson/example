package inouttext;

import java.util.Scanner;

public class InOutText 
{

    public static void main(String[] args) 
    {
    if (args.length == 0) //Аргументы вводятся в командной строке так: java main 1 2 3
    {
        System.err.print("Ошибка параметров программы.");
        System.err.println("Не задан ни один параметр.");
        return;
    }
        Scanner in = new Scanner(System.in);
        //Разбор по строчкам
             while (in.hasNext())
             {
                 String str = in.nextLine();
                 Scanner s = new Scanner(str);
                    for (String iterStr: args)
                        if ((str.toLowerCase().indexOf(iterStr.toLowerCase()) != -1) || (s.findInLine(iterStr) != null))
                                {
                                    System.out.println(str);
                                    break;
                                }
                 s.close();
             }
        in.close();
        
       
    }
}