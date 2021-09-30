package callinedu.callin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.Teacher;

@Mapper
public interface TeacherMapper {
	public List<Teacher> getTeacherList();
	public Teacher getTeacherInfoById(String teacherId);
	public int getTotalWorkHour(String teacherId, String dateRange1,String dateRange2);
}
