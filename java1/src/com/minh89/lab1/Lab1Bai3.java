package com.minh89.lab1;

import java.util.Scanner;

public class Lab1Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhap chieu dai canh");
		double canh = scanner.nextDouble();
		System.out.println("the tich hinh lap phuong " + Math.pow(canh, 3));
	}

}
