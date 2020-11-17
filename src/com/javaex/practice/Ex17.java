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


package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		
		System.out.println("------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료  ");
		System.out.println("------------------------------");
		System.out.print("선택> ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("예금액> "+ 1500);
		}else if (num == 2){
			System.out.println("출금액> "+ 700);
		}else if (num == 3) {
			System.out.println("잔고액> "+ 800);
		}else {
			System.out.println("다시입력해주세요 ");
		}
		
		sc.close();
	}

}


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

			if (y) {
				System.out.println("========================");
				System.out.println("     [숫자맞추기게임 종료]     ");
				System.out.println("========================");
			}else {
				
			}
*/	}

}

