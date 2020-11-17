package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
			for(int y=1; y<num; y++) {
				for(int x=1; x<=y; x++) {
					System.out.print("*");
			}System.out.println("");
			}
		sc.close();
	}
	
}
