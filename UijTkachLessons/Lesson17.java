package UijTkachLessons;

import javax.security.auth.login.Configuration;
import javax.swing.Spring;

public class Lesson17 { Spring framework
	
/*
 * Spring - ��� ���������� ���������, ������� �������� ������� ������������� ����������
 * sping.jar
 * 1) ����� ����� 2.8 Mb
 * 2) Conainer
 * 3) framework
 * 4) IoC
 * 5) AOP (�������� ��������������� ����������������) - ��������� �������� ���������������� � ��������� ������.
 * 6) XML
 */
	
	## ������
	/* ���� Spring �� ������������, �� ������������ ����������� Impl ����� ���:
	 * Hello h = new Impl("a");
	 * h.sayHi();
	 * 
	 * ���� ��������������� Spring, ��:
	 * � ������ ���� ������ ���������������� ���� xml:
	 * Config.xml
	 * <beans>
	 *    <bean id="hello"
	 *          class="Impl">
	 *        <constructor-arg value="bbb"/>
	 *        <property name="s" value="aaa"/>
	 *    </bean>
	 * </beans>
	 * 
	 * ����� ��������� � ��������� (������� �������� ���� �������� ��� ���� xml):
	 * AbstractApplicationContex ctx =
	 *    ClassPathApplicationContex
	 *    FileSystem
	 *    .create("./config.xml");
	 *    
	 *  ��� ���������� � ���������:
	 *   Hello h = (Hello)ctx.getBean("Hello");
	 *   h.sayHi();
	 *  
	 *   
	 */
	public interface Hello {
	   
	   public void sayHi(){
		   
	   }
	public class Implements Hello {
		
		public Void sayHi();
	    sysout(s);
	}
	privet string s;
	
	public Impl(String s) {
		this.s = s;
	}
	//Getter and Setter
	
   IoC
   /*
    * �������� ������� ����������� ����� ������� 2 ���. 17
    * 
    * ������ �����:
    * 
    * ������ ���� � �����. ������ ����� ���� ������ ������� ������� �������� ������� ����� �����.
    */   
       interface ������ {
    
         public void ����� ();
      }
       
       public class Sagaydachniy implements ������ {
    	   
    	 //privet b ...;  
    	   
    	   public class ����� (){
    		   
    		   ������������;
    		   // b ����� ���������� ��� ���������� ������ Sagaydachniy
    		   ��������� b = new ���� �����().�����();
    		   ��������;
    	   };
       }
       
       public class ���� ����� () implements ����� {
    	   
    	   public ��������� �����(){
    		   
    		   ����������;
    		   ������;
    		   ������ ����;
    		   � = �������();
    		   return �;
    	   }
    	   }
       }
    /*
     * ��� ������ ����� ��������������:
     */
      
      @ Test
        
      public void test �����(){
    	  Sagaydchniy s = new Sagaydachniy();
    	  s.�����();
    	  assertNotNull(s.get�());
    	  assertTrue(s.set�()) == ����������������������);
    	  
      }
      /*  
       *  ����� ��������� ������ ������� �� ������ SagayDachni. ���� ���������� ���� ��������:
       *  �� ���. 17-2 ����� ��� ������ ��������� � ��������� ������������� �� ���������� �����.
       *  ������������� ����� SagayDachniy ����� �������� � ���������� �����.
       *  ����� �������� ������������ �������� ���������������� ����:
       */
      confg.xml
      <bean>
         
         <bean id="sagayd">;
            class = "Sagaydachniy"/>
         // � ������� ref ����� ��������� �� ������ bean-� � ���� ���������   
         <property name="�" ref="���� �����"/>
         
         <bean id="���� �����"
      		class = "���������"/>
            
      // ��������� ����� SagayDachniy
            
         public class Sagaydachniy{
        	 privet ����� �;
        	 //geter and setter
        	 public void ����� (){
        		 ���������();
        		 � = �.�����();
        		 ����������();
        	 }
         }
      //����� 54:03
      
}
