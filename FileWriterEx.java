package com.ericcson.io;

import java.io.FileWriter;
import java.io.IOException;

class FileWriterEx {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("ericcson.txt");// it will create
		fw.write(97);// charater
		fw.write("sandeep \n intelect");
		fw.write("\n");
		char[] ch1 = { 'a', 'b', 'c' };
		fw.write(ch1);
		fw.write("\n");

		fw.flush();
		fw.close();
	}

}