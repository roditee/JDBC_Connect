package db8;

import java.util.ArrayList;

public class StudentSelectdb8 {
public void select() {
		
		// DAO ��ü �����ϸ鼭 DB ���� 
		// ��ü ������ �� ������ ȣ��Ǹ鼭 DB ����
		StudentDAOdb8 stdDAO = new StudentDAOdb8();
		
		// (2) �л� ���� ��ȸ : StudentDAO Ŭ������ selectStudent() �޼��� ȣ��
		//��ü.�޼���
		ArrayList<StudentDTOdb8> dataSet = new ArrayList<StudentDTOdb8>();
		dataSet = stdDAO.studentSelect(); // ��ȯ�� �޾ƾ� ��
		
		System.out.println("\n���� ��� - ���� ���");
		
		for(StudentDTOdb8 dto : dataSet) {
			System.out.println(dto);
		}
	}
}
