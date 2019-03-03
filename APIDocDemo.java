package day01;
/**
 * 当前类是用来测试文档注释的
 * 文档注释只写在类上，方法上和常量上
 * 文档注释最终可以被javadoc命令解析并生成为一个文档手册.
 * @author admin //作者名字
 * @version 1.204  //版本号
 * @see java.lang.String //参见类
 * @since JDK1.8 //jdk版本号
 * */
public class APIDocDemo {
	/**
	 * sayHello方法中的问候语
	 * */
	public static final String INFO = "你好";
	
	public static void main(String[] args){
		String gg = sayHello("123");
		System.out.println(gg);
	}
	
	/**
	 * 为给定用户添加问候语
	 * @param name 指定的用户名
	 * @return 带有问候语的字符串
	 * */
	public static String sayHello(String name){
		return INFO + name;
	}
}
