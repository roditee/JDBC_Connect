package db8;

import java.util.ArrayList;

// 인터페이스 : 표준 규격을 정해놓은 것
// 해당 인터페이스를 구현하는 클래스에서 인터페이스에 정의된 추상메서드들을 반드시 구현해주어야 함 (오버라이드)
public interface IStudentDAOdb8 {
	// 추상메서드 (바디 없음)
	// IStudentDAO 인터페이스를 구현하는 클래스에서 아래 추상메서드들을 반드시 구현해야 함
	public ArrayList<StudentDTOdb8> studentSelect();
	public void insertStudent(StudentDTOdb8 dto);
}