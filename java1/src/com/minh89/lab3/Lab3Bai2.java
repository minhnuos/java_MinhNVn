package com.minh89.lab3;

import java.util.Iterator;

public class Lab3Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			System.out.println("bang cuu chuong: " + i );
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%d x %d = %d", i,j,i*j);
				System.out.println();
			}
		}

	}

}
