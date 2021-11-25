package db3;

public class StudentDTO {
	// ������ ��ȣ�� ���� private���� �����ϰ� setter, getter ���
	private String stdNo;
	private String stdName;
	private int stdYear;
	private String stdAddress;
	private String stdBirthDay;
	private String dptNo;
	
	// �Ű������� �ִ� ������
	// ��� ������� �ʱ�ȭ
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
}