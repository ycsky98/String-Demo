package day01;

public class String_valueOf {
	/**
	 * static String valueOf(...)
	 * String提供了一组重载的静态方法valueOf
	 * 作用是将java其他类型转化为字符串
	 * 常用于将基本类型转换为字符串
	 * */
	public static void main(String[] args) {
		int i = 123;
		String istr = String.valueOf(i);
		System.out.println(istr);
		
		double d = 123.123;
		istr = String.valueOf(d);
		System.out.println(istr);
		
	}

}
