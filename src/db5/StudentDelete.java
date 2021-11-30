package db5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import db3.StudentDAO;
import db3.StudentDTO;

public class StudentDelete {
	public void delete() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 정보 삭제");
		System.out.println("----------------------\n");
		
		System.out.print("삭제할 학생의 학번 입력 : ");
		String stdNo = sc.next();
		
		StudentDAOdb5 stdDAO = new StudentDAOdb5();
		stdDAO.deleteStudent(stdNo);
	}
}
