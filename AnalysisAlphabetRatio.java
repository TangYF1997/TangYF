package com.lzx.mod;

import java.util.Scanner;

public class AnalysisAlphabetRatio {

	public static void main(String[] args) {
		AnalysisAlphabetRatio aar = new AnalysisAlphabetRatio();
		Scanner scn = new Scanner(System.in);
		System.out.println("输入需要破译的字符串");
		String str = scn.nextLine();
		aar.calRatio(str);
	}
	
	/**
	 * 字母出现的概率计算函数
	 * @param str
	 */
	
	void calRatio(String str) {
		int count[] = new int[26];
		float ratio[] = new float[26];
		
		/**
		 * 遍历计算每个字母出现的次数
		 */
		
		for (int i = 0; i < str.length(); i++) {
			char t = str.charAt(i);
			if (Character.isAlphabetic(t)) {
				count[(int)t-(int)'A'] ++;
			}
		}
		
		/**
		 * 遍历计算每个字母出现的概率
		 */
		
		for (int i = 0; i < 26; i++) {
			ratio[i] = (float)count[i]/(float)str.length();
		}
		
		/**
		 * 遍历输出字母出现的概率
		 */
		
		for (int i = 0; i < 26; i++) {
			System.out.println("字母"+(char)(65+i)+"的概率="+ratio[i]);
		}
		bubbleSort(ratio);
		for (int i = 0; i < ratio.length; i++) {
			System.out.println(ratio[i]);
		}
		
	}
    public void bubbleSort(float[] a) {   
        
        int n = a.length;   
      
        for (int i = 0; i < n - 1; i++) {   
      
          for (int j = 0; j < n - 1; j++) {   
      
            if (a[j] > a[j + 1]) {   
      
              float temp = a[j];   
      
              a[j] = a[j + 1];   
      
              a[j + 1] = temp;   
      
            }   
      
          }   
      
        }   
      
    }   
}


