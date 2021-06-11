package com.minh89.lab2;

import java.util.Scanner;

public class Lab2Bai4 {

	public void menu() {
		System.out.println("1. giai phuong trinh bac nhat");
		System.out.println("2. giai phuong trinh bac 2");
		System.out.println("3. tinh tien dien");
		System.out.println("4. ket thuc");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab2Bai4 bai4 = new Lab2Bai4();
		bai4.menu();
		Scanner sc = new Scanner(System.in);
		System.out.println("Chon chuc nang:_");
		int chon = sc.nextInt();
		switch (chon) {
			case 1: 
				Lab2Bai1.giaiPTB1();
				break;
			
			case 2: 
				Lab2Bai2.giaiPTB2();
				break;
			case 3: 
				Lab2Bai3.tinhTienDien();
				break;
			case 4:
				System.out.println("ket thuc");
				break;
			default:
				System.out.println("dau vao khong ton tai");
		}
			
	}

}
