package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i;
		
		System.out.println("5의 배수의 개수 "+ num/5);
//		System.out.println("5의 배수의 합" + num);  //합이 어떻게 되냐?
		
		for(i<num) {
			if(i%5==0) {
				System.out.println();
			}
		}
		
	}

}
