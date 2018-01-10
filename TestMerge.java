import java.util.*;
import java.lang.Iterable;

/*
 *  Программа создает две коллекции a = [a1,a2, ...] ; b = [b1,b2, ...] 
 *  
 *  Смешивает коллекции в одну r = [a1,b1,a2,b2, ...]
 */

public class TestMerge {
       
	public static void main(String[] args)
	{
	
	    Collection<String> a = new ArrayList<>();
		Collection<String> b = new ArrayList<>();
		
		for (int i=0; i<20; i++)
		{
		    a.add("Привет ");
			b.add("Пока ");
		}
		
		/*
		public static Collection<String> merge(Collection<String> aa, Collection<String> bb)
		*/
		
		public static ArrayList merge(ArrayList aa, ArrayList bb)
		{
		    ArrayList r = new ArrayList<>();
			
		    Iterator<String> iteraa = aa.iterator();
			Iterator<String> iterbb = bb.iterator();
			
			while (iteraa.hasNext())
			{
			    r.add(iteraa.next());
				r.add(iterbb.next());
			}
			
			
		}
		
		
		for (String element : merge(a,b))
			{
			    System.out.println(element);
			}

    }	
}