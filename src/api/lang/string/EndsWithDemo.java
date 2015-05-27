package api.lang.string;

/*
 * java.lang.String
 * endsWith(s) : s 로 끝나는지 여부 체크
 * */

public class EndsWithDemo {
	public static void main(String[] args) {
		System.out.println(
				"Hello.txt".endsWith("txt") ? "txt 파일입니다." : "txt파일이 아닙니다."
				);
	}
}
