package callinedu.callin.domain;

public class Manager {
	private String managerId;
	private String managerPosition;
	private String contractTypeCode;
	private String adress;
	private String bankCode;
	private String accountNumber;
	private String nameOfDepositor;
	private String dateOfEmployment;
	private String dateOfResignation;
	private String workingStatus;
	private int dependants;
	private int minorChildren;
	private int unitPay;
	private User user;
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getManagerPosition() {
		return managerPosition;
	}
	public void setManagerPosition(String managerPosition) {
		this.managerPosition = managerPosition;
	}
	public String getContractTypeCode() {
		return contractTypeCode;
	}
	public void setContractTypeCode(String contractTypeCode) {
		this.contractTypeCode = contractTypeCode;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
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
	public String getWorkingStatus() {
		return workingStatus;
	}
	public void setWorkingStatus(String workingStatus) {
		this.workingStatus = workingStatus;
	}
	public int getDependants() {
		return dependants;
	}
	public void setDependants(int dependants) {
		this.dependants = dependants;
	}
	public int getMinorChildren() {
		return minorChildren;
	}
	public void setMinorChildren(int minorChildren) {
		this.minorChildren = minorChildren;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getUnitPay() {
		return unitPay;
	}
	public void setUnitPay(int unitPay) {
		this.unitPay = unitPay;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manager [managerId=");
		builder.append(managerId);
		builder.append(", managerPosition=");
		builder.append(managerPosition);
		builder.append(", contractTypeCode=");
		builder.append(contractTypeCode);
		builder.append(", adress=");
		builder.append(adress);
		builder.append(", bankCode=");
		builder.append(bankCode);
		builder.append(", accountNumber=");
		builder.append(accountNumber);
		builder.append(", nameOfDepositor=");
		builder.append(nameOfDepositor);
		builder.append(", dateOfEmployment=");
		builder.append(dateOfEmployment);
		builder.append(", dateOfResignation=");
		builder.append(dateOfResignation);
		builder.append(", workingStatus=");
		builder.append(workingStatus);
		builder.append(", dependants=");
		builder.append(dependants);
		builder.append(", minorChildren=");
		builder.append(minorChildren);
		builder.append(", unitPay=");
		builder.append(unitPay);
		builder.append(", user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
