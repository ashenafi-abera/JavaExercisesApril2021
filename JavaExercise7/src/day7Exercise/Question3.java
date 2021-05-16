package day7Exercise;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question3 {

	public static void main(String[] args) {
		
		List<Integer>myList = new ArrayList<>();
		//Set<Integer> myList = new LinkedHashSet<>();
		
		myList.add(1);
		myList.add(2);
		myList.add(4);
		myList.add(4);
		myList.add(5);
		myList.add(5);


		
		
		for (int i = 0;  i < myList.size(); i++) {
			for (int j = 0;  j < myList.size(); j++)
				

			if (myList.get(i) % 2 == 0) {
				myList.remove(i);
				i =j;
			}
		}
		 System.out.println(myList);
		 
		 System.out.println("**************");
		 
		Iterator<Integer> myListIterator = myList.iterator();
		 
		 while(myListIterator.hasNext()) {
			 
			 if(myListIterator.next() % 2 == 0) {
				 myListIterator.remove();
			 }
		 }
		 System.out.println(myList);


	}

}
