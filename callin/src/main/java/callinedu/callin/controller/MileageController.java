package callinedu.callin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import callinedu.callin.domain.ClassPolicy;
import callinedu.callin.domain.LTApplyCode;
import callinedu.callin.domain.Mileage;
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
		 
	  return  "/mileage/mileageAdd"; 
	  } 
	 
	
	  //검색
	@PostMapping(value="/mileageSearch", produces = "application/json")
	@ResponseBody
	public List<Student> mileageSearch(@RequestBody Map<String, Object> paramMap) {
		System.out.println(paramMap);
		List<Student> searchList = studentService.getMemberListBySearch(paramMap);
		return  searchList;
	}
	//저장
	/*@RequestMapping(value="mileageSave")
	public String mileageSave(@RequestParam Map<String, Object> param, @RequestParam(value="moveSlct", required=false) String[] moveSlcts, HttpServletRequest request, Mileage mileage ) throws Exception {
		System.out.println("### param : " + param);
		//여기도 실제 insert문 태우는걸로 
		//  moveSlcts 가 없어
		if(moveSlcts != null && moveSlcts.length > 0) {
			for(String dd : moveSlcts) {
				System.out.println("### moveSlcts : " + dd);
				int result = studentService.addMileage(mileage);
				
			}
			
			
			
			
		}	
		return "redirect:/admin/maileage/maileageAdd";
			
	}*/
	@PostMapping("addMileage")
	public String addMileage(Model model, @ModelAttribute Mileage Mileage) {
		System.out.println("마일리지등록 컨트롤러 실행" + "---" + Mileage.toString());
		model.addAttribute("title", "마일리지");
		model.addAttribute("midTitle", "마일리지등록");		
		
		int result = studentService.addMileage(Mileage);
		
		System.out.println(result);
		return "redirect:/admin/mileage/mileageAdd";
		
		
	}


}

