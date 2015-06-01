package api.util.collections;

import java.util.Vector;

public interface GradeService {
	
	/*
	 * vo ��ü�� ���Ϳ� �����ϴ� ���
	 * */
	public void input(GradeVO vo);
	
	public void print();

	
	/*
	 * �й��� �̿��ؼ�
	 * */
	public String serchGradeByHak(String hak);
	
	public Vector<String> serchGradeByName(String name);
	
	public void descGradeTotal();
	
	public void ascGradeTotal();
	
	
}
