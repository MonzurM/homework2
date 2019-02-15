package homework3;

import java.util.Scanner;
import java.util.Arrays;

public class Student {
	private int studentID;
	private String first;
	private String last;
	private String dateOfBirth;
	
	public Student() {
		
	}
	public Student(int studentID, String first, String last, String dateOfBirth) {
		this.studentID = studentID;
		this.first = first;
		this.last = last;
		this.dateOfBirth = dateOfBirth;
	}
	public int getstudentID() {
		return studentID;
		
	}
	public void setstudentID(int studentID) {
		this.studentID =studentID;
		
	}
	public String getfirst() {
		return first;
		
	}
	public void setfirst(String first) {
		this.first = first;
		
	}
	public String getlast() {
		return last;
		
	}
	public void setlast(String last) {
		this.last = last;
		
	}
	public String getdateOfBirth() {
		return dateOfBirth;
		
	}
	public void setdateOfBorth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		
	}
	public static void name(String first, String last) {
		String StudentName = first + last;
		System.out.println(StudentName);
		
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Please enter number of students: ");
		x=sc.nextInt();
		
		Student[] students = new Student[x];
		
		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter Student ID(numeric): ");
			int studentID = sc.nextInt();
			System.out.print("Enter the first name od the student: " + "\n" );
			String first = sc.next();
			System.out.print("Enter the last name of the student: " + "\n" );
			String last = sc.next();
			System.out.print("Enter the date of birth of the student(MM/DD/YYYY): ");
			String dateOfBirth = sc.next();
		students[i] = new Student(studentID, first, last, dateOfBirth);
		
			
				
		}
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			System.out.println("Informarion of Student#" + student);
			System.out.print("Student ID:" + students[i].studentID + ",");
			System.out.print("First Name: " + students[i].first + ",");
			System.out.print("Last Name: " + students[i].last + ",");
			System.out.print("Date of Birth: " + students[i].dateOfBirth + ",");
						
			
		}
		
	}
}
