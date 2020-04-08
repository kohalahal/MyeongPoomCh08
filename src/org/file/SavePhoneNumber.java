package org.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SavePhoneNumber {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("전화 번호 입력 프로그램입니다.");
		ArrayList<People> s = new ArrayList<>();
		
		while(true) {
			System.out.print("이름 전화번호 >>");
			String qq = sc.nextLine();
			if(qq.equals("그만")) break;
			String[] q = new String[2];
			q=qq.split(" ");
			s.add(new People(q[0], q[1]));
		}
		FileWriter f = new FileWriter("c:\\Temp\\test.txt");
		
		for(People p :s) {
			f.write(p.toString());
			
		}
		f.close();
		System.out.println("c:\\Temp\\test.txt에 저장하였습니다.");
		
	}

}

class People {
	String name;
	String phone;
	public People(String s , String ss) {
		name = s;
		phone = ss;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+phone+"\n";
	}
	
}
