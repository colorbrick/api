package api.util.collections;

import java.util.Vector;

public interface GradeService {
	
	/*
	 * vo 객체를 벡터에 저장하는 기능
	 * */
	public void input(GradeVO vo);
	
	public void print();

	
	/*
	 * 학번을 이요해서
	 * */
	public String serchGradeByHak(String hak);
	
	public Vector<String> serchGradeByName(String name);
	
	public void descGradeTotal();
	
	public void ascGradeTotal();
	
	
}
