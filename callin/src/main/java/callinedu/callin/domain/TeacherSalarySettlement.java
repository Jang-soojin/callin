package callinedu.callin.domain;

public class TeacherSalarySettlement {
	private String teacherSalarySettlementCode;
	private String teacherId;
	private String teacherMonthlyAttendanceCode;
	private String bonus;
	private String deduction;
	private String totalSalaryPhp;
	private String totalSalaryKrw;
	private String settlementDate;
	private String settlementVerifierId;
	private String settlementYearMonth;
	
	public String getTeacherSalarySettlementCode() {
		return teacherSalarySettlementCode;
	}
	public void setTeacherSalarySettlementCode(String teacherSalarySettlementCode) {
		this.teacherSalarySettlementCode = teacherSalarySettlementCode;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherMonthlyAttendanceCode() {
		return teacherMonthlyAttendanceCode;
	}
	public void setTeacherMonthlyAttendanceCode(String teacherMonthlyAttendanceCode) {
		this.teacherMonthlyAttendanceCode = teacherMonthlyAttendanceCode;
	}
	public String getBonus() {
		return bonus;
	}
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	public String getDeduction() {
		return deduction;
	}
	public void setDeduction(String deduction) {
		this.deduction = deduction;
	}
	public String getTotalSalaryPhp() {
		return totalSalaryPhp;
	}
	public void setTotalSalaryPhp(String totalSalaryPhp) {
		this.totalSalaryPhp = totalSalaryPhp;
	}
	public String getTotalSalaryKrw() {
		return totalSalaryKrw;
	}
	public void setTotalSalaryKrw(String totalSalaryKrw) {
		this.totalSalaryKrw = totalSalaryKrw;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TeacherSalarySettlement [teacherSalarySettlementCode=");
		builder.append(teacherSalarySettlementCode);
		builder.append(", teacherId=");
		builder.append(teacherId);
		builder.append(", teacherMonthlyAttendanceCode=");
		builder.append(teacherMonthlyAttendanceCode);
		builder.append(", bonus=");
		builder.append(bonus);
		builder.append(", deduction=");
		builder.append(deduction);
		builder.append(", totalSalaryPhp=");
		builder.append(totalSalaryPhp);
		builder.append(", totalSalaryKrw=");
		builder.append(totalSalaryKrw);
		builder.append(", settlementDate=");
		builder.append(settlementDate);
		builder.append(", settlementVerifierId=");
		builder.append(settlementVerifierId);
		builder.append(", settlementYearMonth=");
		builder.append(settlementYearMonth);
		builder.append(", salarySettlementGroup=");
		builder.append("]");
		return builder.toString();
	}
	
}

