package UijTkachLessons;

import javax.security.auth.login.Configuration;
import javax.swing.Spring;

public class Lesson17 { Spring framework
	
/*
 * Spring - это леговесный фреймворк, который упрощает содание корпоративных приложений
 * sping.jar
 * 1) весит всего 2.8 Mb
 * 2) Conainer
 * 3) framework
 * 4) IoC
 * 5) AOP (аспектно ориентированное программирование) - выдиление сквозной функциональности в отдельном модуле.
 * 6) XML
 */
	
	## Пример
	/* Если Spring не использовать, то использовать конструктор Impl можно так:
	 * Hello h = new Impl("a");
	 * h.sayHi();
	 * 
	 * Если воспользоваться Spring, то:
	 * В начале надо содать конфигурационный файл xml:
	 * Config.xml
	 * <beans>
	 *    <bean id="hello"
	 *          class="Impl">
	 *        <constructor-arg value="bbb"/>
	 *        <property name="s" value="aaa"/>
	 *    </bean>
	 * </beans>
	 * 
	 * Далее переходим к программе (создаем контекст куда передаем наш файл xml):
	 * AbstractApplicationContex ctx =
	 *    ClassPathApplicationContex
	 *    FileSystem
	 *    .create("./config.xml");
	 *    
	 *  Как обращаться к контексту:
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
    * Манеджер удобнее тестировать когда вариант 2 рис. 17
    * 
    * пример такой:
    * 
    * Гетман идет в поход. Походы могут быть разные поэтому удобнее отдельно создать класс поход.
    */   
       interface Гетман {
    
         public void пойти ();
      }
       
       public class Sagaydachniy implements Гетман {
    	   
    	 //privet b ...;  
    	   
    	   public class пойти (){
    		   
    		   посовещаться;
    		   // b лучше определить как переменную класса Sagaydachniy
    		   Богатство b = new Крым Поход().пойти();
    		   поделить;
    	   };
       }
       
       public class Крым Поход () implements Поход {
    	   
    	   public Богатство пойти(){
    		   
    		   подготовка;
    		   прийти;
    		   побить всех;
    		   Б = забрать();
    		   return Б;
    	   }
    	   }
       }
    /*
     * Как теперь Поход протестировать:
     */
      
      @ Test
        
      public void test Поход(){
    	  Sagaydchniy s = new Sagaydachniy();
    	  s.пойти();
    	  assertNotNull(s.getБ());
    	  assertTrue(s.setБ()) == свободноКонвертируемый);
    	  
      }
      /*  
       *  Класс КрымПоход жестко зависит от класса SagayDachni. Этой зависимоти надо избежать:
       *  Из рис. 17-2 видно как классы КрымПоход и ТуркПоход имплементятся от интерфейса Поход.
       *  Следовательно класс SagayDachniy будет зависеть о интерфейса Поход.
       *  После создания зависимостей создадим конфигурационный файл:
       */
      confg.xml
      <bean>
         
         <bean id="sagayd">;
            class = "Sagaydachniy"/>
         // С помощью ref можно ссылаться на другие bean-ы в этом контексте   
         <property name="п" ref="крым поход"/>
         
         <bean id="крым поход"
      		class = "КрымПоход"/>
            
      // Перепишем класс SagayDachniy
            
         public class Sagaydachniy{
        	 privet Поход п;
        	 //geter and setter
        	 public void пойти (){
        		 совещание();
        		 Б = п.пойти();
        		 результаты();
        	 }
         }
      //время 54:03
      
}
