package com.minh89.lab1;

import java.util.Scanner;

public class Lab1Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap ho ten: ");
		String name = scanner.nextLine();
		System.out.println("nhap diem trung binh: ");
		double dtb = scanner.nextDouble();
		System.out.println("Ho ten: " + name + " diem: " + dtb);
	}

}
