import java.util.*;

/*
 * В этой программе выводятся все не повторяющиеся слова, выведенные из стандартного потока System.in во множество HashSet
 */
public class Ex2HashSet {

	public static void main(String[] args) {
		
		Set<String> words = new HashSet<>();
		
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
		{
			String word = in.next();
			words.add(word);
		}
		
		Iterator<String> iter = words.iterator();
		for (int i = 1; i <= 20 && iter.hasNext(); i++)
			System.out.println(iter.next());
		
		System.out.println("Колличество слов во мнжестве - " + words.size());

	}

}
