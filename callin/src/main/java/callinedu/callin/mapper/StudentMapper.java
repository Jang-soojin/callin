package callinedu.callin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.Student;

@Mapper
public interface StudentMapper {
	public List<Student> getStudentList();
	public Student getStudentInfoById(String studentId);
	public String getTest();
	public List<Student> getMemberListBySearch(Map<String, Object> paramMap);
}
