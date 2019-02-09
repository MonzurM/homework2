package container;

import java.util.Scanner;

public class Container {
	
	public static void main(String[] args) {
		System.out.println("Enter 10 numbers: ");
		
		Scanner container = new Scanner(System.in);
		
		int [] input = new int[10];
		
	for(int i=0; i<input.length; i++) {
		input[i] = container.nextInt();	
	}
	System.out.println();

	System.out.println("You entered: ");
	
	for (int j=0; j<input.length; j++) {
	
		System.out.println(input[j]);
		container.close();
			
	}	
      }
}
