package ch20;
import java.util.*;
import java.util.stream.IntStream;
public class SortingExample {
	public static void main(String[] args) {
		IntStream intStream = 
			Arrays.stream(new int[] { 5, 3, 2, 1, 4 });
		intStream.sorted().forEach(n -> System.out.print(n + ","));
		System.out.println();
		List<Student> studentList = Arrays.asList(
				new Student("ȫ�浿", 30), new Student("�ſ��", 10),
				new Student("���̼�", 20));
		studentList.stream().sorted()
			.forEach(s -> System.out.print(s.getScore() + ","));
		System.out.println();
		studentList.stream().sorted(Comparator.reverseOrder())
			.forEach(s -> System.out.print(s.getScore() + ","));
	}
}