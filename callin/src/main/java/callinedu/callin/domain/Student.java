package callinedu.callin.domain;

public class Student {
	private String studentId;
	private String userName;
	private String studentDegreeCode;
	private String studentDegreeName;
	
	public  Student() {}
	
	public  Student(String studentId, String userName, String studentDegreeCode, String studentDegreeName ) {
		this.studentId = studentId;
		this.userName = userName;
		this.studentDegreeCode = studentDegreeCode;
		this.studentDegreeName = studentDegreeName;
	
	}
	
	

	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getStudentDegreeCode() {
		return studentDegreeCode;
	}
	public void setStudentDegreeCode(String studentDegreeCode) {
		this.studentDegreeCode = studentDegreeCode;
	}
	public String getStudentDegreeName() {
		return studentDegreeName;
	}
	public void setStudentDegreeName(String studentDegreeName) {
		this.studentDegreeName = studentDegreeName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [studentId=");
		builder.append(studentId);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", studentDegreeCode=");
		builder.append(studentDegreeCode);
		builder.append(", studentDegreeName=");
		builder.append(studentDegreeName);
		builder.append("]");
		return builder.toString();
	}


	
	
	




}
