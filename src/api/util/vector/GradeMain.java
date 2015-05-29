package api.util.vector;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeMain gm = new GradeMain();
		gm.inputStudent();
		
	}

	public static void inputStudent() {
		GradeVO vo1 = new GradeVO();
		vo1.setHak("1501");
		vo1.setKor(80);
		vo1.setEng(60);
		vo1.setMath(50);
		vo1.setName("홍길동");
		GradeVO vo2 = new GradeVO();
		vo2.setHak("1502");
		vo2.setKor(90);
		vo2.setEng(70);
		vo2.setMath(40);
		vo2.setName("이길동");
		GradeVO vo3 = new GradeVO();
		vo3.setHak("1503");
		vo3.setKor(70);
		vo3.setEng(50);
		vo3.setMath(90);
		vo3.setName("김길동");
		
		GradeService service = new GradeServiceImpl();
		service.input(vo1);
		service.input(vo2);
		service.input(vo3);

		System.out.println("1502 번의 성적 조회 " + service.serchGradeByHak("1502"));
		// 컬렉션 내부의 <클래스 타입>을 제네릭이라고 칭함
		// 특별한 기능을 말하는 것은 아니고 컬렉션 내부에서
		// 타입 캐스팅을 한다라고 간단하게 정리해도 됨.
		
		Vector<String> vc = service.serchGradeByName("김길동");
		
		for(int i = 0 ; i < vc.size(); i++){
			System.out.println(vc.elementAt(i));
		}
		
	}
}
