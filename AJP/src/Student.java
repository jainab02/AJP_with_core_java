public class Student {
	private String studentName;
	private String enrollmentNo;
	private String mobileNo;
	private double cpi;

	public Student() {
		// Default constructor
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEnrollmentNo() {
		return enrollmentNo;
	}

	public void setEnrollmentNo(String enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public double getCpi() {
		return cpi;
	}

	public void setCpi(double cpi) {
		this.cpi = cpi;
	}
}
