package com.minh89.lab1;

import java.util.Scanner;

public class Lab1Bai4 {

	public static void main(String [] argc) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("nhap he so a");
		double a = sc.nextDouble();
		System.out.println("nhap he so b");
		double b = sc.nextDouble();
		System.out.println("nhap he so c");
		double c = sc.nextDouble();
		double delta = Math.pow(b, 2) - 4*a*c;
		System.out.println("delta: " + delta);
		if(delta >= 0) {
			System.out.println("can delta: " + Math.sqrt(delta));
		} else {
			System.out.println("khong tinh duoc can delta" );
		}
		
	}
}
