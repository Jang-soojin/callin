package callinedu.callin.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import callinedu.callin.domain.StudentDetail;
import callinedu.callin.service.StudentDetailService;

@Controller
@RequestMapping("/admin/student/")
public class StudentDetailController {
	private final StudentDetailService studentDetailService;
		
	public StudentDetailController(StudentDetailService studentDetailService) {
		this.studentDetailService = studentDetailService;
	}
	
	@GetMapping("/studentDetailList")
	public  String studentDetailList(Model model){ 
		System.out.println("constroller 실행");
		
		model.addAttribute("title", "학생리스트");
		model.addAttribute("midTitle", "학생리스트"); 
		
		return "student/studentDetailList"; 
	}
	@PostMapping(value = "/studentDetailSearch", produces = "application/json")
	@ResponseBody
	public Map<String, Object> studentDetailSearch(@RequestBody Map<String, Object> paramMap){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		System.out.println(paramMap);
		List<StudentDetail> studentDetailSearch = studentDetailService.getStudentDetailListBySearch(paramMap);
		resultMap.put("studentList", studentDetailSearch);
		return resultMap;
	}


}

