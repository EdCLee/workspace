package ch16;
import java.io.*;

public class RandomEx {
	public static void main(String[] args) throws IOException {
		File file = new File("ran.txt");
		FileOutputStream fos = new FileOutputStream(file);
		for(int i=1; i<=100; i++) {
			fos.write(i);
		}
		fos.close();
		
		RandomAccessFile raf = new RandomAccessFile ("ran.txt","rw");
		for(int i=0; i<=100; i+=10) { //+=10�� 10�� ����.
			raf.seek(i);
			System.out.println(raf.readByte()+"\t");
		}
		raf.close();
	}
}
