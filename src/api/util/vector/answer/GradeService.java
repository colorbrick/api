package api.util.vector.answer;

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
	public String searchGradeByHak(String hak);
	
	public Vector<String> searchGradeByName(String name);
	
	public void descGradeTotal();
	
	public void ascGradeTotal();
	
	
}
