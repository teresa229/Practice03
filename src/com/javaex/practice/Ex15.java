package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) {
/* 	숫자를 1개 입력 받아 입력한 수의 약수를 모두 출력하세요
         예를들어 10을 입력한 경우 1, 2, 5, 10 이 출력된다.
*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: "); //약수 구하기
		int num = sc.nextInt();
		int i;
	
		for(i=1; i<=num; i++) {  //주의  "i<=num"
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
