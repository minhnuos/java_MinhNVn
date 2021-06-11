package com.minh89.lab1;

import java.util.Scanner;

public class Lab1Bai2 {

	public static void main(String [] argc) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap chieu dai: ");
		double dai = sc.nextDouble();
		System.out.println("nhap chieu rong: ");
		double rong = sc.nextDouble();
		double chuvi = (dai + rong)*2;
		double dientich = dai*rong;
		double min = Math.min(dai, dientich);
		System.out.println("chu vi: " + chuvi);
		System.out.println("dien tich: " + dientich);
		System.out.println("canh nho: " + min);
	}
}
