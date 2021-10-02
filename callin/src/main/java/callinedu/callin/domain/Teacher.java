package callinedu.callin.domain;

public class Teacher {
	private String teacherId;
	private String nationality;
	private String residence;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teacher [teacherId=");
		builder.append(teacherId);
		builder.append(", nationality=");
		builder.append(nationality);
		builder.append(", residence=");
		builder.append(residence);
		builder.append(", language=");
		builder.append(language);
		builder.append(", timeZoneCode=");
		builder.append(timeZoneCode);
		builder.append(", contractTypeCode=");
		builder.append(contractTypeCode);
		builder.append(", unitPay=");
		builder.append(unitPay);
		builder.append(", educationLevel=");
		builder.append(educationLevel);
		builder.append(", employmentStatus=");
		builder.append(employmentStatus);
		builder.append(", dateOfEmployment=");
		builder.append(dateOfEmployment);
		builder.append(", dateOfResignation=");
		builder.append(dateOfResignation);
		builder.append(", introductionText=");
		builder.append(introductionText);
		builder.append(", introductionVoice=");
		builder.append(introductionVoice);
		builder.append(", bankCode=");
		builder.append(bankCode);
		builder.append(", accountNumber=");
		builder.append(accountNumber);
		builder.append(", nameOfDepositor=");
		builder.append(nameOfDepositor);
		builder.append(", classStartTime=");
		builder.append(classStartTime);
		builder.append(", classEndTime=");
		builder.append(classEndTime);
		builder.append(", subjectInCharge=");
		builder.append(subjectInCharge);
		builder.append(", workingDayOfWeek=");
		builder.append(workingDayOfWeek);
		builder.append(", managerId=");
		builder.append(managerId);
		builder.append(", managerInChargeGroup=");
		builder.append(managerInChargeGroup);
		builder.append(", getTeacherId()=");
		builder.append(getTeacherId());
		builder.append(", getNationality()=");
		builder.append(getNationality());
		builder.append(", getResidence()=");
		builder.append(getResidence());
		builder.append(", getLanguage()=");
		builder.append(getLanguage());
		builder.append(", getTimeZoneCode()=");
		builder.append(getTimeZoneCode());
		builder.append(", getContractTypeCode()=");
		builder.append(getContractTypeCode());
		builder.append(", getUnitPay()=");
		builder.append(getUnitPay());
		builder.append(", getEducationLevel()=");
		builder.append(getEducationLevel());
		builder.append(", getEmploymentStatus()=");
		builder.append(getEmploymentStatus());
		builder.append(", getDateOfEmployment()=");
		builder.append(getDateOfEmployment());
		builder.append(", getDateOfResignation()=");
		builder.append(getDateOfResignation());
		builder.append(", getIntroductionText()=");
		builder.append(getIntroductionText());
		builder.append(", getIntroductionVoice()=");
		builder.append(getIntroductionVoice());
		builder.append(", getBankCode()=");
		builder.append(getBankCode());
		builder.append(", getAccountNumber()=");
		builder.append(getAccountNumber());
		builder.append(", getNameOfDepositor()=");
		builder.append(getNameOfDepositor());
		builder.append(", getClassStartTime()=");
		builder.append(getClassStartTime());
		builder.append(", getClassEndTime()=");
		builder.append(getClassEndTime());
		builder.append(", getSubjectInCharge()=");
		builder.append(getSubjectInCharge());
		builder.append(", getWorkingDayOfWeek()=");
		builder.append(getWorkingDayOfWeek());
		builder.append(", getManagerId()=");
		builder.append(getManagerId());
		builder.append(", getManagerInChargeGroup()=");
		builder.append(getManagerInChargeGroup());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


}
