package api.lang.object;

/*
�ؽ�(hashing) ����� ���Ǵ� �ؽ��Լ� (hash function) �� ������ ��.
�ؽ��� �ٷ��� �����͸� �����ϰ� �˻��ϴµ� ���Ǵ� ������ �������.
ex) Ʈ���Ϳ��� �ؽ��±׸� �Խñۿ� ÷���ϴ� ��.
	 ������ �ؽ��±װ� ÷�ε� �Խñ��� ������ �ؽ��±�(�ּҰ�) �� �����ϰԵǾ�
	 �˻��� ������ ������� �����ϴ� ����� �Ѵ�.
* */

public class HashCodeDemo {
	public static void main(String[] args) {
		String abcd = new String("abcd");
		String abcd2 = "abcd";
		System.out.println("abcd�� �ؽ��±� : " + abcd.hashCode());
		System.out.println("abcd2�� �ؽ��±� : " + abcd2.hashCode());

		/*
		 * abc�� �ؽ��±� : 96354
		 * abc2�� �ؽ��±� : 96354
		 * ������� �� ó�� ���´�.
		 * �ᱹ String Ÿ���� new String("abc")ó��
		 * �����ڸ� ���� �����̳�, ""ó�� ���ͷ� ������ �����̳�
		 * ������ �ּҰ��� �����ٴ� ���� �� �� �ִ�.
		 * ��� ��ü ��, �����ϰ� String �� �� ���� Ư¡�� ������.
		 * */
	}

	
}
