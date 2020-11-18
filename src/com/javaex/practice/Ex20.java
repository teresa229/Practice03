package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

public static void main(String[] args) {
		
		System.out.println("========================");
		System.out.println("     [숫자맞추기게임 시작]     ");
		System.out.println("========================");
	//	System.out.print(">> ");
	//	Scanner sc = new Scanner(System.in);
	//	int num = sc.nextInt();
		
		int Q = 50;
		
			boolean action = true;
			while(action) {
				
				System.out.print(">> ");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				
				if(num < Q) {
					System.out.println("더 높게");
		//			break;
				}else if(num == Q){
					System.out.println("맞았습니다.");
					break;
				}else {
					System.out.println("더 낮게");
		//			break;
				}
				}
			System.out.print("게임을 종료하시겠습니까?(y/n) ");

/*			code.equals("y")
				System.out.println("========================");
				System.out.println("     [숫자맞추기게임 종료]     ");
				System.out.println("========================");
			
*/	}

}

