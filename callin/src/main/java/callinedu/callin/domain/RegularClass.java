package callinedu.callin.domain;

public class RegularClass {
	private String regularClassCode;
	private String classPolicyCode;
	private String courseName;
	private String courseLanguage;
	private String managerId;
	private String courseTuition;
	private ClassPolicy classPolicy;
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
	public ClassPolicy getClassPolicy() {
		return classPolicy;
	}
	public void setClassPolicy(ClassPolicy classPolicy) {
		this.classPolicy = classPolicy;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegularClass [regularClassCode=");
		builder.append(regularClassCode);
		builder.append(", classPolicyCode=");
		builder.append(classPolicyCode);
		builder.append(", courseName=");
		builder.append(courseName);
		builder.append(", courseLanguage=");
		builder.append(courseLanguage);
		builder.append(", managerId=");
		builder.append(managerId);
		builder.append(", courseTuition=");
		builder.append(courseTuition);
		builder.append(", classPolicy=");
		builder.append(classPolicy);
		builder.append("]");
		return builder.toString();
	}
}
