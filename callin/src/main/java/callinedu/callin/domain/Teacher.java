package callinedu.callin.domain;

public class Teacher {
	private String teacherId;
	private String nationality;
	private String residence;
	private String skypeId;
	private String skypePw;
	private String language;
	private String timeZoneCode;
	private String contractTypeCode;
	private int unitPay;
	private String educationLevel;
	private String employmentStatus;
	private String dateOfEmployment;
	private String dateOfResignation;
	private String introductionText;
	private String introductionVoice;
	private String bankCode;
	private String accountNumber;
	private String nameOfDepositor;
	private String classStartTime;
	private String classEndTime;
	private String subjectInCharge;
	private String workingDayOfWeek;
	private String managerId;
	private String managerInChargeGroup;
	private User user;
	
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getTimeZoneCode() {
		return timeZoneCode;
	}
	public void setTimeZoneCode(String timeZoneCode) {
		this.timeZoneCode = timeZoneCode;
	}
	public String getContractTypeCode() {
		return contractTypeCode;
	}
	public void setContractTypeCode(String contractTypeCode) {
		this.contractTypeCode = contractTypeCode;
	}
	public int getUnitPay() {
		return unitPay;
	}
	public void setUnitPay(int unitPay) {
		this.unitPay = unitPay;
	}
	public String getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	public String getEmploymentStatus() {
		return employmentStatus;
	}
	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	public String getDateOfEmployment() {
		return dateOfEmployment;
	}
	public void setDateOfEmployment(String dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}
	public String getDateOfResignation() {
		return dateOfResignation;
	}
	public void setDateOfResignation(String dateOfResignation) {
		this.dateOfResignation = dateOfResignation;
	}
	public String getIntroductionText() {
		return introductionText;
	}
	public void setIntroductionText(String introductionText) {
		this.introductionText = introductionText;
	}
	public String getIntroductionVoice() {
		return introductionVoice;
	}
	public void setIntroductionVoice(String introductionVoice) {
		this.introductionVoice = introductionVoice;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getNameOfDepositor() {
		return nameOfDepositor;
	}
	public void setNameOfDepositor(String nameOfDepositor) {
		this.nameOfDepositor = nameOfDepositor;
	}
	public String getClassStartTime() {
		return classStartTime;
	}
	public void setClassStartTime(String classStartTime) {
		this.classStartTime = classStartTime;
	}
	public String getClassEndTime() {
		return classEndTime;
	}
	public void setClassEndTime(String classEndTime) {
		this.classEndTime = classEndTime;
	}
	public String getSubjectInCharge() {
		return subjectInCharge;
	}
	public void setSubjectInCharge(String subjectInCharge) {
		this.subjectInCharge = subjectInCharge;
	}
	public String getWorkingDayOfWeek() {
		return workingDayOfWeek;
	}
	public void setWorkingDayOfWeek(String workingDayOfWeek) {
		this.workingDayOfWeek = workingDayOfWeek;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getManagerInChargeGroup() {
		return managerInChargeGroup;
	}
	public void setManagerInChargeGroup(String managerInChargeGroup) {
		this.managerInChargeGroup = managerInChargeGroup;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getSkypeId() {
		return skypeId;
	}
	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}
	public String getSkypePw() {
		return skypePw;
	}
	public void setSkypePw(String skypePw) {
		this.skypePw = skypePw;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", nationality=" + nationality + ", residence=" + residence
				+ ", skypeId=" + skypeId + ", skypePw=" + skypePw + ", language=" + language + ", timeZoneCode="
				+ timeZoneCode + ", contractTypeCode=" + contractTypeCode + ", unitPay=" + unitPay + ", educationLevel="
				+ educationLevel + ", employmentStatus=" + employmentStatus + ", dateOfEmployment=" + dateOfEmployment
				+ ", dateOfResignation=" + dateOfResignation + ", introductionText=" + introductionText
				+ ", introductionVoice=" + introductionVoice + ", bankCode=" + bankCode + ", accountNumber="
				+ accountNumber + ", nameOfDepositor=" + nameOfDepositor + ", classStartTime=" + classStartTime
				+ ", classEndTime=" + classEndTime + ", subjectInCharge=" + subjectInCharge + ", workingDayOfWeek="
				+ workingDayOfWeek + ", managerId=" + managerId + ", managerInChargeGroup=" + managerInChargeGroup
				+ ", user=" + user + "]";
	}


}
