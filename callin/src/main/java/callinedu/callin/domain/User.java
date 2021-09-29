package callinedu.callin.domain;

public class User {
	//회원테이블 컬럼 매칭
	private String userId;
	private String userPw;
	private String userName;
	private String userLevel;
	private String skypeId;
	private String userNickname;
	private String userBirth;
	private String userGender;
	private String userEmail;
	private String userPhone;
	private String userWithdrawStatus;
	private String userJoinDate;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
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
	public String getUserWithdrawStatus() {
		return userWithdrawStatus;
	}
	public void setUserWithdrawStatus(String userWithdrawStatus) {
		this.userWithdrawStatus = userWithdrawStatus;
	}
	public String getUserJoinDate() {
		return userJoinDate;
	}
	public void setUserJoinDate(String userJoinDate) {
		this.userJoinDate = userJoinDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userId=");
		builder.append(userId);
		builder.append(", userPw=");
		builder.append(userPw);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", userLevel=");
		builder.append(userLevel);
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
		builder.append(", userWithdrawStatus=");
		builder.append(userWithdrawStatus);
		builder.append(", userJoinDate=");
		builder.append(userJoinDate);
		builder.append("]");
		return builder.toString();
	}
	
	
}
