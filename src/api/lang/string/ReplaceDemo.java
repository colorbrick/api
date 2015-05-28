package api.lang.string;

/*
 * java.lang.String 메소드
 * replace("old","new") : String 문자열에서 "old" 글자를
 * "new" 글자로 대체한다.
 * 만약, 대체하는 글자가 복수이면 replaceAll() 을 사용한다
 * */

public class ReplaceDemo {
	public static void main(String[] args) {

		System.out.println("[1] A B C D : A B C D".replace("C D", "E F"));
		System.out.println("[2] A B C D : A B C D".replaceAll("C D", "E F"));
		
		System.out.println("[3] Hello Java !a!".replace("!", ""));
		System.out.println("[4] Hello Java !a!a!".replaceAll(".!", ""));
		System.out.println("[5] Hello Java !a!a!a!".replaceAll(".!", ""));
		System.out.println("[5] Hello Java !a!a!a!a!".replaceAll(".!", ""));
		System.out.println("[5] Hello Java !a!a!a!a!a!".replaceAll(".!", ""));
		System.out.println("[5] Hello Java !a!a!a!a!a!a!".replaceAll(".!", ""));
		System.out.println("[5] Hello Java !a!a!a!a!a!a!a!".replaceAll(".!", ""));
		// .의 역할은 정규식에서 쓰이는데 맨앞 한 글자만 지정합니다.
		// 그러니까 느낌표가 두개 있는데 앞에 맨 뒷 한녀석만 남기겠다는 의미이고,
		// 이 기능은 replaceAll()에게만 있습니다.
		// 따라서 replace() 보다는 정규식까지 처리 가능한 replaceAll()을 쓰라고
		// 권장합니다.
	}
}
