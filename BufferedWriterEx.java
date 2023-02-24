package com.ericcson.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class BufferedWriterEx {
	public static void main(String args[]) throws IOException {
		FileWriter fw = new FileWriter("india.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch = { 'a', 'b', 'c', 'd' };
		bw.write(ch);
		bw.newLine();
		bw.write("welcome");
		bw.newLine();
		bw.write("to ibm");
		bw.flush();
		bw.close();
		fw.close();
	}
}
//fileWriter /n

//BufferedWriter  int 

//PrintWriter-->println
