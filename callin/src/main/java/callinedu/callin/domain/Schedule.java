package callinedu.callin.domain;

public class Schedule {
	//회원테이블 컬럼 매칭
	private String scheduleRegisterCode;
	private String regularClassCode;
	private String teacherId;
	private String userId;
	private String classStartDay;
	private String classStartTime;
	private String classEndTime;
	private String classEndDay;
	private String classDay;
	private String classRegisterDay;
	private String classEvaluation;
	private String classProgress;
	private String allDay;
	public String getScheduleRegisterCode() {
		return scheduleRegisterCode;
	}
	public void setScheduleRegisterCode(String scheduleRegisterCode) {
		this.scheduleRegisterCode = scheduleRegisterCode;
	}
	public String getRegularClassCode() {
		return regularClassCode;
	}
	public void setRegularClassCode(String regularClassCode) {
		this.regularClassCode = regularClassCode;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getClassStartDay() {
		return classStartDay;
	}
	public void setClassStartDay(String classStartDay) {
		this.classStartDay = classStartDay;
	}
	public String getClassStartTime() {
		return classStartTime;
	}
	public void setClassStartTime(String classStartTime) {
		this.classStartTime = classStartTime;
	}
	public String getClassEndTime() {
		return classEndTime;
	}
	public void setClassEndTime(String classEndTime) {
		this.classEndTime = classEndTime;
	}
	public String getClassEndDay() {
		return classEndDay;
	}
	public void setClassEndDay(String classEndDay) {
		this.classEndDay = classEndDay;
	}
	public String getClassDay() {
		return classDay;
	}
	public void setClassDay(String classDay) {
		this.classDay = classDay;
	}
	public String getClassRegisterDay() {
		return classRegisterDay;
	}
	public void setClassRegisterDay(String classRegisterDay) {
		this.classRegisterDay = classRegisterDay;
	}
	public String getClassEvaluation() {
		return classEvaluation;
	}
	public void setClassEvaluation(String classEvaluation) {
		this.classEvaluation = classEvaluation;
	}
	public String getClassProgress() {
		return classProgress;
	}
	public void setClassProgress(String classProgress) {
		this.classProgress = classProgress;
	}
	public String getAllDay() {
		return allDay;
	}
	public void setAllDay(String allDay) {
		this.allDay = allDay;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Schedule [scheduleRegisterCode=");
		builder.append(scheduleRegisterCode);
		builder.append(", regularClassCode=");
		builder.append(regularClassCode);
		builder.append(", teacherId=");
		builder.append(teacherId);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", classStartDay=");
		builder.append(classStartDay);
		builder.append(", classStartTime=");
		builder.append(classStartTime);
		builder.append(", classEndTime=");
		builder.append(classEndTime);
		builder.append(", classEndDay=");
		builder.append(classEndDay);
		builder.append(", classDay=");
		builder.append(classDay);
		builder.append(", classRegisterDay=");
		builder.append(classRegisterDay);
		builder.append(", classEvaluation=");
		builder.append(classEvaluation);
		builder.append(", classProgress=");
		builder.append(classProgress);
		builder.append(", allDay=");
		builder.append(allDay);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
