package db8;

import java.util.ArrayList;

public class StudentSelectdb8 {
public void select() {
		
		// DAO 객체 생성하면서 DB 연결 
		// 객체 생성될 때 생성자 호출되면서 DB 연결
		StudentDAOdb8 stdDAO = new StudentDAOdb8();
		
		// (2) 학생 정보 조회 : StudentDAO 클래스의 selectStudent() 메서드 호출
		//객체.메서드
		ArrayList<StudentDTOdb8> dataSet = new ArrayList<StudentDTOdb8>();
		dataSet = stdDAO.studentSelect(); // 반환값 받아야 함
		
		System.out.println("\n제목 출력 - 각자 출력");
		
		for(StudentDTOdb8 dto : dataSet) {
			System.out.println(dto);
		}
	}
}
