package day01;

public class String_substring {
	/**
	 * substring截取指定范围内的字符串并返回
	 * 在java API中通常使用两个数字范围时，都是"含头不含尾"(比如0截取到9那么0是截取的,但9是不截取的)
	 * */
	public static void main(String[] args) {
		String str = "www.baidu.com.cn";
		/*str = str.substring(4, 10);
		System.out.println(str);*/
		str = getHostName(str);
		System.out.println(str);
		
	}
	
	public static String getHostName(String host){
		int f = host.indexOf(".");
		System.out.println(f);
		int l = host.indexOf(".",f+1);
		System.out.println(l);
		host = host.substring(f+1,l);
		return host;
	}
}
