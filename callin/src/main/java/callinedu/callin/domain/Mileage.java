package callinedu.callin.domain;

public class Mileage {
	private String mileageUseCode;
	private String studentId;
	private String mileageUseReasonCode;      	
	private String mileagDeductDate;		
	private String mileagDeduct;			
	private String mileageAnticipateDelDate;
	private String mileageUseGroupCode;
	private String mileageGroupCode;
	private String mileageDeductDivision;
	private String mileageMemo;
	private String mileageWaitDivision;
	private String moveSlct;
	private String mileageReason;
	private String mileageDivision;
	
	public String getMileageUseCode() {
		return mileageUseCode;
	}
	public void setMileageUseCode(String mileageUseCode) {
		this.mileageUseCode = mileageUseCode;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getMileageUseReasonCode() {
		return mileageUseReasonCode;
	}
	public void setMileageUseReasonCode(String mileageUseReaCode) {
		this.mileageUseReasonCode = mileageUseReaCode;
	}
	public String getMileagDeductDate() {
		return mileagDeductDate;
	}
	public void setMileagDeductDate(String mileagDeductDate) {
		this.mileagDeductDate = mileagDeductDate;
	}
	public String getMileagDeduct() {
		return mileagDeduct;
	}
	public void setMileagDeduct(String mileagDeduct) {
		this.mileagDeduct = mileagDeduct;
	}
	public String getMileageAnticipateDelDate() {
		return mileageAnticipateDelDate;
	}
	public void setMileageAnticipateDelDate(String mileageAnticipateDelDate) {
		this.mileageAnticipateDelDate = mileageAnticipateDelDate;
	}
	public String getMileageUseGroupCode() {
		return mileageUseGroupCode;
	}
	public void setMileageUseGroupCode(String mileageUseGroupCode) {
		this.mileageUseGroupCode = mileageUseGroupCode;
	}
	public String getMileageGroupCode() {
		return mileageGroupCode;
	}
	public void setMileageGroupCode(String mileageGroupCode) {
		this.mileageGroupCode = mileageGroupCode;
	}
	public String getMileageDeductDivision() {
		return mileageDeductDivision;
	}
	public void setMileageDeductDivision(String mileageDeductDivision) {
		this.mileageDeductDivision = mileageDeductDivision;
	}
	public String getMileageMemo() {
		return mileageMemo;
	}
	public void setMileageMemo(String mileageMemo) {
		this.mileageMemo = mileageMemo;
	}
	public String getMileageWaitDivision() {
		return mileageWaitDivision;
	}
	public void setMileageWaitDivision(String mileageWaitDivision) {
		this.mileageWaitDivision = mileageWaitDivision;
	}
	public String getMoveSlct() {
		return moveSlct;
	}
	public void setMoveSlct(String moveSlct) {
		this.moveSlct = moveSlct;
	}
	public String getMileageReason() {
		return mileageReason;
	}
	public void setMileageReason(String mileageReason) {
		this.mileageReason = mileageReason;
	}
	public String getMileageDivision() {
		return mileageDivision;
	}
	public void setMileageDivision(String mileageDivision) {
		this.mileageDivision = mileageDivision;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mileage [mileageUseCode=");
		builder.append(mileageUseCode);
		builder.append(", studentId=");
		builder.append(studentId);
		builder.append(", mileageUseReasonCode=");
		builder.append(mileageUseReasonCode);
		builder.append(", mileagDeductDate=");
		builder.append(mileagDeductDate);
		builder.append(", mileagDeduct=");
		builder.append(mileagDeduct);
		builder.append(", mileageAnticipateDelDate=");
		builder.append(mileageAnticipateDelDate);
		builder.append(", mileageUseGroupCode=");
		builder.append(mileageUseGroupCode);
		builder.append(", mileageGroupCode=");
		builder.append(mileageGroupCode);
		builder.append(", mileageDeductDivision=");
		builder.append(mileageDeductDivision);
		builder.append(", mileageMemo=");
		builder.append(mileageMemo);
		builder.append(", mileageWaitDivision=");
		builder.append(mileageWaitDivision);
		builder.append("]");
		return builder.toString();
	}
	
	

}
