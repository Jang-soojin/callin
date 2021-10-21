package callinedu.callin.domain;

public class ScheduleDay {
	
	private String scheduleDayCode;
	private String scheduleRegisterCode;
	private String teacherId;
	private String classDayAttendance;
	private String classDayDate;
	private String classExpectedStartTime;
	private String classExpectedEndTime;
	private String classRealStartTime;
	private String classRealEndTime;
	private String classProgressTime;
	
	
	public String getScheduleDayCode() {
		return scheduleDayCode;
	}
	public void setScheduleDayCode(String scheduleDayCode) {
		this.scheduleDayCode = scheduleDayCode;
	}
	public String getScheduleRegisterCode() {
		return scheduleRegisterCode;
	}
	public void setScheduleRegisterCode(String scheduleRegisterCode) {
		this.scheduleRegisterCode = scheduleRegisterCode;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getClassDayAttendance() {
		return classDayAttendance;
	}
	public void setClassDayAttendance(String classDayAttendance) {
		this.classDayAttendance = classDayAttendance;
	}
	public String getClassDayDate() {
		return classDayDate;
	}
	public void setClassDayDate(String classDayDate) {
		this.classDayDate = classDayDate;
	}
	public String getClassExpectedStartTime() {
		return classExpectedStartTime;
	}
	public void setClassExpectedStartTime(String classExpectedStartTime) {
		this.classExpectedStartTime = classExpectedStartTime;
	}
	public String getClassExpectedEndTime() {
		return classExpectedEndTime;
	}
	public void setClassExpectedEndTime(String classExpectedEndTime) {
		this.classExpectedEndTime = classExpectedEndTime;
	}
	public String getClassRealStartTime() {
		return classRealStartTime;
	}
	public void setClassRealStartTime(String classRealStartTime) {
		this.classRealStartTime = classRealStartTime;
	}
	public String getClassRealEndTime() {
		return classRealEndTime;
	}
	public void setClassRealEndTime(String classRealEndTime) {
		this.classRealEndTime = classRealEndTime;
	}
	public String getClassProgressTime() {
		return classProgressTime;
	}
	public void setClassProgressTime(String classProgressTime) {
		this.classProgressTime = classProgressTime;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ScheduleDay [scheduleDayCode=");
		builder.append(scheduleDayCode);
		builder.append(", scheduleRegisterCode=");
		builder.append(scheduleRegisterCode);
		builder.append(", teacherId=");
		builder.append(teacherId);
		builder.append(", classDayAttendance=");
		builder.append(classDayAttendance);
		builder.append(", classDayDate=");
		builder.append(classDayDate);
		builder.append(", classExpectedStartTime=");
		builder.append(classExpectedStartTime);
		builder.append(", classExpectedEndTime=");
		builder.append(classExpectedEndTime);
		builder.append(", classRealStartTime=");
		builder.append(classRealStartTime);
		builder.append(", classRealEndTime=");
		builder.append(classRealEndTime);
		builder.append(", classProgressTime=");
		builder.append(classProgressTime);
		builder.append("]");
		return builder.toString();
	}
	
}
