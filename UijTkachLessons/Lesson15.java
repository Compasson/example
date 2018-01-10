package UijTkachLessons;

import java.beans.Statement;
import java.sql.DriverManager;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Lesson15 {  JDBC Java Data base co}


Основные JDBC классы:
	
Класс	DriverManager // Подсоеденяет к классу с помощью драйверов. Клавная его задача сздать класс Connection
	 
	   getConnection();

Класс RezaultSet , его методы возврощают данные. Если в INT попадется null, то нужно проверить.
Этот клас может возвращать несколько данных, поэтому getRezultSET вызывают, пока не получат null/

Class.forName(
		"org.mysql.Driver"); //Механизм для загрузки драйвера

//Метод класса ДраверМанеджер, обычно 3 параметра
getConnection(
		url, user, pass)
		
/*
 * 	для	url:  jdbc:<имя драйвера>:[//хост[:порт,/]]
 * 
 * Пример jdbc:mysql://localhost:3306/mydb? user="aa"
 */
		
Пример:
	PUBLIC_MEMBER Void main(...){
			String user = "aa";
			String pass = "bb";
			String url = "jdbc:mysql....";
			String driver = "org mysql....";
		
try { // Для всего блока из 6-ти операций
			try{
			class.forName(driver); //1-ая операция - Загрузка дравера
		} catch (exeption e){
			fail}
		}
		
		try{
		Connection с = DriverManeger //2-ая опреация - Получить коннекшн.
				
				getConnection (url,user,pass)
				
		} catch (exeption e){
			fail e.printStackTrace();
		}
		
		Statement st = c.createStatement("Select from User"); // 3 - я оп-ция
		
		try{....
			
			RezultSet rs = st.exempt(); // 4 - ая
		
		while (rs.next()){
			sysout(rs.getString("name"); // 5 - ая
			
		 
		} finally{         // 6 - ая, очень важная оп-ция!!!
			if (c = null){
			} c.close();
			}
		}

