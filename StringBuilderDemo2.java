package day01;

public class StringBuilderDemo2 {
	/**
	 * 使用StringBuilder
	 * */
	public static void main(String[] args) {
		StringBuilder nn = new StringBuilder("a");
		for (int i = 0; i < 10000000; i++) {
			nn.append("a");
		}
	}
}
