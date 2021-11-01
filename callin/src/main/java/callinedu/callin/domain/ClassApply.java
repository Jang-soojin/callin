package callinedu.callin.domain;

public class ClassApply {
	private String studentId;
	private String regularClassCode;
	private String classStartTime;
	private String classStartDate;
	private String registrationDate;
	private String applyApproveCode;	
	private String applyApproveDate;
	private RegularClass regularClass;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getRegularClassCode() {
		return regularClassCode;
	}
	public void setRegularClassCode(String regularClassCode) {
		this.regularClassCode = regularClassCode;
	}
	public String getClassStartTime() {
		return classStartTime;
	}
	public void setClassStartTime(String classStartTime) {
		this.classStartTime = classStartTime;
	}
	public String getClassStartDate() {
		return classStartDate;
	}
	public void setClassStartDate(String classStartDate) {
		this.classStartDate = classStartDate;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getApplyApproveCode() {
		return applyApproveCode;
	}
	public void setApplyApproveCode(String applyApproveCode) {
		this.applyApproveCode = applyApproveCode;
	}
	public String getApplyApproveDate() {
		return applyApproveDate;
	}
	public void setApplyApproveDate(String applyApproveDate) {
		this.applyApproveDate = applyApproveDate;
	}
	public RegularClass getRegularClass() {
		return regularClass;
	}
	public void setRegularClass(RegularClass regularClass) {
		this.regularClass = regularClass;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClassApply [studentId=");
		builder.append(studentId);
		builder.append(", regularClassCode=");
		builder.append(regularClassCode);
		builder.append(", classStartTime=");
		builder.append(classStartTime);
		builder.append(", classStartDate=");
		builder.append(classStartDate);
		builder.append(", registrationDate=");
		builder.append(registrationDate);
		builder.append(", applyApproveCode=");
		builder.append(applyApproveCode);
		builder.append(", applyApproveDate=");
		builder.append(applyApproveDate);
		builder.append(", regularClass=");
		builder.append(regularClass);
		builder.append("]");
		return builder.toString();
	}
}
