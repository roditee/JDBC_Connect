package db8;

import java.util.ArrayList;

// �������̽� : ǥ�� �԰��� ���س��� ��
// �ش� �������̽��� �����ϴ� Ŭ�������� �������̽��� ���ǵ� �߻�޼������ �ݵ�� �������־�� �� (�������̵�)
public interface IStudentDAOdb8 {
	// �߻�޼��� (�ٵ� ����)
	// IStudentDAO �������̽��� �����ϴ� Ŭ�������� �Ʒ� �߻�޼������ �ݵ�� �����ؾ� ��
	public ArrayList<StudentDTOdb8> studentSelect();
	public void insertStudent(StudentDTOdb8 dto);
}