package callinedu.callin.domain;

public class LTApplyCode {
	private String lTCode;
	private String studentId;
	private String userName;
	private String userNickname;
	private String skypeId;
	private String userEmail;
	private String userPhone;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getSkypeId() {
		return skypeId;
	}
	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
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
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", userNickname=");
		builder.append(userNickname);
		builder.append(", skypeId=");
		builder.append(skypeId);
		builder.append(", userEmail=");
		builder.append(userEmail);
		builder.append(", userPhone=");
		builder.append(userPhone);
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
