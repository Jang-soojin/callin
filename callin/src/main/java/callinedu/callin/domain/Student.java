package callinedu.callin.domain;

public class Student {
	private String studentId;
	private String studentName;
	private String degreeName;
	public  Student() {}
	
	public  Student(String studentId, String studentName, String degreeName ) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.degreeName = degreeName;
	
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDegreeName() {
		return degreeName;
	}
	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("student [studentId=");
		builder.append(studentId);
		builder.append(", studentName=");
		builder.append(studentName);
		builder.append(", degreeName=");
		builder.append(degreeName);
		builder.append("]");
		return builder.toString();
	}
	
	
	




}
