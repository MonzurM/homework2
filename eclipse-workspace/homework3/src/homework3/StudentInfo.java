package homework3;

public class StudentInfo {
	
	public static void main(String[]args) {
		Student st1 = new Student();
		st1.setstudentID(3857);
		st1.setfirst("Monzur");
		st1.setlast("Miah");
		st1.setdateOfBorth("02/10/1994");
		
		System.out.println(st1.getstudentID() + " " + st1.getfirst() + " " + st1.getlast() + " " + st1.getdateOfBirth() );
		
	}

}
