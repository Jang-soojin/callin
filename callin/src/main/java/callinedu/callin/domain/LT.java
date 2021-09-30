package callinedu.callin.domain;

public class LT {
	private String classType;
	private String studentId;
	private String krName;
	private String enName;
	private String skypeId;
	private String userPhone;
	private String tdate;
	private String requestedTerm;
	
	public LT() {}
	
	public LT(String classType, String userId, String krName, String enName
					, String skypeId, String userPhone, String tdate, String requestedTerm) {
		this.classType = classType;
		this.studentId = studentId;
		this.krName = krName;
		this.enName = enName;
		this.skypeId = skypeId;
		this.userPhone = userPhone;
		this.tdate = tdate;
		this.requestedTerm = requestedTerm;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getUserId() {
		return studentId;
	}

	public void setUserId(String studentId) {
		this.studentId = studentId;
	}

	public String getKrName() {
		return krName;
	}

	public void setKrName(String krName) {
		this.krName = krName;
	}

	public String getEnName() {
		return enName;
	}

	public void setEnName(String enName) {
		this.enName = enName;
	}

	public String getSkypeId() {
		return skypeId;
	}

	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getTdate() {
		return tdate;
	}

	public void setTdate(String tdate) {
		this.tdate = tdate;
	}

	public String getRequestedTerm() {
		return requestedTerm;
	}

	public void setRequestedTerm(String requestedTerm) {
		this.requestedTerm = requestedTerm;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LT [classType=");
		builder.append(classType);
		builder.append(", userId=");
		builder.append(studentId);
		builder.append(", krName=");
		builder.append(krName);
		builder.append(", enName=");
		builder.append(enName);
		builder.append(", skypeId=");
		builder.append(skypeId);
		builder.append(", userPhone=");
		builder.append(userPhone);
		builder.append(", tdate=");
		builder.append(tdate);
		builder.append(", requestedTerm=");
		builder.append(requestedTerm);
		builder.append("]");
		return builder.toString();
	}
	
	
	

	
}
