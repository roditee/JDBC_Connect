package db8;

import java.util.ArrayList;

// �������̽� : ǥ�� �԰��� ���س��� ��
// �ش� �������̽��� �����ϴ� Ŭ�������� �������̽��� ���ǵ� �߻�޼������ �ݵ�� �������־�� �� (�������̵�)
public interface IStudentDAO {
	// �߻�޼��� (�ٵ� ����)
	// IStudentDAO �������̽��� �����ϴ� Ŭ�������� �Ʒ� �߻�޼������ �ݵ�� �����ؾ� ��
	public ArrayList<StudentDTO> studentSelect();
	public void insertStudent(StudentDTO dto);
}
