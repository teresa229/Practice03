package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(x=num; x>0; x--) {
			for(int y=x; y>0; y--) {
			System.out.print("*");
			}
		System.out.println("");
		}
		
		sc.close();
	}
	
}


