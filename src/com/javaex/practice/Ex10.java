package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자: ");
		int num01 = sc.nextInt();

		System.out.print("숫자: ");
		int num02 = sc.nextInt();
		
		System.out.print("숫자: ");
		int num03 = sc.nextInt();
		
		System.out.print("숫자: ");
		int num04 = sc.nextInt();
		
		System.out.print("숫자: ");
		int num05 = sc.nextInt();
		
		if(num01 > num02 ) {
			if(num02 > num03) {
				if(num03 > num04) {
					if(num04> num05) {
						System.out.println(num01);
						}else {System.out.println(num02);}
					System.out.println(num03);}
				System.out.println(num04);}
			System.out.println(num05);
		}else {}

	//	System.out.println("최대값은 "+ num05 + "입니다.");
		
	sc.close();
	}
}

//	int = num01; num02; num03; num04; num05;