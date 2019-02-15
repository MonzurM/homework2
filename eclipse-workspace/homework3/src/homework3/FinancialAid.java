package homework3;

import java.util.Scanner;

public class FinancialAid extends Student {
	public static void main(String[]args) {
	Student s = new Student();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first name: ");
	String tempFirst = sc.next();
	String first = tempFirst;
	System.out.println("Enter last name: ");
	String tempLast = sc.next();
	String last = tempLast;
	System.out.println("The name on the Financial Aid application is: ");
	name(first, last);
	}

}
