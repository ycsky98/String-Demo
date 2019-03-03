package day01;

public class String_indexof {
	public static void main(String[] args) {
		String str = "thinking in java";
		int y = str.indexOf("in");
		System.out.println(y);
		
		//第二个参数代表从指定索引往后搜索
		int t = str.indexOf("in",2);
		System.out.println(t);
		
		int l = str.lastIndexOf("in");
		System.out.println(l);
		
		l = str.lastIndexOf("in", 2);
		System.out.println(l);
	}
}
