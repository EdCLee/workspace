package ch09;
public class CharacterEx {
	public static void main(String[] args) {
		char obj[] = { '1', 'a', ' ', '#', 'B' };
		for (int i = 0; i < obj.length; i++) {
			System.out.println("문자 [" + obj[i] + "] :");
			if (Character.isDefined(obj[i]))
				System.out.println(" 유니 코드입니다.");
			if (Character.isDigit(obj[i]))
				System.out.println(" 숫자입니다.");
			if (Character.isLetter(obj[i]))
				System.out.println(" 문자입니다.");
			if (Character.isLowerCase(obj[i]))
				System.out.println(" 소문자 입니다.");
			if (Character.isWhitespace(obj[i]))
				System.out.println(" 공백 입니다.");
			if (Character.isUpperCase(obj[i]))
				System.out.println(" 대문자 입니다.");
			System.out.println("========================");
		}
	}
}