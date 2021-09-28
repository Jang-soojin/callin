package callinedu.callin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import callinedu.callin.domain.Student;
import callinedu.callin.domain.Teacher;
import callinedu.callin.service.StudentService;


@Controller
@RequestMapping("/admin/mileage/")
public class MileageController {
	private final StudentService studentService;
		
	public MileageController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	  @RequestMapping(value="mileageAdd") 
	  public String mileageAddPost(Student studentInfo, Model model) { 
		
		  System.out.println(""+studentInfo); 
		  Student student = new Student();
		  //student student = studentService.getStudentInfoById("id001"); 
		  System.out.println(student+"");
		  model.addAttribute("studentId", student.getStudentId()); 
		  model.addAttribute("userName", student.getUserName()); 
		  model.addAttribute("studentDegreeCode",  student.getStudentDegreeCode());
		  model.addAttribute("studentDegreeName",  student.getStudentDegreeName());
		  model.addAttribute("title", "마일리지");
		  model.addAttribute("midTitle", "마일리지등록");
		  
		  //System.out.println("### map : " + studentService.getTest());
		 
	  return  "/mileage/mileageAdd"; 
	  } 
	 
	
	/**
	 * 검색
	 * @param param
	 * @param request
	 * @return
	 * @throws Exception
	 */
	/*@RequestMapping(value="mileageSearch")
	public @ResponseBody Map<String, Object> mileageSearch(@RequestParam Map<String, Object> param, HttpServletRequest request) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<Map<String, Object>> resultList = studentService.studentList();

		
		resultMap.put("resultList", resultList);
		
		return resultMap;
	}*/
		@PostMapping(value="/mileageSearch", produces = "application/json")
		@ResponseBody
		public Student mileageSearch(Student studentInfo, Model model) {
			model.addAttribute("studentId", studentInfo.getStudentId());
			model.addAttribute("userName", studentInfo.getUserName()); 
		    model.addAttribute("studentDegreeCode",  studentInfo.getStudentDegreeCode());
			model.addAttribute("studentDegreeName",  studentInfo.getStudentDegreeName());
		
			return  studentInfo;
		}
	/**
	 * 저장
	 * @param param
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="mileageSave")
	public String mileageSave(@RequestParam Map<String, Object> param, @RequestParam(value="moveSlct", required=false) String[] moveSlcts, HttpServletRequest request) throws Exception {
		System.out.println("### param : " + param);
		//여기도 실제 insert문 태우는걸로 
		//  moveSlcts 가 없어
		if(moveSlcts != null && moveSlcts.length > 0) {
			for(String dd : moveSlcts) {
				System.out.println("### moveSlcts : " + dd);
			}
		}
		
		return "forward:/mileageAdd";
		
	}


}

