package com.lzx.mod;

import java.util.Scanner;


/**
 * 
 * @author LiuZX
 *
 */

public class ModCalculate {

	public static void main(String[] args) {
		ModCalculate mod = new ModCalculate();
		System.out.println("�ƽ�a,b��֪ʱ�ķ�������" );
		Scanner scn = new Scanner(System.in);
		System.out.println("�����������ļ�");
		String x = scn.nextLine();
		System.out.println("��ֱ�����a��b��ֵ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		mod.Calculate(x,a,b);
	}
	void Calculate(String y,int a ,int b) {
		for (int i = 0; i < y.length(); i++) {
			char t = y.charAt(i);
			if (t == ' ') {
				
			}else {
				int z=(((int)t-65)-b)*CalMod(a) % 26 ;
				if (z < 0) {
					z = z + 26;
				}
				z = z + 65;
				System.out.print((char)z);
			}

		}
	}
	int CalMod(int a) {
		for (int i = 0; i < 26; i++) {
			if (a*i % 26 == 1) {
				a = i ;
			}
		}
		return a;
	}
}

