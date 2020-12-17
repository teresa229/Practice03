package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {
			if(num%5 == 0) {
	
			sum = sum + i;
			}	
		}
		System.out.println("5의 배수의 개수: "+ num/5);  
		System.out.println("5의 배수의 합: " + sum);  //합이 어떻게 되냐?
				
	
		sc.close();
	}
}

