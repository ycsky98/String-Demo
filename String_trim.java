package day01;

public class String_trim {
	/**
	 * String trim()
	 * 去除当前字符串两边空白的部分
	 * */
	public static void main(String[] args) {
		String str = "		str		";
		System.out.println(str);
		str = str.trim();
		System.out.println(str);
	}
}
