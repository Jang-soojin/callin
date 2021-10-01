package callinedu.callin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import callinedu.callin.domain.Teacher;
import callinedu.callin.domain.TeacherSalarySettlement;
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
	public List<TeacherSalarySettlement> getTeacherSalaryList(){
		System.out.println("service.getTeacherList 실행");
		
		List<TeacherSalarySettlement> teacherSalaryList = teacherMapper.getTeacherSalaryList();
		
		return teacherSalaryList;
	}
	public Teacher getTeacherInfoById(String teacherId){
		System.out.println("service.getTeacherInfoById 실행");
		
		Teacher teacher = teacherMapper.getTeacherInfoById(teacherId);
		
		return teacher;
	}
	
	public int addTeacherSalarySettlement(TeacherSalarySettlement teacherSalarySettlement){
		System.out.println("service.addTeacherSalarySettlement 실행");
		
		return teacherMapper.addTeacherSalarySettlement(teacherSalarySettlement);
	}
	public int getTotalWorkHour(String teacherId,String dateRangeFirst,String dateRangeLast ){
		System.out.println("service.getTotalWorkHour 실행");
		int totalWorkHour = teacherMapper.getTotalWorkHour(teacherId, dateRangeFirst, dateRangeLast);
		System.out.println(totalWorkHour);
		return totalWorkHour;
	}
	
	public List<TeacherSalarySettlement> searchSalaryList(Map<String,Object> map){
		System.out.println("service.getTotalWorkHour 실행");
			String searchKey = (String)map.get("searchKey");
			String searchValue = (String)map.get("searchValue");
			String dateRangeFirst = (String)map.get("dateRangeFirst");
			String dateRangeLast = (String)map.get("dateRangeLast");
		
		List<TeacherSalarySettlement> searchSalaryList = teacherMapper.searchSalaryList(searchKey,searchValue,dateRangeFirst,dateRangeLast);
		System.out.println(searchSalaryList);
		
		
		return searchSalaryList;
	}
		
}
