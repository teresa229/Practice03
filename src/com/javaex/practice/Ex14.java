package com.javaex.practice;

import java.util.Scanner;

public class Ex14 { //해결 안됨 // 맨+를 어떻게 없애지?
	
	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum= 0;

		
		for(int i=1; i<=num; i++) {
			//	System.out.print(i);
			//	System.out.print("+");
				sum = sum + i;
				System.out.print("+"+i);
		}
		System.out.println("");
		System.out.println("합계: " + sum);
		}
		
	}
