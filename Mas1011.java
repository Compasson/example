package massive;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.List;
import java.io.IOException;
import java.lang.String;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Mas1011 {

	
	public static void main(String[] args) {
        try {
			Files.lines(Paths.get("E:/Разработки Java/Тексты для тренировок/1.txt"), StandardCharsets.UTF_8).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
    
		
    }
   
}