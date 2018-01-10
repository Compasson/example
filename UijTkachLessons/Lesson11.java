package UijTkachLessons;

Lesson11 (Annotation, I/O, Properties)
/* Аннотации обычно пишутся когда пишется framework
 * Аннотации нужны для:
 * 1) Информация для компилятора
 * 2) Build time info
 * 3) Run Time info
 * 
 * Аннотации это специально форматируемый "интерфейс"
 * У аннотаций есть время жизни (только во время компиляции или как во время компиляции
 *  так и во время работы программы.
 * У аннотаций могут быть параметры: @Test(name = "aa")  
 */
@Override
public void doSmth(){
	
}
/* Наиболее часто встречаемые
 * 
 */
// Обычно ставится над старым кодом. Инфа для компилятора.
@Deprecated

//
@Owerride

// Насилн. игнор ошибок.
@SupressWarning

/* Ввод вывод
 * Весь ввод ввывод обеспечивается с помощью потока Stream
 * 2 основных интерфейса InputSrteam and OutputStream
 * 
 */
Input/Output

Byte Stream // байтовый поток
// Создаем байтовый поток
FileInputStream in = new FIL("a.txt");
try
   int c;
   while ((c = in.read() != -1){
   }
catch();
// Обязательно закрывать поток!!!
finally{
	in.close
}

CharasterString // Символьный поток
FileReader fe and FileWriter
int c = fe.read()
Character.value
char ch = (char)c;

// Считывание работает быстрее, буфферезируется целый файл.
BufferedReader
BufferedWriter
BufferedInputStream

InputStream in = nem BufferedInputStream(new FileInputSrteam(....));

// Считываем целую линию

BufferedReader i = new BufferedReader(newFileReader("aa.txt0"));

PrintWrite o = PrintWrite(new FileWriter(new FileWriter("bb.txt")));

try {
	String l = i.readerLine();
	o.println();
}
finally {i.close
	o.close}

// Если надо считать числа(данные в виде примитивов)
DataInputStream
DataOutputStream

read /writeDouble
      writeInt
      writeBoulean
      writeUTF()

// Запись и считывание обьектов
ObjectStream

ObjectInputStream / ObjectOutputStream

Object o = readObject();
           writeObject(Serializable s)

public class User implements Serializable {
           }
/* NIO много возможностей доступа к файлам и их перемещения.
 *            
 */
NIO
java.util.nio

Path("house/eee/aa.txt")

File f = newFile("aa.txt");
f.exist()

/* 
 * 
 */
Property file

Key = value

login = aa
pass  = bb
id    = ss

Properties p = new b......
p.load(InputSream)
p.set(Key)
      
      
      





























