package laptop;

public class TestLaptop {
public static void main(String[] args) {
		
		Laptop lp1 = new Laptop();
		System.out.println("$" + lp1.getPrice());
		
		Laptop lp2 = new Laptop("MacBook", "Pro" , 2019, 8, 256, 15);
		System.out.println("non-Static method 2: ");
		lp2.updateScreenSize(13);
		
		System.out.println("Static Method: ");
		Laptop.yourLaptop();
			
		
	}

}


