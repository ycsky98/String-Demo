package day01;

public class String_indexof2 {
	//判断字符串包含某字符的次数
	/**
	 * @param str原字符串
	 * @param c需要统计的字符串
	 * */
	public static int count(String str,String c){
		//记录统计次数
		int count = 0;
		//记录字符下标
		int res = 0;
		while ((res = str.indexOf(c)) > -1) {
			count++;
			str = str.substring(res+1,str.length());
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(count("123123123123321123", "123"));
	}
}
