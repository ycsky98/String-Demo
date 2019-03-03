package day01;

public class String_startsWith_endWith {
	/**
	 * boolean startsWith(String str)
	 * boolean endsWith(String str)
	 * 判断字符串是否是以给定字符串开头或者结尾
	 * */
	public static void main(String[] args) {
		String str = "thinking in java";
		boolean bb = str.startsWith("t");
		System.out.println("starts:" + bb);
		boolean ends = str.endsWith("va");
		System.out.println("ends:" + ends);
	}
}
