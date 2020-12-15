package com.javaex.practice;

public class Ex09 {
	
	public static void main(String[] args) {

		//방법1
		for(int i=1; i<=10 ; i++){
			
			for(int j=i; j<i+10 ; j++){
				System.out.print(j + "\t");
			}	
			System.out.println("");
		}
	
		System.out.println("========================================");
	
		//방법 2
		for(int dan=0; dan<10; dan++) {
			for(int num =1; num<=10; num++) {
				System.out.print(dan+num+"   ");
				}
			
			System.out.println("");
		}
		
	}
}
