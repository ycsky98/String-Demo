package day01;

import java.util.Arrays;

public class StringDemo2 {
	public static void main(String[] args) {
		/*String A,B,C;
		C = null;
		A = "A";
		B = "B";
		A = A+B;
		StringBuilder a = new StringBuilder("123");
		a.append("12");
		a.toString();
		
		String a2 = "123";
		String a1 = "123";
		System.out.println(a1==a2);
		System.out.println(""=="");
		check(C);
		System.out.println(C);*/
		String string = ",1,2,3,4,5,6,,,\n";
		String[] arr = string.split("1");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0].length());
		
	}
	
	public static void check(String str) {
		str = "123";
	}
}
