package day01;

public class String_charAT {
	/**
	 * char charAt(int index)
	 * 返回当前字符串中指定位置的字符
	 * */
	public static void main(String[] args) {
		String str = "thinking in java";
		/*char ch = str.charAt(3);
		System.out.println(ch);*/
		String ss = "fsafsadad";
		boolean falg = true;
		for (int i = 0; i < ss.length()/2; i++) {
			if(ss.charAt(i) != ss.charAt(ss.length()-1-i)){
				System.out.println("不是回文");
				falg = false;
				break;
			}
		}
		if (falg) {
			System.out.println("是回文");
		}
	}
}
