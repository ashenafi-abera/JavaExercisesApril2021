package day2Exercise;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner check = new Scanner(System.in);
		
		//String start1 = "Tree in";
		//String start2 = "T";
		//boolean start2 =  true;
		System.out.print("Enter the first Character: ");
		String start2 = check.nextLine();
		
		
		if (start2.startsWith("T")) { 
			System.out.println("Yes that is the string"); 
		} 
		else {
			 System.out.println("No that is not the one"); 
		}
		
		check.close();

	}

}
