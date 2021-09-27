package callinedu.callin.domain;

public class TeacherAttendance {
	private String attendanceCode;
	private String teacherId;
	private int teacherWorkHour;
	private String workDate; 
	
	
	public String getAttendanceCode() {
		return attendanceCode;
	}
	public void setAttendanceCode(String attendanceCode) {
		this.attendanceCode = attendanceCode;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public int getTeacherWorkHour() {
		return teacherWorkHour;
	}
	public void setTeacherWorkHour(int teacherWorkHour) {
		this.teacherWorkHour = teacherWorkHour;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TeacherAttendance [attendanceCode=");
		builder.append(attendanceCode);
		builder.append(", teacherId=");
		builder.append(teacherId);
		builder.append(", teacherWorkHour=");
		builder.append(teacherWorkHour);
		builder.append(", workDate=");
		builder.append(workDate);
		builder.append("]");
		return builder.toString();
	}
	
	
}
