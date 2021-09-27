package callinedu.callin.service;

import java.util.List;

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
