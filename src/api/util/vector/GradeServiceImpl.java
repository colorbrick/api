package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	
	private Vector<GradeVO> grades = new Vector<GradeVO>();

	@Override
	public void input(GradeVO vo) {
		grades.add(vo);
	}

	/*
	 * 성적표를 출력하는 메소드
	 * vo.toString() 으로 처리 예상하고 있음.
	 * */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * 학번으로 검색하는 기능을 가진 메소드
	 * */
	@Override
	public String serchGradeByHak(String hak) {
		// GradeVo vo = new GradeVO();
		String result = "";
		// 벡터는 size()로 limit를 표시한다
		// 확장된 for 문은 조건식 타입이 (타입 참조변수 : 콜렉션)
		for(GradeVO vo : grades ){ 
			if(vo.getHak().equalsIgnoreCase(hak)){
				return vo.toString();
			} else {
				result = "조회된 학번에 해당하는 학생이 없습니다.";
			}
		}
		return result;
	}
	
	/*
	 * 이름으로 성적을 검색해서 출력하는 메소드
	 * */
	@Override
	public Vector<String> serchGradeByName(String name) {
		Vector<String> vc = new Vector<String>();
		// 벡터나 기타 컬렉션 출력을 하게 되면..
		// 이터레이터 아니면 확장 for문으로 처리한다.
		// 왜냐면 확장 for 문은 인덱스를 따지지 않기 때문이다.
		/*
		 * grades 를 쓸 수 있는 이유는 멤버필드에 선언하여
		 * 같은 클래스 내부의 메소드들이 값을 공유하기 때문이다.
		 * */
		for(GradeVO vo : grades){
			if(vo.getName().equalsIgnoreCase(name)){
				/*
				 * 파라미터로 넘어온 이름과 동일한 vo 객체를 
				 * 찾아서 String 형태로 벡터에 저장한다.
				 * 즉, vc는 String 타잉이란 것 주의하세요.
				 * GradeVO 타입이 아닙니다.
				 * */
				vc.add(vo.toString());
			}
		}
		return vc;   // 리턴값은 성적 정보를 저장한 벡터이다.
	}

	/*
	 * 종합점수 기준으로 내림차순으로 정렬시키는 메소드
	 * */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}

	/*
	 * 종합점수 기준으로 오름차순으로 정렬시키는 메소드
	 * */
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}


	

}
