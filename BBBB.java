package day01;

import java.util.Random;
import java.util.Scanner;

public class BBBB {
	
	static Scanner shu = new Scanner(System.in);
	
	public static void main(String[] args) {
		String[] aa = new String[5];
		for (int i = 0; i < aa.length;) {
			boolean falg = true;
			for (int j = 0; j < aa.length; j++) {
				int v = (int)((Math.random()*122+1));
				if (v<=90 && v>=65 || v<=122 && v >=97) {
					char zhuan = (char)v;
					aa[i] = String.valueOf(zhuan);
					i++;
					falg = false;
					break;
				}if(v>=49 && v<=57){
					char nn = (char)v;
					aa[i] = String.valueOf(nn);
					i++;
					break;
				}
			}
		}
		
		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i]);
		}
		System.out.println();
		String ll = "";
		for (int i = 0; i < aa.length; i++) {
			aa[i] = aa[i].toUpperCase();
			ll += aa[i];
		}
		
		System.out.println("请输入验证码:");
		String pString = shu.next().trim();
		pString = pString.toUpperCase();
		if (ll.equals(pString)) {
			System.out.println("验证通过");
		}else {
			System.out.println("验证码错误");
		}
	}
}
