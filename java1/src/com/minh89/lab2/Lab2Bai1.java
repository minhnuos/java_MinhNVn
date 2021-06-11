package com.minh89.lab2;

import java.util.Scanner;

public class Lab2Bai1 {

	public static void giaiPTB1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap he so a");
		double a = sc.nextDouble();
		System.out.println("nhap he so b");
		double b = sc.nextDouble();
		if(a == 0) {
			if(b == 0) {
				System.out.println("vo so nghiem");
			} else {
				System.out.println("vo nghiem");
			}
			
			
		} else {
			System.out.println("nghiem x = " + -b/a);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		giaiPTB1();
	}

}
