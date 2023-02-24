package com.ericcson.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteTest {
	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("employees.txt");
		ObjectOutputStream obj = new ObjectOutputStream(out);
		Employee emp = new Employee(123, "mahesh", 2000, "trainer");
		obj.writeObject(emp);
//the process of converting object data into byte data is called serialization
//the process of converting byte data into object data is called de-serialization		
	}
}
