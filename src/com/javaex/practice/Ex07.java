package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i = 0;
		
		while(i<num) {
			for(i=1; i<num; i++){
					System.out.println(i);
				}
		}
		
		sc.close();
		}
	}

