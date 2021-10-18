package callinedu.callin.domain;

public class ManagerSalarySettlement {
	
	private String managerSalarySettlementCode;
	private String managerId;
	private int baseSalary;
	private int bonus;
	private int mealAllowance;
	private int vehicleExpenses;
	private int otherAllowance;
	private int otherDeduction;
	private int totalSalaryPreTax;
	private int totalSalaryTaxFree;
	private int incomeTax;
	private int localIncomeTax;
	private int nationalPension;
	private int healthInsurance;
	private int longTermCareInsurance;
	private int employmentInsurance;
	private int totalDeduction;
	private int totalSalaryAfterTax;
	private String settlementDate;
	private String settlementVerifierId;
	private String settlementYearMonth;
	
	public String getManagerSalarySettlementCode() {
		return managerSalarySettlementCode;
	}
	public void setManagerSalarySettlementCode(String managerSalarySettlementCode) {
		this.managerSalarySettlementCode = managerSalarySettlementCode;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getMealAllowance() {
		return mealAllowance;
	}
	public void setMealAllowance(int mealAllowance) {
		this.mealAllowance = mealAllowance;
	}
	public int getVehicleExpenses() {
		return vehicleExpenses;
	}
	public void setVehicleExpenses(int vehicleExpenses) {
		this.vehicleExpenses = vehicleExpenses;
	}
	public int getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(int otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	public int getOtherDeduction() {
		return otherDeduction;
	}
	public void setOtherDeduction(int otherDeduction) {
		this.otherDeduction = otherDeduction;
	}
	public int getTotalSalaryPreTax() {
		return totalSalaryPreTax;
	}
	public void setTotalSalaryPreTax(int totalSalaryPreTax) {
		this.totalSalaryPreTax = totalSalaryPreTax;
	}
	public int getTotalSalaryTaxFree() {
		return totalSalaryTaxFree;
	}
	public void setTotalSalaryTaxFree(int totalSalaryTaxFree) {
		this.totalSalaryTaxFree = totalSalaryTaxFree;
	}
	public int getIncomeTax() {
		return incomeTax;
	}
	public void setIncomeTax(int incomeTax) {
		this.incomeTax = incomeTax;
	}
	public int getLocalIncomeTax() {
		return localIncomeTax;
	}
	public void setLocalIncomeTax(int localIncomeTax) {
		this.localIncomeTax = localIncomeTax;
	}
	public int getNationalPension() {
		return nationalPension;
	}
	public void setNationalPension(int nationalPension) {
		this.nationalPension = nationalPension;
	}
	public int getHealthInsurance() {
		return healthInsurance;
	}
	public void setHealthInsurance(int healthInsurance) {
		this.healthInsurance = healthInsurance;
	}
	public int getLongTermCareInsurance() {
		return longTermCareInsurance;
	}
	public void setLongTermCareInsurance(int longTermCareInsurance) {
		this.longTermCareInsurance = longTermCareInsurance;
	}
	public int getEmploymentInsurance() {
		return employmentInsurance;
	}
	public void setEmploymentInsurance(int employmentInsurance) {
		this.employmentInsurance = employmentInsurance;
	}
	public int getTotalDeduction() {
		return totalDeduction;
	}
	public void setTotalDeduction(int totalDeduction) {
		this.totalDeduction = totalDeduction;
	}
	public int getTotalSalaryAfterTax() {
		return totalSalaryAfterTax;
	}
	public void setTotalSalaryAfterTax(int totalSalaryAfterTax) {
		this.totalSalaryAfterTax = totalSalaryAfterTax;
	}
	public String getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}
	public String getSettlementVerifierId() {
		return settlementVerifierId;
	}
	public void setSettlementVerifierId(String settlementVerifierId) {
		this.settlementVerifierId = settlementVerifierId;
	}
	public String getSettlementYearMonth() {
		return settlementYearMonth;
	}
	public void setSettlementYearMonth(String settlementYearMonth) {
		this.settlementYearMonth = settlementYearMonth;
	}
	public int getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ManagerSalarySettlement [managerSalarySettlementCode=");
		builder.append(managerSalarySettlementCode);
		builder.append(", managerId=");
		builder.append(managerId);
		builder.append(", baseSalary=");
		builder.append(baseSalary);
		builder.append(", bonus=");
		builder.append(bonus);
		builder.append(", mealAllowance=");
		builder.append(mealAllowance);
		builder.append(", vehicleExpenses=");
		builder.append(vehicleExpenses);
		builder.append(", otherAllowance=");
		builder.append(otherAllowance);
		builder.append(", otherDeduction=");
		builder.append(otherDeduction);
		builder.append(", totalSalaryPreTax=");
		builder.append(totalSalaryPreTax);
		builder.append(", totalSalaryTaxFree=");
		builder.append(totalSalaryTaxFree);
		builder.append(", incomeTax=");
		builder.append(incomeTax);
		builder.append(", localIncomeTax=");
		builder.append(localIncomeTax);
		builder.append(", nationalPension=");
		builder.append(nationalPension);
		builder.append(", healthInsurance=");
		builder.append(healthInsurance);
		builder.append(", longTermCareInsurance=");
		builder.append(longTermCareInsurance);
		builder.append(", employmentInsurance=");
		builder.append(employmentInsurance);
		builder.append(", totalDeduction=");
		builder.append(totalDeduction);
		builder.append(", totalSalaryAfterTax=");
		builder.append(totalSalaryAfterTax);
		builder.append(", settlementDate=");
		builder.append(settlementDate);
		builder.append(", settlementVerifierId=");
		builder.append(settlementVerifierId);
		builder.append(", settlementYearMonth=");
		builder.append(settlementYearMonth);
		builder.append("]");
		return builder.toString();
	}
	
}




//manager_salary_settlement_code
//manager_id
//base_salary
//bonus
//meal_allowance
//vehicle_expenses
//other_allowance
//other_deduction
//total_salary_pre_tax
//total_salary_tax_free
//income_tax
//local_income_tax
//national_pension
//health_insurance
//long_term_care_insurance
//employment_insurance
//total_deduction
//total_salary_after_tax
//settlement_date
//settlement_verifier_id
//settlement_year_month