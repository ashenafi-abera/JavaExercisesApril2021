package day7Exercise;

import java.util.HashSet;
import java.util.Set;

public class Question2 {

	public static void main(String[] args) {
		
		Set<Integer> setIntersection1 = new HashSet<>();
		Set<Integer> setIntersection2 = new HashSet<>();
		
		setIntersection1.add(3);
		setIntersection1.add(4);
		setIntersection1.add(5);
		setIntersection1.add(7);
		setIntersection1.add(8);
		setIntersection1.add(9);
		
		System.out.println("setIntersection1 = " + setIntersection1);
		
		setIntersection2.add(5);
		setIntersection2.add(2);
		setIntersection2.add(4);
		setIntersection2.add(6);
		setIntersection2.add(7);
		setIntersection2.add(11);
		//Print
		System.out.println("setIntersection2 = " + setIntersection2);
		
		setIntersection1.retainAll(setIntersection2);
		System.out.println("Intersection = " + setIntersection1);

	}

}
