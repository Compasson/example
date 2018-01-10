Лекции Юрия Ткача из YouTube.

Для тестировщиков.

Урок 6 ООП (final, static)

/*#1

*/
public class Hello {
    public int getId(){
        return 1;
    }
}
public class Bye extends Hello {
    // Переопределенный метод
    public int getId(){
        return 2;
    }    
}
// Чтобы метод getId нельзя было переопределить, то используем final:
public class Hello {
    public final int getId(){
        return 1;
    }
}
// Можно и так, но наследовать класс уже будет нельзя:
public final class Hello {};

// final может использоватья при определении переменной, её обязательно надо
// инициализировать какимто значением.
// Переменную нельзя будет переопределить. 
public class Constants {
    public final int id = 5;
}

/* Определение константы, название большими буквами!!!
*  static используется в случае, когда нужно задать значение  ID одно на 
*  на весь класс, а не для каждого обьекта своё собственное.
*  Доступ  статической переменной ("константе") осуществляется через
*  ИМЯ_КЛАССА.ID
*  В случае переменной num приходится создавать обьект, только после этого мы 
*  имеем доступ к переменной.
*/
public class Constants {
    public static final int ID = 5;
    public double num;
}
int value = Constant.ID;
i = new Constants;
i.num;

/* Статическим может быть и метод.
*  Вызов метода ИМЯ_КЛАССА.check(); Этот метод един на все обьекты.
*  Чаще static всего используется, когда конструктор класса приватный. Тогда 
*  создается стат.метод , который возвращает конструктор создающий обьект.
*  ИМЯ_КЛАССА.getInstance(); Вызов метода извне!
*/ 
public class Constants {
    public static void check(){
   // тело метода
}
Constants.check();

public Verification {
    int id;
    private Verification(){
     id = 5;   // Приватный конструктор, извне нельзя будет создать обьект этого класса.
    }
    // Этот метод статический, ему разрешено создавать обьекты.
    // Тип возвращаемого значения это обьект класса Verification.
    public static Verification getInstance(){
        return new Verification();
    }
}
/* Пример с использованием приватной переменной _instance
Когда метод getInstance() обращатся к Классу Verification впервые, то
то создается обьект класса Verification.
Когда обращение повторно и т.д. , то методу возвращается тот же самый обект,
так как он один на весь класс. РИС.E:\Разработки Java\Черновики\Урок 6 ООП.jpeg
*/
public Verification {
    int id;
    private Verification(){
     id = 5;
    }
    private static Verification _insance;
    public static Verification getInstance(){
            if (_instance == nul){}
                _instance = new Verification();
            return _instance;
            }
}

/*#(# - пример номер)2
"Переопределение статического метода"
Можно только так вызвать статический метод одного названия в наследуемых классах
*/
public class A {
    public static int getId() {
        return 1;
    }
    public   boolean isGood(){
        return true;
    }
}
public class B exend A {
    public static int getId() {
        return 2;
    }
    public   boolean isGood(){
        return false;
    }
}
/* Если создать обект В, то:
Статические методы нельзя переопределять.
*/
b = new B();
B.isGood   
b.getId //Так НЕЛЬЗЯ
//Можно только так вызвать статический метод одного названия в наследуемых классах
B.getId()
A.getId()
/* Так можно подобраться к методу класса В из класса А
Если наоборот, то используется ключевое слово super 
*/ 
A.a = new B()
a.isGood(); 

/*#3 
" Тема - анонимные классы" 
*/
public interface Action {
    public boolean doAction();
}
//doSomething
public class A{
    public void doSmth(Action a){
        a.doAction(); 
    }
}
public class B implements Action {
    public boolean doAction(){
        //тело
    return true;
    }
}
/*
*/
A a = new A();
a.doSmth(new B());

/*
Так как экшенов очень много может быть, класс переполняется обьектами,
что не очень удобно, поэтому используется вложение параметра в метод 
в виде целого конструктора с методом!!
*/
A a = new A();
a.doSmth(new Action(){
    public boolean doAction(){
    // тело
    return true;
    }
});
/*
На примере swing
*/
Jframe f;

f.addWindowListener();

/*#4
Переменное число параметровб, как одного типа, так и разных.
(int... num)
В метод sum можно загнать от одного параметра до сколько хочешь,
и он всегда посчитает общюю сумму.
Можно делать так: sum(int[] num), но здесь надо заранее задать массив 
определенной длины.
*/
public int sum(int ... num){
   int[]num2 = num;
   int summa = 0;
   for (int i:num){
      summa += i;
   } return summa;
}
sum(5);
sum(5,25);
sum(5,25,3,13,200);
//Можно и так:
public int sum(int a, String b, dooble... num){};
//Оставлять значение параметра без значения. Можно так:
do(1,"",1.5,1.6);
//Так нельзя!!!! Переменное число параметров можно писать только в конце.
public void do(int... n, int b ){};
// Вот так:
public void do(int b, int... n){};