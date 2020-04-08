package org.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		
		FileReader f = new FileReader("c://Temp//test.txt");
		System.out.println("c:\\Temp\\test.txt를 출력합니다.");
		int c;
		while((c = f.read())!=-1) {
			System.out.print((char)c);
		}
		f.close();
		
	}

}
