package day01;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = "123abc";
		s1.toUpperCase();
		System.out.println(s1.replace("a", "A"));
		
		String s2 = "123abc";
		String s3 = "123abc";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		s1 = s1+"!";
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);
		
		String s4 = 123 + "abc";
		System.out.println(s4);
		System.out.println(s2 == s4);
		
		String s = "123";
		String s5 = s + "abc";
		System.out.println(s5);
		System.out.println(s4 == s5);
	}

}
