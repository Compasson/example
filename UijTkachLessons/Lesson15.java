package UijTkachLessons;

import java.beans.Statement;
import java.sql.DriverManager;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Lesson15 {  JDBC Java Data base co}


�������� JDBC ������:
	
�����	DriverManager // ������������ � ������ � ������� ���������. ������� ��� ������ ������ ����� Connection
	 
	   getConnection();

����� RezaultSet , ��� ������ ���������� ������. ���� � INT ��������� null, �� ����� ���������.
���� ���� ����� ���������� ��������� ������, ������� getRezultSET ��������, ���� �� ������� null/

Class.forName(
		"org.mysql.Driver"); //�������� ��� �������� ��������

//����� ������ ��������������, ������ 3 ���������
getConnection(
		url, user, pass)
		
/*
 * 	���	url:  jdbc:<��� ��������>:[//����[:����,/]]
 * 
 * ������ jdbc:mysql://localhost:3306/mydb? user="aa"
 */
		
������:
	PUBLIC_MEMBER Void main(...){
			String user = "aa";
			String pass = "bb";
			String url = "jdbc:mysql....";
			String driver = "org mysql....";
		
try { // ��� ����� ����� �� 6-�� ��������
			try{
			class.forName(driver); //1-�� �������� - �������� �������
		} catch (exeption e){
			fail}
		}
		
		try{
		Connection � = DriverManeger //2-�� �������� - �������� ��������.
				
				getConnection (url,user,pass)
				
		} catch (exeption e){
			fail e.printStackTrace();
		}
		
		Statement st = c.createStatement("Select from User"); // 3 - � ��-���
		
		try{....
			
			RezultSet rs = st.exempt(); // 4 - ��
		
		while (rs.next()){
			sysout(rs.getString("name"); // 5 - ��
			
		 
		} finally{         // 6 - ��, ����� ������ ��-���!!!
			if (c = null){
			} c.close();
			}
		}

