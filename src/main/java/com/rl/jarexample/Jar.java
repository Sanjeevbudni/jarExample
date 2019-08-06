package com.rl.jarexample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Jar {

	public static void main(String[] args) throws IOException{

		File f= new File("abc.txt");
		f.createNewFile();
		FileWriter f1 = new FileWriter(f);
		f1.write("Hi abhi bro");
		f1.close();
	}

}
