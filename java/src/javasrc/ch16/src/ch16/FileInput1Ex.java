package ch16;
import java.io.*;
import java.util.Scanner;

public class FileInput1Ex {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("읽을 파일명 ?");
	String fileName = sc.nextLine();
	FileInputStream fis = new FileInputStream(fileName);
	int data = 0;
	while((data=fis.read()) != -1) {
		System.out.print((char)data);
	}
	fis.close();
	sc.close();
	}
}
