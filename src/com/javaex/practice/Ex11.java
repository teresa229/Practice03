package com.javaex.practice; //입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다.
							 //입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다.
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt(); //num 입력값으로 정의
		int startNum;
		
		if(num%2 == 1) {
			startNum = 1;
		}else {
			startNum = 2;
		}
		
		for(int i = startNum; i<num; i++) {
			sum = sum + i;
		}
		System.out.println("결과값"+ sum);
		sc.close();
	}
}
