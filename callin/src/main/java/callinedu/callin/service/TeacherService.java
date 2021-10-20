package callinedu.callin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import callinedu.callin.domain.Teacher;
import callinedu.callin.domain.TeacherSalarySettlement;
import callinedu.callin.mapper.TeacherMapper;
import callinedu.callin.mapper.UserMapper;

@Service
public class TeacherService {
	
	
	public final TeacherMapper teacherMapper;
	public final UserMapper userMapper;
	
	@Autowired
	public TeacherService(TeacherMapper teacherMapper, UserMapper userMapper) {
		this.teacherMapper = teacherMapper;
		this.userMapper = userMapper;
	}

	public List<Teacher> getTeacherList(){
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
		int totalWorkHour = teacherMapper.getTotalWorkHour(teacherId, dateRangeFirst, dateRangeLast);
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

	public void registerTeacher(Map<String, String> map) {
		String id = map.get("user_id");
		String pw = map.get("user_pw");
		String name = map.get("user_name");
		String nickname = map.get("user_nickname");
		String phoneNumber = map.get("user_phone");
		String email = map.get("user_email");
		String birth = map.get("birth_year") +"-"+ map.get("birth_month")+"-"+ map.get("birth_day");
		String gender = map.get("gender");
		String skypeId = map.get("skype_id");
		String skypePw = map.get("skype_pw");
		String unitPay = map.get("unit_pay");
		String ClassStartTime = map.get("class_start_time");
		String ClassEndTime = map.get("class_end_time");
		// user_info 테이블에 저장 영역
		userMapper.addUser(id, pw, name, nickname, skypeId, birth, gender, email, phoneNumber);
		// teacher_detail 테이블에 저장 영역
		teacherMapper.addTeacherDetail(id,skypeId, skypePw, unitPay, ClassStartTime, ClassEndTime);
	}

	public void modifyTeacher(Map<String, String> map) {
		String id = map.get("user_id");
		String name = map.get("user_name");
		String nickname = map.get("user_nickname");
		String phoneNumber = map.get("user_phone");
		String email = map.get("user_email");
		String skypeId = map.get("skype_id");
		String skypePw = map.get("skype_pw");
		String unitPay = map.get("unit_pay");
		String ClassStartTime = map.get("class_start_time");
		String ClassEndTime = map.get("class_end_time");
		userMapper.modifyUser(id, name, nickname, skypeId, email, phoneNumber);
		teacherMapper.modifyTeacher(id,skypeId, skypePw, unitPay, ClassStartTime, ClassEndTime);
	}
		
}
