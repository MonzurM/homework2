package string;

public class UseString {

	public static void main(String[] args) {
		
		String s = "Java is fun";
		String s2 = "java is fun";
		
		System.out.println("1) "+s.toUpperCase());
		System.out.println("2) "+s.toLowerCase());
		System.out.println("3) "+s.length());
		System.out.println("4) "+s.hashCode());
		System.out.println("5) "+s.getClass());
		System.out.println("6) "+s.indexOf("is"));
		System.out.println("7) "+s.contentEquals(s));
		System.out.println("8) "+s.contains(s));
		System.out.println("9) "+s.intern());
		System.out.println("10) "+s.charAt(5));
		
		System.out.println("11) "+s.codePointAt(8));
		System.out.println("12) "+s.concat(" to use"));
		System.out.println("13) "+s.equalsIgnoreCase("Fun java is"));
		System.out.println("14) "+s.equalsIgnoreCase("Java is fun"));
		System.out.println("15) "+s.replace('J', 'L'));
		System.out.println("16) "+s.trim() + "ny");
		System.out.println("17) "+s.contains("fun"));
		System.out.println("18) "+s.contains("bad"));
		System.out.println("19) "+s2.equalsIgnoreCase(s));
		System.out.println("20) "+s2.equals(s));
		
		char [] Array = s2.toCharArray();
		System.out.println("21) "+Array.length);
		System.out.println("22) "+Array[7]);
		System.out.println("23) "+s + " and " +s2);
		System.out.println("24) "+s.compareTo(s2));
		System.out.println("25) "+s.compareToIgnoreCase(s2));
		System.out.println("26) "+s2.endsWith("java"));
		System.out.println("27) "+s.indexOf(s2));
		System.out.println("28) "+s2.isEmpty());
		System.out.println("29) "+s2.valueOf(true));
		System.out.println("30) "+s2.substring(7));	

	}

}

