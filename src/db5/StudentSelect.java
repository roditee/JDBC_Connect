package db5;

public class StudentSelect{
	public void select() {
		StudentDAOdb5 stdDAO = new StudentDAOdb5();
		stdDAO.selectStudent();
	}
}
