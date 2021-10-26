package callinedu.callin.domain;

public class EbookData {
	private String ebookDataCode;
	private String ebookName;
	private int ebookLevel;
	private String ebookFile;
	private String registrationDate;
	private String managerId;
	public String getEbookDataCode() {
		return ebookDataCode;
	}
	public void setEbookDataCode(String ebookDataCode) {
		this.ebookDataCode = ebookDataCode;
	}
	public String getEbookName() {
		return ebookName;
	}
	public void setEbookName(String ebookName) {
		this.ebookName = ebookName;
	}
	public int getEbookLevel() {
		return ebookLevel;
	}
	public void setEbookLevel(int ebookLevel) {
		this.ebookLevel = ebookLevel;
	}
	public String getEbookFile() {
		return ebookFile;
	}
	public void setEbookFile(String ebookFile) {
		this.ebookFile = ebookFile;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EbookData [ebookDataCode=");
		builder.append(ebookDataCode);
		builder.append(", ebookName=");
		builder.append(ebookName);
		builder.append(", ebookLevel=");
		builder.append(ebookLevel);
		builder.append(", ebookFile=");
		builder.append(ebookFile);
		builder.append(", registrationDate=");
		builder.append(registrationDate);
		builder.append(", managerId=");
		builder.append(managerId);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	

}
