package com.lzx.mod;

import java.util.Scanner;

public class AnalysisAlphabetRatio {

	public static void main(String[] args) {
		AnalysisAlphabetRatio aar = new AnalysisAlphabetRatio();
		Scanner scn = new Scanner(System.in);
		System.out.println("������Ҫ������ַ���");
		String str = scn.nextLine();
		aar.calRatio(str);
	}
	
	/**
	 * ��ĸ���ֵĸ��ʼ��㺯��
	 * @param str
	 */
	
	void calRatio(String str) {
		int count[] = new int[26];
		float ratio[] = new float[26];
		
		/**
		 * ��������ÿ����ĸ���ֵĴ���
		 */
		
		for (int i = 0; i < str.length(); i++) {
			char t = str.charAt(i);
			if (Character.isAlphabetic(t)) {
				count[(int)t-(int)'A'] ++;
			}
		}
		
		/**
		 * ��������ÿ����ĸ���ֵĸ���
		 */
		
		for (int i = 0; i < 26; i++) {
			ratio[i] = (float)count[i]/(float)str.length();
		}
		
		/**
		 * ���������ĸ���ֵĸ���
		 */
		
		for (int i = 0; i < 26; i++) {
			System.out.println("��ĸ"+(char)(65+i)+"�ĸ���="+ratio[i]);
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


