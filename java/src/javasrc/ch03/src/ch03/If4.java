package ch03;

public class If4 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = ""; //println 중간에 grade가 포함 되어야 하기 때문에 작성
		if (score >= 90) { grade = "A"; } //90보다 크냐?
		else if (score >= 80) { grade = "B"; } //아닌면 80보다 크냐?
		else if (score >= 70) { grade = "C"; } //아니면 70보다 크냐?
		else if (score >= 60) {	grade = "D"; } //아니면 60보다 크냐?
		else {	grade = "다시 태어나도 안됨"; } //나머지
		
		System.out.println("당신의 학점은 "+grade+"입니다");		
		
	}

}
