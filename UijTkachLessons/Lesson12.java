package UijTkachLessons;

Lesson 12 ( Threads - ������)

/*
 * ������� ��� java.exe ������ JVM. ��� � windows �������� �������, ������, ����� � �.�.
 * ���� ������� ������ �� ���������� � �������, ���� ��� �� IPC.
 * ������ ������� ��� ������� ����������� ������ ���� ����� Main. ���.12
 */
Process

/*
 * ����� ��� ���������� ���� ������� ����� ����������� �� ��������� ���� ����������.
 * ����� ����� �������:
 */
Threads

class Thread      interface Runnable

class MyThread implements Runnable {
	publi void run(){
		//action
	}
}
// ����� ��������� ��� �����:
Thread t = new Thread (new MyThread());
t.start(); // � ����� ������� ����� t ���������� ����������� �������� ���������.

// ������ ������:
public MyThread extends Thread{
	@override
	public void run(){
		//action		
	}
}
new Myhread().start();

// ��������� ������
new Thread(new Runnable(){
	public void run(){
		//action
	}
}).start();

//����� ���������� ����� ���������� sleep.
public void run(){
	//action
    try {
    	Thread.sleep(1000); //sleep 1 sec.
    } catch (IterapedExeptions){
    }
    //action 2
}
//����� join - �������� �����, ���� ���� ��� ���������� ����� ����������� � ��������� ����������� 
t1 = new Thread();
t1 = new Thread();
t1.start();
t2.start();
   t1.join();
   t2.join();
   
/*���������� ��� ���� class Conter � ��� ������:
 * ��� ������ ����� �������� ������ ������������ � ������� ������.
 * ������� ����������� ������������� : ����� ������� �������� syncronized!
 */  
public class Conter{
	int c = 0;
	public syncronized void inc(){
	c++;
	}
	public syncronized void dec(){
		c--;
	}
	public syncronized void getC(){
		return c;
	}
}
//��� �������������
Tread1              Thread2
1. Thread1 inc       1
2. Thread2 dec      -1
3. Thread1 get      -1
//C ��������������
Tread1              Thread2
1. Thread1 inc       1
2. Thread2 get  sleep
/* �����2 �������� (������) � ���� ����  ����� 1 �������� ������.
*  ���� ������ ������� ����� �� ����� ����� ���������!!!
*/

public void inc(){
	syncronized (this){
		c++;
	}
	}
/*
 * ��� ��������
 */
public class Conter{
	int c1;
	int c2;
	Object lock1 = new Object();
	Object lock2 = new Object();
	    public void inc1(){
		    syncronized (lock1){
			    c1++;
        }
	 	public void inc2(){
			syncronized (lock2){
				c2++;
		}
}
	 	
//��� �������� Deadlock. ����� ��� ���� � ���� ����� ����.���.12-1
Deadlock
//��� ������ ���������� ������� ��� �����!!!
livelock //����� �������� �� ������� ��������� ������ �� ����.
race conditions //