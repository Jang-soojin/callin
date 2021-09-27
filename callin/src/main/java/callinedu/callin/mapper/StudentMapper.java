package callinedu.callin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.Student;

@Mapper
public interface StudentMapper {
	public List<Student> getStudentList();
	public Student getStudentInfoById(String studentId);
	public String getTest();
}
