Лекции Юрия Ткача из YouTube.

Для тестировщиков.

Урок 7 ООП (Enum, Number, String)

/*#1
Основы классов enum - классы забитые констаннтами.
Основы работы с числами и класс MAth.
Основы редактирования сток и избежания лишних обьектов.
*/
/*
Enum это классы забитые констаннтами.
Пример класса без Enum, для int все просто, а для string не очень
*/
public class abstract UserType{
    pulic static final int ADM = 0;
    pulic static final int BUY = 0;
    pulic static final int SELL = 0;
}
if (UserType.ADM == user.getType())
/*
Пример класса Enum.
*/
public enum UserType {
    ADMIN,
    BUYER,
    SELLER;
}

class User {
    private UserType t;
}
//(user.getType()) это переменная t
if (UserType.ADMIN.equals(user.getType()))
//values возвращает массив элементов
UserType[] v = UserType.values()

/*
Работа с числами
*/
Numbers

int i = 5;   Integer a = 10;
double       Double
float        Float
//Статический метод valueOf (может принимать обьект) возвращает обьект класса Integer
Integer.valueOf(10)
Integer.parseInt("5"); //Принимает обьект строку

Integer a = 10;
a.equals
a.compareTo(100) //Возвращает 0 если а равно.-1 если меньше. +1 если больше.
// Классы с любыми большими числами
BigInteger b = newBigInteger(20);
BigDecimal d = BigDecimal.valueOF(1.5);
d.round
d.divide

Math
Sysem.out.println(5.2)  "5.200"
// Форматирование чисел, даты...
String.format("  ",5,10.2);
"Int: %d, Double: %f"

Character
//Статические методы:
Character.isLetter(char)
Character.isDigit
Character.isWhitegpace
Character.isUpperCase

// Методы класса string никогда не меют обьект, они создают новую строку!
Sring a = "abcd";
a.substring(1,2) // Возвращает bc
a.indexOf('a');
a.starstWith("ab")
a.endsWith("22")
a.compareTo()
a.compareToIgnoreCase() //Не учитывается регистр.

Sring a = "abc";
a = a + "ff"; //Здесь надо быть аккуратным. При этой операции создается 3 обьекта!!!
/*
Для избежания ненужных обьектов при добавлении, редактировании строк
используется класс StringBuilder. Он будет работать быстрее!!!
*/
StringBuilder s = new StringBuilder;
s.append(5).append("ss").append(10.2);
s.toString() // Вернет 5ss10.2


