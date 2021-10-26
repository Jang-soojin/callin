package callinedu.callin.domain;

public class EbookLevel {
	private String ebookLevelCode;
	private String ebookLevelName;
	
	public String getEbookLevelCode() {
		return ebookLevelCode;
	}
	public void setEbookLevelCode(String ebookLevelCode) {
		this.ebookLevelCode = ebookLevelCode;
	}
	public String getEbookLevelName() {
		return ebookLevelName;
	}
	public void setEbookLevelName(String ebookLevelName) {
		this.ebookLevelName = ebookLevelName;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EbookLevel [ebookLevelCode=");
		builder.append(ebookLevelCode);
		builder.append(", ebookLevelName=");
		builder.append(ebookLevelName);
		builder.append("]");
		return builder.toString();
	}
	
	

}
