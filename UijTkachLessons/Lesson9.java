������ ���� ����� �� YouTube.

��� �������������.

���� 9 ��� (Exception)

PrintWriter out;

out = new PrintWriter(newFileWriter("a.txt"));

out.println("aaa");
// ��������� ��� � ���� try, � � ����� catch ��������� ������ (���������� ������).
try {out = new PrintWriter(newFileWriter("a.txt"));

out.println("aaa");
} catch (FileNotFoundExeption e){
	System.err.println("Nema Failure");
}
// ��� ������� ���� ������ �������� ������ ���� catch.
  catch (......... e1){
	  .........
  }
  catch (......... e2){
	  .........
  }
// �� ��� ����� ����� ��� ������ ��������� � ���� catch

catch (Exception e){
	
}
//��������!! ����������� ����������� ������ �����!!!  ������ �2 ����������� �� �.
catch (......... e2){
	  .........
}
catch (Exception e){
	
}
/* Exception ����������� ������� �����������
 * Runtime Exception �� ������� �����������
 * Error - ��������� ������, �� 99% �� ������� ������������� ������������
 */

public class Write {
	public static void main (String [] args){
		System.out.println("Hello");
		writeToFile();
		System.out.println("Bye");
	}
	/* chained exception - ��� ������, ����� �� ����� ��������� ����� � ���� catch
	 * 
	 */
	public static void writeToFile() throw FileNotFound, IOException {
		PrintWrite
	}
}
/* ����� ����� �������� ���������� �� ���� ����������� ������:
 * 
 */
public void doSmth(User u){
	if (null == u){
		throw new NullPointerException();
		
	}
}
// ����� ����� ���� ����������, � ���������� ���������� ������.
catch (IO Exception e){
	throw new ServiceEx(e); 
}

� Exception ���� �����:
	e.getMessage();
    e.getLocaled();
    e.stacktrace(); Metod[]
    e.printStacktrace();
// ���� finaly ����� �������� � ����� ������. ��� ����������� ���� ������ ��� ���.
try {
	...1
	...2
	...3
}
catch {
} finally {
	....
}










