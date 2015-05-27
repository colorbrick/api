package api.lang.object;

/*
 * java.lang.Object �� �޼ҵ�
 * equals() : ���� ������ ���θ� üũ
 * �ν��Ͻ� ������ �ؽ��ڵ� ��(���ּҰ�) �� ���ϴ� �޼ҵ�
 * */

public class EqualsDemo {
	public static void main(String[] args) {
		Temp t1 = new Temp(10);
		Temp t2 = new Temp(10);
		// result �� �������� �̱� ������
		// �ݵ�� !!!!! �ʱ�ȭ�� �ؾ��Ѵ�.
		String result = "";
		/* if(){} else{} �� ���´� �ϵ��ڵ����� �ͼ������ž� �մϴ�. 
		if(t1.equals(t2)){
			System.out.println("T1 �� T2�� ���� ����.");
		}else{
			System.out.println("T1 �� T2�� ���� �ٸ���.");
		}
		*/

		/*
		 * ���׿����ڴ� if-else �� ��ü�ϴ� �����̴�.
		 * ������
		 * (���ǽ�) ? "���ΰ��" : "�����ΰ��"
		 * */
		result = (t1.equals(t2)) ? "T1 �� T2�� ���� ����." : "T1 �� T2�� ���� �ٸ���." ;
		System.out.println("�����ڸ� ���� ������ �������� ���� �� : " + result);
		
		t2 = t1;
		result = (t1.equals(t2)) ? "T1 �� T2�� ���� ����." : "T1 �� T2�� ���� �ٸ���." ;
		System.out.println("�������� ������ �Ҵ�� ���� ���� ���� �� : " + result);
	}
}

class Temp{
	int num; // �ʵ忡 �ִ� �ν��Ͻ� ������ �ʱ�ȭ�� �ʿ� ����.
	public Temp(int num){
		this.num = num;
		/* 
		 * ��� ���´� ���� ����� �ν��Ͻ� ������ 
		 * �� ���ÿ� �ִ� num ���������� �Ҵ�� ����
		 * �ν��Ͻ� ������ �Ѱ��ְ� ����(����)���� �ڽ���
		 * ������� �ó������� ����ȴ�.
		 */
	}
}