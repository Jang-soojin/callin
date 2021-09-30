package callinedu.callin.domain;

public class LTApplyCode {
	private String lTCode;
	private String managerId;
	private String studentId;
	private String lTApplyDate;
	private String lTHopeTime;
	private String requestedTerm;
	private String approval;
	private String approvalDate;
	private User user;
	public String getlTCode() {
		return lTCode;
	}
	public void setlTCode(String lTCode) {
		this.lTCode = lTCode;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getlTApplyDate() {
		return lTApplyDate;
	}
	public void setlTApplyDate(String lTApplyDate) {
		this.lTApplyDate = lTApplyDate;
	}
	public String getlTHopeTime() {
		return lTHopeTime;
	}
	public void setlTHopeTime(String lTHopeTime) {
		this.lTHopeTime = lTHopeTime;
	}
	public String getRequestedTerm() {
		return requestedTerm;
	}
	public void setRequestedTerm(String requestedTerm) {
		this.requestedTerm = requestedTerm;
	}
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval = approval;
	}
	public String getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LTApplyCode [lTCode=");
		builder.append(lTCode);
		builder.append(", managerId=");
		builder.append(managerId);
		builder.append(", studentId=");
		builder.append(studentId);
		builder.append(", lTApplyDate=");
		builder.append(lTApplyDate);
		builder.append(", lTHopeTime=");
		builder.append(lTHopeTime);
		builder.append(", requestedTerm=");
		builder.append(requestedTerm);
		builder.append(", approval=");
		builder.append(approval);
		builder.append(", approvalDate=");
		builder.append(approvalDate);
		builder.append(", user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}
	
	
}
