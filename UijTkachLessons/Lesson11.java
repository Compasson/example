package UijTkachLessons;

Lesson11 (Annotation, I/O, Properties)
/* ��������� ������ ������� ����� ������� framework
 * ��������� ����� ���:
 * 1) ���������� ��� �����������
 * 2) Build time info
 * 3) Run Time info
 * 
 * ��������� ��� ���������� ������������� "���������"
 * � ��������� ���� ����� ����� (������ �� ����� ���������� ��� ��� �� ����� ����������
 *  ��� � �� ����� ������ ���������.
 * � ��������� ����� ���� ���������: @Test(name = "aa")  
 */
@Override
public void doSmth(){
	
}
/* �������� ����� �����������
 * 
 */
// ������ �������� ��� ������ �����. ���� ��� �����������.
@Deprecated

//
@Owerride

// ������. ����� ������.
@SupressWarning

/* ���� �����
 * ���� ���� ������ �������������� � ������� ������ Stream
 * 2 �������� ���������� InputSrteam and OutputStream
 * 
 */
Input/Output

Byte Stream // �������� �����
// ������� �������� �����
FileInputStream in = new FIL("a.txt");
try
   int c;
   while ((c = in.read() != -1){
   }
catch();
// ����������� ��������� �����!!!
finally{
	in.close
}

CharasterString // ���������� �����
FileReader fe and FileWriter
int c = fe.read()
Character.value
char ch = (char)c;

// ���������� �������� �������, ��������������� ����� ����.
BufferedReader
BufferedWriter
BufferedInputStream

InputStream in = nem BufferedInputStream(new FileInputSrteam(....));

// ��������� ����� �����

BufferedReader i = new BufferedReader(newFileReader("aa.txt0"));

PrintWrite o = PrintWrite(new FileWriter(new FileWriter("bb.txt")));

try {
	String l = i.readerLine();
	o.println();
}
finally {i.close
	o.close}

// ���� ���� ������� �����(������ � ���� ����������)
DataInputStream
DataOutputStream

read /writeDouble
      writeInt
      writeBoulean
      writeUTF()

// ������ � ���������� ��������
ObjectStream

ObjectInputStream / ObjectOutputStream

Object o = readObject();
           writeObject(Serializable s)

public class User implements Serializable {
           }
/* NIO ����� ������������ ������� � ������ � �� �����������.
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
      
      
      





























