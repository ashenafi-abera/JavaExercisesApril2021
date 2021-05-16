package day7Exercise;

import java.util.Set;
import java.util.TreeSet;

public class Question1 {

	public static void main(String[] args) {
		
		Set<Character> setCharacters = new TreeSet<>();
		
		setCharacters.add('A');
		setCharacters.add('F');
		setCharacters.add('A');
		setCharacters.add('D');
		setCharacters.add('F');
		setCharacters.add('C');
		setCharacters.add('B');
		
		System.out.println(setCharacters);

	}

}
