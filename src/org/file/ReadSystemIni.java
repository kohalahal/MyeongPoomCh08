package org.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadSystemIni {
	public static void main(String[] args) throws IOException {
		
		BufferedReader f = new BufferedReader(new FileReader("c:/windows/system.ini"));
		String l;
		while((l=f.readLine())!=null) {
		System.out.print(l.toUpperCase());
		}
	}

}
