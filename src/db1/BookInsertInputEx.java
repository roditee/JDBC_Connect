package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

// 콘솔에서 데이터 입력받아 도서 테이블에 저장

public class BookInsertInputEx {

	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("도서 정보 등록");
		System.out.println("----------------------\n");
		
		System.out.print("도서번호 입력 : ");
		String bookNo = sc.nextLine();
		
		System.out.print("도서명 입력 : ");
		String bookName = sc.nextLine();
		
		System.out.print("저자 입력 : ");
		String bookAuthor = sc.nextLine();
		
		System.out.print("가격 입력 : ");
		int bookPrice = sc.nextInt();
		sc.nextLine();
//		int bookPrice = Integer.parseInt(sc.nextLine());
		
		System.out.print("발행일 입력 : ");
		String bookDate = sc.nextLine();
		
		System.out.print("재고 입력 : ");
		int bookStock = sc.nextInt();
		sc.nextLine();
//		int bookStock = Integer.parseInt(sc.nextLine());
		
		System.out.print("출판사번호 입력 : ");
		String pubNo = sc.nextLine();
		
		// DB 연동
		try {
			// JDBC 드라이버 로드 (Properties-Java Build Path에 추가해뒀음)
			// JDBC 드라이버 클래스의 객체 생성 런타임 시 로드
			// 이클립스 실행 시 자동 로드 시켜줘서 없어도 무방한 코드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//연결 url 주소, 사용자 계정, 패스워드 문자열 변수 설정
			String url = "jdbc:mysql://localhost:3306/sqldb3?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			// DB 연결을 위한 객체 생성
			// DriverManager를 통해  Connection 객체 생성
			//MySQL 서버 연결 : 주소, 사용자 계정, 패스워드 전송
			Connection con = DriverManager.getConnection(url, user, pwd);
			
			// Connection 객체가 생성되면 DB 연결 성공
			if (con != null) {
				System.out.println("DB 연결 성공!");
			}
			// DB 연결 완료
			
			// sql문 작성
			// 들어갈 데이터의 개수만큼 ? 맞춰줌
			String sql = "insert into book values(?, ?, ?, ?, ?, ?, ?)";
			
			// sql문 values에 들어갈 ? 데이터 설정
			// Connection 인터페이스의 PrepareStatement() 메소드 사용하여 객체 생성
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bookNo);
			pstmt.setString(2, bookName);
			pstmt.setString(3, bookAuthor);
			pstmt.setInt(4, bookPrice);
			pstmt.setString(5, bookDate);
			pstmt.setInt(6, bookStock);
			pstmt.setString(7, pubNo);
			
			// 쿼리문 실행 : 영향을 받은 행의 수 반환
			// 쿼리문 실행시키고 결과 받아옴
			// select 구문은 executeQuery() 메서드 사용했지만
			// insert, update, delete 연산은 executeUpdate() 메서드 사용하여 영향받은 행의 수 반환
			int result = pstmt.executeUpdate();
			
			if (result > 0) {
				System.out.println("데이터 입력 성공!");
			}
			
			// 모든 객체 close() : 리소스 반납
			pstmt.close();
			con.close();
			sc.close();
			
		} catch (Exception e) {
			System.out.println("오류 발생!");
			e.printStackTrace();
		}
		// DB에 저장
	}

}
