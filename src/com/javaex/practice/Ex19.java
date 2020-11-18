package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			boolean action = true;
			while(action) {
			
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료  ");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("예금액> "+ 1500);
				
			}else if (num == 2){
				System.out.println("출금액> "+ 700);
		//		int a = sc.nextInt();
			}else if (num == 3) {
				System.out.println("잔고액> "+ 800);
			}else {
				System.out.println("다시입력해주세요 ");
				action = false;
			}
			
			}
			sc.close();
		}

}
	
