package callinedu.callin.domain;

public class LTApplyCode {
	private String lTCode;
	private String studentId;
	private String userNameEx;
	private String userNicknameEx;
	private String skypeIdEx;
	private String userEmailEx;
	private String userPhoneEx;
	private String lTApplyDate;
	private String lTHopeDate;
	private String lTHopeTime;
	private String requestedTerm;
	private User user;
	public String getlTCode() {
		return lTCode;
	}
	public void setlTCode(String lTCode) {
		this.lTCode = lTCode;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getUserNameEx() {
		return userNameEx;
	}
	public void setUserNameEx(String userNameEx) {
		this.userNameEx = userNameEx;
	}
	public String getUserNicknameEx() {
		return userNicknameEx;
	}
	public void setUserNicknameEx(String userNicknameEx) {
		this.userNicknameEx = userNicknameEx;
	}
	public String getSkypeIdEx() {
		return skypeIdEx;
	}
	public void setSkypeIdEx(String skypeIdEx) {
		this.skypeIdEx = skypeIdEx;
	}
	public String getUserEmailEx() {
		return userEmailEx;
	}
	public void setUserEmailEx(String userEmailEx) {
		this.userEmailEx = userEmailEx;
	}
	public String getUserPhoneEx() {
		return userPhoneEx;
	}
	public void setUserPhoneEx(String userPhoneEx) {
		this.userPhoneEx = userPhoneEx;
	}
	public String getlTApplyDate() {
		return lTApplyDate;
	}
	public void setlTApplyDate(String lTApplyDate) {
		this.lTApplyDate = lTApplyDate;
	}
	public String getlTHopeDate() {
		return lTHopeDate;
	}
	public void setlTHopeDate(String lTHopeDate) {
		this.lTHopeDate = lTHopeDate;
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
		builder.append(", studentId=");
		builder.append(studentId);
		builder.append(", userNameEx=");
		builder.append(userNameEx);
		builder.append(", userNicknameEx=");
		builder.append(userNicknameEx);
		builder.append(", skypeIdEx=");
		builder.append(skypeIdEx);
		builder.append(", userEmailEx=");
		builder.append(userEmailEx);
		builder.append(", userPhoneEx=");
		builder.append(userPhoneEx);
		builder.append(", lTApplyDate=");
		builder.append(lTApplyDate);
		builder.append(", lTHopeDate=");
		builder.append(lTHopeDate);
		builder.append(", lTHopeTime=");
		builder.append(lTHopeTime);
		builder.append(", requestedTerm=");
		builder.append(requestedTerm);
		builder.append(", user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}
	
	
}
