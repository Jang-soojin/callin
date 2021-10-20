package callinedu.callin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.Teacher;
import callinedu.callin.domain.TeacherSalarySettlement;

@Mapper
public interface TeacherMapper {
	public List<Teacher> getTeacherList();
	public Teacher getTeacherInfoById(String teacherId);
	public int getTotalWorkHour(String teacherId, String dateRangeFirst,String dateRangeLast);
	public int addTeacherSalarySettlement(TeacherSalarySettlement teacherSalarySettlement);
	public List<TeacherSalarySettlement> getTeacherSalaryList();
	public List<TeacherSalarySettlement> searchSalaryList(String searchKey, String searchValue,String dateRangeFirst,String dateRangeLast);
	public int addTeacherDetail(String id, String skypeId, String skypePw, String unitPay, String classStartTime,String classEndTime);
	public int modifyTeacher(String id, String skypeId, String skypePw, String unitPay, String classStartTime,	String classEndTime);
}
