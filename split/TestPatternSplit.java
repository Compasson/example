package split;

import java.util.Arrays;
import java.util.regex.Pattern;

public class TestPatternSplit {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile(":|;|( +)");
		String[] animals = pattern.split("cat:dog;bird:cow fly    houme");
		Arrays.asList(animals).forEach(animal -> System.out.println(animal));
	}

}
