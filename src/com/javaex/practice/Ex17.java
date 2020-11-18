package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int x;
		int y;
				
		for(x = 0; x<=num; x++) {
			for(y = 1; y<num; y++) {
				y = num-x;
				System.out.print("*"+y);
			}
		}System.out.println("");

		sc.close();
	}
	
}


