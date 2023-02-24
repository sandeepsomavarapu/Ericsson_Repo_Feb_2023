package com.ericcson.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream obj = new FileInputStream("employees.txt");
		ObjectInputStream in = new ObjectInputStream(obj);
		Employee emp = (Employee) in.readObject();
		System.out.println(emp);
	}

}
