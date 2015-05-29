package api.util.vector;

public class GradeScenario {

	/*
	 성적표 벡터로 작성하기 코딩 시나리오.
	 1. VO, Interface 클래스 다이어그램을 받아든다. 본인이 작성했건 오더를 받았건.
	 	일단 본인이 작성하지 않아서 잘 모르는 상황이라는 설정.
	 	혹은 본인이 하더라도 짐작가는대로 설정한 기능이라는 가정 하에.
	 2. Vo getter, setter .. implement 를 일단 구현한다.
	 3. 보니까 기능 중에 Total 을 구하는 기능이 필요한데..
	 	필요한 것을 보니까 필드에 있는 과목점수가 있어야 겠기에
	 	그냥 VO 내부에 기능을 넣는다. 이 정도 유연성은 개발자에게 있다.
	 4. 일단은 VO는 완성했다고 보고 *.impl 로 간다.
	 5. *Impl() 을 보면서.. 메소드를 분석해본다.
	 	그리고 주석을 자신의 방식대로 적어둔다.
	 	대충 예를 들면
	 	1- input() // 학생별로 성적을 입력 받는 것인가.. 그럼 입력 받아서
	 				  저장할 공간이 필요하겠는데... 배열이 다중 변수를
	 				  저장하는 공간인데 한번 생성하면 추가로 늘릴 수 없으니
	 				  동적으로 확장하는 컬렉션을 선택해야겠군.
	 				  그런데 내가 지금 아는 건 벡터 뿐이니 벡터에 넣어야지.
	 	2- print() // 출력하는 것인가? 그럼 vo 객체의 toString() 가져와야지.
	 	3- searchGradeByHak() //
	 				  학번으로 성적을 조회하는 기능이군
	 				  학번은 오직 한 학생에게만 존재하므로
	 				  리턴값이 String 일테니 벡터의 for loop + 내부에 if를 해봐야겠다.
	 	4- searchGradeByName() //
	 				  이름으로 성적조회인데 리턴값이 벡터인 것을 보니
	 				  복수개의 String 을 처리하게끔 설계되었군.
	 				  리턴값이 하나 든 여러개든 for loop + if 구성밖에는
	 				  벡터 요소 출력로직이 없으니 그걸 써야 겠다.
	 	5- descGradeTotal() //
	 				  내림차순인가보다.
	 				  Collections.sort 쓰면 된다는데 그때 처리해야겠다.
	 	6- ascGradeTotal() //
	 				  오름차순이면 Arrays.sort 를 쓰면 되겠군.
	 				  
	 	메소드마다 공유하는 다수의 값(학생이 여러명이니)이 필요한데,
	 	한군데에 저장할 컬렉션을 필드에 선언해야겠다.
	 	필드에 선언해야 메소드들이 값을 공유할 수 있으니까...
	 6. 대충 만들었으니까 한 번 돌려봐야겠다.
	 	더미값 한 두개 만들어야지.
	 	setter 여러개 쓰기 귀찮으니까
	 	샘플은 생성자로 한 번에 만들어야겠다.
	 		
	  
	 * */
}
