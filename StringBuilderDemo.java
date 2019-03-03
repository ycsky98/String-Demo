package day01;

public class StringBuilderDemo {
	/**
	 * StringBuilder解决资源开销,解决频繁修改字符串
	 * StringBuilder内部是一个可变的字符数组,可以通过扩容来实现长度变换,
	 * 而不是每次创建新对象
	 * StringBuilder提供类方便修改字符串内容的方法
	 **/
	public static void main(String[] args) {
		StringBuilder bb = new StringBuilder("你好,java");
		bb.append("，hi");//追加
		System.out.println(bb.toString());
		bb.replace(8, bb.length(), "nb");//替换(也是包含头)
		System.out.println(bb);
		bb.delete(0, 3);//也是含头不含尾原则
		//在指定位置后插入数据
		bb.insert(0, "mm,");
		System.out.println(bb);
		//将字符串反转
		bb.reverse();
		System.out.println(bb);
	}
}
