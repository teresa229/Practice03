package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		

		for(int x=1; x<=num; x++){
			for(int y=0; y<x; y++) {
				System.out.print(x);
			}
			System.out.println("");
		}
		
		sc.close();
		}
	}

