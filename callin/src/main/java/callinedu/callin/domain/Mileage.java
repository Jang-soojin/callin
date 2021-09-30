package callinedu.callin.domain;

public class Mileage {
	private String studentId;
	private String mileageUseCode;      	
	private String mileageUserReaCode;		
	private String mileagDeduct;			
	private String mileageUse_group_code;
	private String mileageUse_group_code_table;
	private String mileageGroup_code;
	
	
	
	public  Mileage() {}
	
	public  Mileage(String studentId, String mileageUseCode, String mileageUserReaCode, String mileagDeduct, String mileageUse_group_code, String mileageUse_group_code_table, String mileageGroup_code) {
		this.studentId = studentId;
		this.mileageUseCode = mileageUseCode;
		this.mileageUserReaCode = mileageUserReaCode;
		this.mileagDeduct = mileagDeduct;
		this.mileageUse_group_code = mileageUse_group_code;
		this.mileageUse_group_code_table = mileageUse_group_code_table;
		this.mileageGroup_code = mileageGroup_code;
		
	
	}
	
	

	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getMileageUseCode() {
		return mileageUseCode;
	}

	public void setMileageUseCode(String mileageUseCode) {
		this.mileageUseCode = mileageUseCode;
	}

	public String getMileageUserReaCode() {
		return mileageUserReaCode;
	}

	public void setMileageUserReaCode(String mileageUserReaCode) {
		this.mileageUserReaCode = mileageUserReaCode;
	}

	public String getMileagDeduct() {
		return mileagDeduct;
	}

	public void setMileagDeduct(String mileagDeduct) {
		this.mileagDeduct = mileagDeduct;
	}

	public String getMileageUse_group_code() {
		return mileageUse_group_code;
	}

	public void setMileageUse_group_code(String mileageUse_group_code) {
		this.mileageUse_group_code = mileageUse_group_code;
	}

	public String getMileageUse_group_code_table() {
		return mileageUse_group_code_table;
	}

	public void setMileageUse_group_code_table(String mileageUse_group_code_table) {
		this.mileageUse_group_code_table = mileageUse_group_code_table;
	}

	public String getMileageGroup_code() {
		return mileageGroup_code;
	}

	public void setMileageGroup_code(String mileageGroup_code) {
		this.mileageGroup_code = mileageGroup_code;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [studentId=");
		builder.append(studentId);
		builder.append(", mileageUseCode=");
		builder.append(mileageUseCode);
		builder.append(", mileageUserReaCode=");
		builder.append(mileageUserReaCode);
		builder.append(", mileagDeduct=");
		builder.append(mileagDeduct);
		builder.append(", mileageUse_group_code=");
		builder.append(mileageUse_group_code);
		builder.append(", mileageUse_group_code_table=");
		builder.append(mileageUse_group_code_table);
		builder.append(", mileageGroup_code=");
		builder.append(mileageGroup_code);		
		builder.append("]");
		return builder.toString();
	}
}
