package staticnonstatic;

public class House {
	
	public static int numberOfWindows = 10;
	
	public void setNumberOfWindows(int numberOfWindows) {
		House.numberOfWindows = numberOfWindows;
		
	}
	public int getNumberOfOpenWindows() {
		return numberOfWindows;	
	}
	
	public static void openNumberOfWindows() {
		System.out.println("I opened 3 windows.");
	}
}
