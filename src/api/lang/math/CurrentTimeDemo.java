package api.lang.math;

import java.sql.Date;
import java.text.SimpleDateFormat;

/*
 * java.lang.System �� ����
 * currentTimeMillis() ��
 * ROM�� ����� �ð��� �����Ѵ�.
 * */

public class CurrentTimeDemo {
	public static void main(String[] args) {
		long curTime = System.currentTimeMillis();
		System.out.println("curTime : " + curTime);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		/*
		 * new Date() �ÿ� import ������ �ΰ��� �ε�
		 * �� �� java.util.Date �� �����Ѵ�.
		 * */
		
		String nowTime = sdf.format(new Date(curTime));
		System.out.println("����ð� : " + nowTime);
	}
}
