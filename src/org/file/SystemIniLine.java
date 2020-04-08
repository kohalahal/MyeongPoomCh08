package org.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SystemIniLine {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new FileReader("c:/windows/system.ini"));
		
		String s;
		int i = 1;
		while(sc.hasNextLine()) {
			System.out.println(i+++": "+sc.nextLine());
			
			
			
		}
		
	}

}
