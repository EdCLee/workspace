package ch16;

import java.io.*;

public class File2Ex {
	public static void main(String[] args) {
		//File dir = new File(".");
		File dir = new File("../ch15/src/ch15"); //��� ��
		//File dir = new File();
		File dir2 = new File("/Users/JAMESCH/Desktop/java/src/javaSrc/ch15/src/ch15"); //���� ���
		
		String[] list = dir.list();
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		System.out.println("=================");
		String[] list2 = dir2.list();
		for(int i=0; i<list2.length; i++) {
			System.out.println(list2[i]);
		}
		
	}

}

/*
1. ch15-src-ch15�ִ� ��� File2Ex
2. javaSrc ��� File3Ex
*/