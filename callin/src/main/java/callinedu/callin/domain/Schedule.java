package callinedu.callin.domain;

public class Schedule {
	//회원테이블 컬럼 매칭
	private String scheduleRegisterCode;
	private String regularClassCode;
	private String teacherId2;
	private String studentId2;
	private String classStartDay;
	private String classStartTime;
	private String classEndTime;
	private String classEndDay;
	private String classDay;
	private String classRegisterDay;
	private String classEvaluation;
	private String classProgress;
	private String allDay;
	public String getAllDay() {
		return allDay;
	}
	public void setAllDay(String allDay) {
		this.allDay = allDay;
	}
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
	public String getTeacherId2() {
		return teacherId2;
	}
	public void setTeacherId2(String teacherId2) {
		this.teacherId2 = teacherId2;
	}
	public String getStudentId2() {
		return studentId2;
	}
	public void setStudentId2(String studentId2) {
		this.studentId2 = studentId2;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Schedule [scheduleRegisterCode=");
		builder.append(scheduleRegisterCode);
		builder.append(", regularClassCode=");
		builder.append(regularClassCode);
		builder.append(", teacherId2=");
		builder.append(teacherId2);
		builder.append(", studentId2=");
		builder.append(studentId2);
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
