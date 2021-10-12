package callinedu.callin.service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import callinedu.callin.domain.Mileage;
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
	
	public int addMileage(Mileage mileage, String[] moveSlct) {
		int resultCnt = 0;
		
		for(int i = 0; i < moveSlct.length; i++) {
			mileage.setStudentId(moveSlct[i].substring(moveSlct[i].indexOf("[") + 1, moveSlct[i].lastIndexOf("]")));
			
			resultCnt += studentMapper.addMileage(mileage);
		}
		return resultCnt;
	}
	
	public List<Mileage> selectMileageResnList(){
		return studentMapper.selectMileageResnList();
	}
	
	public List<Mileage> getallMileageGet() {
		
		return null;
	}
	
	  public List<Mileage> getwaitingMileageGet() {
	  
	  return null; 
	}
	  
	  
	  
	public List<Mileage> getAllMileageListBySearch(Map<String, Object> paramMap){
		String searchKey = (String) paramMap.get("searchKey");	
		
		if(searchKey != null && !searchKey.equals("")) {
			if("student_id".equals(searchKey)) 	paramMap.put("searchKey", "student_id");
			if("user_name".equals(searchKey)) 	paramMap.put("searchKey", "user_name");
		}
		paramMap.put("dateRangeFirst", paramMap.get("reservation").toString().split(" - ")[0]);
		paramMap.put("dateRangeLast", paramMap.get("reservation").toString().split(" - ")[1]);
		
		return studentMapper.getAllMileageListBySearch(paramMap);
	}
	  
	  
	 
		
}
