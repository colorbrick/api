package api.util.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeSortMain {
	public static void main(String[] args) {
		List<GradeVO> grades = new ArrayList<GradeVO>();

		GradeVO g1 = new GradeVO("2015","ȫ�浿",90,80,70);
		GradeVO g2 = new GradeVO("2012","��浿",100,40,50);
		GradeVO g3 = new GradeVO("2011","�ֱ浿",60,20,40);
		GradeVO g4 = new GradeVO("2014","���浿",50,70,10);
		
		grades.add(g1);
		grades.add(g2);
		grades.add(g3);
		grades.add(g4);
		/*
		 * anonymous ������ ó�� : �� �� ���� ���� �����ڴ�.
		 * */
		
		System.out.println("�̸� �������� ����");
		Collections.sort(grades, new NameAscCompareImpl());
		for(GradeVO grade : grades){
//			System.out.println(grade);
		}
		
		System.out.println("�̸� �������� ����");
		Collections.sort(grades, new NameDescCompareImpl());
		for(GradeVO grade : grades){
//			System.out.println(grade);
		}
		
		System.out.println("���� �������� ����");
		Collections.sort(grades, new TotalAscCompareImpl());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		
		System.out.println("���� �������� ����");
		Collections.sort(grades, new TotalDescCompareImpl());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
	}
}
