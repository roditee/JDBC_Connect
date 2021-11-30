package db5;

public class StudentDTO {
	private String stdNo;
	private String stdName;
	private int stdYear;
	private String stdAddress;
	private String stdBirthDay;
	private String dptNo;
	
	// 매개변수가 있는 생성자
	// 모든 멤버변수 초기화
	public StudentDTO(String stdNo, String stdName, int stdYear, String stdAddress, String stdBirthDay, String dptNo) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.stdYear = stdYear;
		this.stdAddress = stdAddress;
		this.stdBirthDay = stdBirthDay;
		this.dptNo = dptNo;
	}
	
	// Setters / Getters
	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdYear() {
		return stdYear;
	}

	public void setStdYear(int stdYear) {
		this.stdYear = stdYear;
	}

	public String getStdAddress() {
		return stdAddress;
	}

	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}

	public String getStdBirthDay() {
		return stdBirthDay;
	}

	public void setStdBirthDay(String stdBirthDay) {
		this.stdBirthDay = stdBirthDay;
	}

	public String getDptNo() {
		return dptNo;
	}

	public void setDptNo(String dptNo) {
		this.dptNo = dptNo;
	}

	@Override
	public String toString() {
		// 한꺼번에 문자열을 저장해서 전달하기 위해 StringBuider 클래스 사용
		// 기존 문자열에 더하는 방식
		StringBuilder builder = new StringBuilder();
		builder.append(stdNo);
		builder.append("\t");
		builder.append(stdName);
		builder.append("\t");
		builder.append(stdYear);
		builder.append("\t");
		builder.append(stdAddress);
		builder.append("\t");
		builder.append(stdBirthDay);
		builder.append("\t");
		builder.append(dptNo);
		return builder.toString();
	}
}
