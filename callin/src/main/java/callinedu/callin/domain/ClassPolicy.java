package callinedu.callin.domain;

public class ClassPolicy {
	private String classPolicyCode;
	private String classPolicyName;
	private int classPeriod;
	private String classDay;
	private String classTime;
	private int classPostponeDay;
	private int classPostponeDays;
	private int classPostponePeriod;
	private String modifyDate;
	private String modifyUser;
	
	public String getClassPolicyName() {
		return classPolicyName;
	}
	public void setClassPolicyName(String classPolicyName) {
		this.classPolicyName = classPolicyName;
	}
	public String getClassPolicyCode() {
		return classPolicyCode;
	}
	public void setClassPolicyCode(String classPolicyCode) {
		this.classPolicyCode = classPolicyCode;
	}
	public int getClassPeriod() {
		return classPeriod;
	}
	public void setClassPeriod(int classPeriod) {
		this.classPeriod = classPeriod;
	}
	public String getClassDay() {
		return classDay;
	}
	public void setClassDay(String classDay) {
		this.classDay = classDay;
	}
	public String getClassTime() {
		return classTime;
	}
	public void setClassTime(String classTime) {
		this.classTime = classTime;
	}
	public int getClassPostponeDay() {
		return classPostponeDay;
	}
	public void setClassPostponeDay(int classPostponeDay) {
		this.classPostponeDay = classPostponeDay;
	}
	public int getClassPostponeDays() {
		return classPostponeDays;
	}
	public void setClassPostponeDays(int classPostponeDays) {
		this.classPostponeDays = classPostponeDays;
	}
	public int getClassPostponePeriod() {
		return classPostponePeriod;
	}
	public void setClassPostponePeriod(int classPostponePeriod) {
		this.classPostponePeriod = classPostponePeriod;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getModifyUser() {
		return modifyUser;
	}
	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}
	@Override
	public String toString() {
		return "ClassPolicy [classPolicyCode=" + classPolicyCode + ", classPolicyName=" + classPolicyName
				+ ", classPeriod=" + classPeriod + ", classDay=" + classDay + ", classTime=" + classTime
				+ ", classPostponeDay=" + classPostponeDay + ", classPostponeDays=" + classPostponeDays
				+ ", classPostponePeriod=" + classPostponePeriod + ", modifyDate=" + modifyDate + ", modifyUser="
				+ modifyUser + "]";
	}
}
