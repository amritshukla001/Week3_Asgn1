package assignment1;

import java.util.Arrays;
import java.util.List;

public class Question1 {
	public static void main(String[] args)
	{
		List<String> collectStr= Arrays.asList("Virat", "Kohli", "ABD", "Tom", "Fiddle", "Rassie" );
		collectStr.stream().filter(n->n.length()>5&&n.length()<8).forEach(n->System.out.println(n));
	}
}
