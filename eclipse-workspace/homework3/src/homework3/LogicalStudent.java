package homework3;

import java.util.Scanner;

public class LogicalStudent {

	public static void main(String[]args) {
		int studentID = 3857;
		String first = "Monzur";
		String last = "Miah";
		
		System.out.println("Checking student's credibility: ");
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String first1 = in.next();
		System.out.println("Please enter your last name: ");
		String last1 = in.next();
		System.out.println("Please enter your Student ID: ");
		int studentID1 = in.nextInt();
		
		if(first1.equals(first)) {
			if(last1.contentEquals(last)) {
				if (studentID1==(studentID)) {
					System.out.println("You are in the database.");
				}else {
					System.out.println("You are not in the database.");
				}}else {
					System.out.println("You are not in the database.");
				}}else {
					System.out.println("You are not in the database.");
					
				}
			}
		
	}

