package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		int x, y;
		for(x=0; x<4; x++) {
			for(y=0; y<2; y++) {
				System.out.print("*");
			}
		}
		System.out.println("");
		
	}
}

/*
예상은 
**
**
**
**
이었다. println("")줄바꿈으로 알고 있는데... 이상하다.
*/