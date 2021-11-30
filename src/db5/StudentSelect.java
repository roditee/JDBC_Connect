package db5;

import java.util.Date;
import java.util.Scanner;

import db3.StudentDAO;
import db3.StudentDTO;

public class StudentSelect{
	public void select() {
		StudentDAOdb5 stdDAO = new StudentDAOdb5();
		stdDAO.selectStudent();
	}
}
