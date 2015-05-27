package api.lang.string;

/*
 * java.lang.String ����
 * split("������") �޼ҵ� 
 * �����ڸ� �������� String ���ڿ��� �и��Ͽ�
 * �迭 ��(ArrayList ����) �� ���� ��� ���.
 * �ڿ� ���ڰ� ������ �ܾ���� ������ �ְ�,
 * ������ ����Ʈ�� �� ������ �ش�.
 * 
 * */

import java.util.Arrays;

public class SplitDemo {
	public static void main(String[] args) {
		String fruit = "apple,banana,cherry,orange";
		String[] fruits = fruit.split(",");
		
		for(int i=0; i < fruits.length; i++){
			System.out.print("\t" + fruits[i]);
		}
		System.out.println();
		System.out.println("split(String, int) ��°��:");
		
		/*
		 * split(String, int)
		 * int ������ŭ ������ �ش�.
		 * �� ������ ����Ʈ�� ��ü ����.
		 * */
		
		String[] fruits2 = fruit.split(",",1);
		System.out.println("���� 1" + Arrays.toString(fruits2));
		String[] fruits3 = fruit.split(",",2);
		System.out.println("���� 2" + Arrays.toString(fruits3));
		String[] fruits4 = fruit.split(",",3);
		System.out.println("���� 3" + Arrays.toString(fruits4));
		String[] fruits5 = fruit.split(",",4);
		System.out.println("���� 4" + Arrays.toString(fruits5));
		String[] fruits6 = fruit.split(",");
		System.out.println("���� 0" + Arrays.toString(fruits6));
	}
}