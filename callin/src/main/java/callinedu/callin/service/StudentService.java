package callinedu.callin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import callinedu.callin.domain.Student;
import callinedu.callin.mapper.StudentMapper;

@Service
public class StudentService {
	
	public final StudentMapper studentMapper;
	
	@Autowired
	public StudentService(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	public List<Student> getMemberListBySearch(Map<String, Object> paramMap){
		String searchKey = (String) paramMap.get("searchKey");
		String searchDegree = (String) paramMap.get("searchDegree");
		
		if(searchDegree != null && !searchDegree.equals("")) {
			if("iron".equals(searchDegree)) 		paramMap.put("searchDegree", "아이언");
			if("bronze".equals(searchDegree)) 		paramMap.put("searchDegree", "브론즈");
			if("silver".equals(searchDegree)) 		paramMap.put("searchDegree", "실버");
			if("gold".equals(searchDegree)) 		paramMap.put("searchDegree", "골드");
			if("diamond".equals(searchDegree)) 		paramMap.put("searchDegree", "다이아몬드");
			
		}
		
		if(searchKey != null && !searchKey.equals("")) {
			if("schGubun_ID".equals(searchKey)) 	paramMap.put("searchKey", "user_id");
			if("schGubun_Name".equals(searchKey)) 	paramMap.put("searchKey", "user_name");
		}
		
		return studentMapper.getMemberListBySearch(paramMap);
	}
	
	public List<Student> getStudentList(){
		System.out.println("service.getStudentList 실행");
		
		List<Student> studentList = studentMapper.getStudentList();
		System.out.println("학생리스트"+studentList);
		System.out.println(studentList);
		
		return studentList;
	}
	public Student getStudentInfoById(String studentId){
		System.out.println("service.getStudentInfoById 실행");
		
		Student student = studentMapper.getStudentInfoById(studentId);
		System.out.println("학생"+student);
		System.out.println(student);
		
		return student;
	}
	public String getTest(){

		return studentMapper.getTest();
	}
	

		
}
