package api.lang.string;

/*
 * java.lang.String �޼ҵ�
 * replace("old","new") : String ���ڿ����� "old" ���ڸ�
 * "new" ���ڷ� ��ü�Ѵ�.
 * ����, ��ü�ϴ� ���ڰ� �����̸� replaceAll() �� ����Ѵ�
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
		// .�� ������ ���ԽĿ��� ���̴µ� �Ǿ� �� ���ڸ� �����մϴ�.
		// �׷��ϱ� ����ǥ�� �ΰ� �ִµ� �տ� �� �� �ѳ༮�� ����ڴٴ� �ǹ��̰�,
		// �� ����� replaceAll()���Ը� �ֽ��ϴ�.
		// ���� replace() ���ٴ� ���Խı��� ó�� ������ replaceAll()�� �����
		// �����մϴ�.
	}
}
