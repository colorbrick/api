package api.util.vector;

import java.util.Vector;

public interface GradeService {

	public void input(GradeVO vo);
	
	public void print();
	
	public String serchGradeByHak(String hak);
	
	public Vector<String> serchGradeByName(String name);
	
	public void descGradeTotal();
	
	public void ascGradeTotal();
	
	
}
