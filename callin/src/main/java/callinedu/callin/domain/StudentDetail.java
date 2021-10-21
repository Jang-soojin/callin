package callinedu.callin.domain;

public class StudentDetail {
	private String userName;
	private String skypeId;
	private String userNickname;
	private String userBirth;
	private String userGender;
	private String userEmail;
	private String userPhone;
	private String userJoinDate;
	private String studentId;
	private String studentGuardianNumber;
	private String studentData;
	private String userId;

	

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSkypeId() {
		return skypeId;
	}
	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
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
	public String getUserJoinDate() {
		return userJoinDate;
	}
	public void setUserJoinDate(String userJoinDate) {
		this.userJoinDate = userJoinDate;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentGuardianNumber() {
		return studentGuardianNumber;
	}
	public void setStudentGuardianNumber(String studentGuardianNumber) {
		this.studentGuardianNumber = studentGuardianNumber;
	}
	public String getStudentData() {
		return studentData;
	}
	public void setStudentData(String studentData) {
		this.studentData = studentData;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentDetail [userName=");
		builder.append(userName);
		builder.append(", skypeId=");
		builder.append(skypeId);
		builder.append(", userNickname=");
		builder.append(userNickname);
		builder.append(", userBirth=");
		builder.append(userBirth);
		builder.append(", userGender=");
		builder.append(userGender);
		builder.append(", userEmail=");
		builder.append(userEmail);
		builder.append(", userPhone=");
		builder.append(userPhone);
		builder.append(", userJoinDate=");
		builder.append(userJoinDate);
		builder.append(", studentId=");
		builder.append(studentId);
		builder.append(", studentGuardianNumber=");
		builder.append(studentGuardianNumber);
		builder.append(", studentData=");
		builder.append(studentData);
		builder.append(", userId=");
		builder.append(userId);
		return builder.toString();
	}



}
