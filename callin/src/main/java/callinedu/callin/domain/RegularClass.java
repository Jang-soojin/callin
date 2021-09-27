package callinedu.callin.domain;

public class RegularClass {
	private String regularClassCode;
	private String classPolicyCode;
	private String courseName;
	private String courseLanguage;
	private String managerId;
	private String courseTuition;
	public String getRegularClassCode() {
		return regularClassCode;
	}
	public void setRegularClassCode(String regularClassCode) {
		this.regularClassCode = regularClassCode;
	}
	public String getClassPolicyCode() {
		return classPolicyCode;
	}
	public void setClassPolicyCode(String classPolicyCode) {
		this.classPolicyCode = classPolicyCode;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseLanguage() {
		return courseLanguage;
	}
	public void setCourseLanguage(String courseLanguage) {
		this.courseLanguage = courseLanguage;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getCourseTuition() {
		return courseTuition;
	}
	public void setCourseTuition(String courseTuition) {
		this.courseTuition = courseTuition;
	}
	@Override
	public String toString() {
		return "RegularClass [regularClassCode=" + regularClassCode + ", classPolicyCode=" + classPolicyCode
				+ ", courseName=" + courseName + ", courseLanguage=" + courseLanguage + ", managerId=" + managerId
				+ ", courseTuition=" + courseTuition + "]";
	}
}
