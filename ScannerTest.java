package com.ericcson.demo;//ctrl+shift+O -->imports

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Id :");
		int eid = scan.nextInt();
		System.out.println("Enter Employee Name:");
		String ename = scan.next();
		System.out.println("Enter Employee Salary :");
		float esalary = scan.nextFloat();
		System.out.println("Enter Employee Address :");
		String address = scan.next();
		System.out.println("Enter Employee contact :");
		long econtact = scan.nextLong();
		System.out.println("Enter Employee Gender :");
		String gender = scan.next();

		System.out.println(eid + " " + ename + " " + esalary + " " + address + " " + econtact + " " + gender);
		scan.close();
	}

}
