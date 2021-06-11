package com.minh89.lab2;

import java.util.Scanner;

public class Lab2Bai3 {

	public static void tinhTienDien() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so dien ");
		int dien = sc.nextInt();
		if(dien <= 50 && dien >= 0) {
			System.out.println(dien*1000);
		} else if(dien > 50) {
			System.out.println(50*1000 + (dien-50)*1200);
		} else {
			System.out.println("dau vao khong hop le");
		}
	}
	
	public static void main(String[] args) {
		tinhTienDien();
	}

}
