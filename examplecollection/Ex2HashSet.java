package examplecollection;

import java.util.*;

/*
 * ¬ этой программе вывод€тс€ все не повтор€ющиес€ слова, выведенные из стандартного потока System.in во множество HashSet
 * 
 * «апуск осуществл€етс€ из командной строки:  java Ex2HashSet < ExWords.txt
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
		
		System.out.println(" олличество слов во множестве - " + words.size());

	}

}
