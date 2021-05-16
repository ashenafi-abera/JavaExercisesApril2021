package day7Exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {

	private String firstName;
	private int age;

	public Student(String firstName, int age) {
		this.firstName = firstName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [firstName = " + firstName + ", age = " + age + "]";
	}

	public static void main(String[] args) {

		Student obj1 = new Student("Zaid", 18);
		Student obj2 = new Student("Negsti", 22);
		Student obj3 = new Student("Wawa", 16);
		Student obj4 = new Student("Mili", 25);

		List<Student> students = new ArrayList<Student>();

		students.add(obj1);
		students.add(obj2);
		students.add(obj3);
		students.add(obj4);

		// Unsorted lists
		Collections.sort(students);
		System.out.println("Unsorted lists: " + students);

		//Sorted by firstName
		Collections.sort(students, new firstNameSorter());

		System.out.println("Sorted fName: " + students);
		
		//Sorted by age
		
		Collections.sort(students, new ageSorter());
		
		System.out.println("Sorted age: " + students);

	}

	@Override
	public int compareTo(Student o) {

		return 0;
	}	

}
