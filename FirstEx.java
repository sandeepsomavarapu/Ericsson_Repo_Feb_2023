package com.ericcson.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter First number for divison ");
			int a = scan.nextInt();
			System.out.println("Enter second number for divison ");
			int b = scan.nextInt();
			int result = a / b;
			System.out.println("divison of two int's " + result);

		} catch (ArithmeticException ex) {
			System.out.println("Denominator can't be zero");
		} catch (InputMismatchException ex) {
			System.out.println("Enter only numbers ...");
		} catch (Exception ex) {
			System.out.println("Other exception...");
		}
		System.out.println("remaining 1000 lines code");

		scan.close();
	}

}
