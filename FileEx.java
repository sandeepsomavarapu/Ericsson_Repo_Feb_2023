package com.ericcson.io;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		File file = new File("ericcson1.txt");
		System.out.println(file.exists());//false
		file.createNewFile();
		System.out.println(file.exists());//true
		//file.mkdir();
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
	}

}
