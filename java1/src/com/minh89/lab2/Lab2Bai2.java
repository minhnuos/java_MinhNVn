package com.minh89.lab2;

import java.util.Scanner;

public class Lab2Bai2 {

	public static void giaiPTB2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap he so a ");
		double a = sc.nextDouble();
		System.out.println("nhap he so b ");
		double b = sc.nextDouble();
		System.out.println("nhap he so c ");
		double c = sc.nextDouble();
		if(a == 0) {
			if(b == 0) {
				if(c == 0) {
					System.out.println("vo so nghiem");
				}  else  {
					System.out.println("vo nghiem");
				} 
			}else {
				System.out.println("nghiem x = " + -c/b);
			}
		} else {
			double delta = Math.pow(b, 2) - 4*a*c;
			if(delta < 0) {
				System.out.println("vo nghiem");
			} else if(delta == 0) {
				System.out.println("nghiem kep x = " + -b/(2*a));
			} else {
				System.out.println("nghiem x1 = " + (-b + Math.sqrt(delta)/(2*a)));
				System.out.println("nghiem x2 = " + (-b - Math.sqrt(delta)/(2*a)));
			}
		}
	}
	
	public static void main(String [] argc) {
		giaiPTB2();
		
	}
}
