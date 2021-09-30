package callinedu.callin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import callinedu.callin.domain.Teacher;
import callinedu.callin.mapper.TeacherMapper;

@Service
public class TeacherService {
	
	public final TeacherMapper teacherMapper;
	
	@Autowired
	public TeacherService(TeacherMapper teacherMapper) {
		this.teacherMapper = teacherMapper;
	}

	public List<Teacher> getTeacherList(){
		System.out.println("service.getTeacherList 실행");
		
		List<Teacher> teacherList = teacherMapper.getTeacherList();
		
		return teacherList;
	}
	public Teacher getTeacherInfoById(String teacherId){
		System.out.println("service.getTeacherInfoById 실행");
		
		Teacher teacher = teacherMapper.getTeacherInfoById(teacherId);
		
		return teacher;
	}
	public int getTotalWorkHour(String teacherId,String dateRange1,String dateRange2 ){
		System.out.println("service.getTotalWorkHour 실행");
		int totalWorkHour = teacherMapper.getTotalWorkHour(teacherId, dateRange1, dateRange2);
		System.out.println(totalWorkHour);
		return totalWorkHour;
	}
		
}
