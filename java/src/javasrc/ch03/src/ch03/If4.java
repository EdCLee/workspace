package ch03;

public class If4 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = ""; //println �߰��� grade�� ���� �Ǿ�� �ϱ� ������ �ۼ�
		if (score >= 90) { grade = "A"; } //90���� ũ��?
		else if (score >= 80) { grade = "B"; } //�ƴѸ� 80���� ũ��?
		else if (score >= 70) { grade = "C"; } //�ƴϸ� 70���� ũ��?
		else if (score >= 60) {	grade = "D"; } //�ƴϸ� 60���� ũ��?
		else {	grade = "�ٽ� �¾�� �ȵ�"; } //������
		
		System.out.println("����� ������ "+grade+"�Դϴ�");		
		
	}

}