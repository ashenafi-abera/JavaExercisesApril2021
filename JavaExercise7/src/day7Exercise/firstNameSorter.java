package day7Exercise;

import java.util.Comparator;

public class firstNameSorter implements Comparator<Student>{

	
	public int compare(Student o1, Student o2) {
		
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
	
}
