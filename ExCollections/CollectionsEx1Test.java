package aaa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionsEx1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Ren> alist = new ArrayList<>();
		Set<Ren> set = new HashSet<>();
		
		for( int i = 0; i <= 20; i++)
		{
		    Ren ren = new Ren(i,i-20);
		    
		    
		    if (!set.contains(ren)) { //�� ��������� ���������� �������
			    set.add(ren); // ��� ������ �������� �������������
		  	    alist.add(ren); // ��� ��������� �� �������
		  	    System.out.println("1");
		     }
		}
		Iterator<Ren> iterset = set.iterator();
		Iterator<Ren> iteralist = alist.iterator();
		for(int i = 0; i <= 20 && iterset.hasNext(); i++)
		{
			System.out.println(iterset.next().getX());
			System.out.println("");
			System.out.println(iteralist.next().getY());

		}

	}

}
