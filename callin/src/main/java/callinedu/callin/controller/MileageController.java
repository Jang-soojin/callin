package callinedu.callin.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import callinedu.callin.domain.Mileage;
import callinedu.callin.domain.Student;
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
		  
		  model.addAttribute("resnList", studentService.selectMileageResnList());
		  
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
	@PostMapping("addMileage")
	public String addMileage(Model model, @ModelAttribute Mileage Mileage, @RequestParam(value="moveSlct", required=false) String[] moveSlcts) {
		System.out.println("마일리지등록 컨트롤러 실행" + "---" + Mileage.toString());
		model.addAttribute("title", "마일리지");
		model.addAttribute("midTitle", "마일리지등록");		
		
		int result = studentService.addMileage(Mileage, moveSlcts);
		
		System.out.println(result);
		return "redirect:/admin/mileage/mileageAdd";
		
		
	}
	@GetMapping("/allMileageGet")
	public String allMileageGet(Model model){ 
		System.out.println("constroller 실행");
		


		model.addAttribute("resnList", studentService.selectMileageResnList());
		model.addAttribute("title", "전체 마일리지 검색");
		model.addAttribute("midTitle", "전체 마일리지 검색"); 
		
		return "mileage/allMileageGet"; 
	}
	
	//전체mileage 검색
	@PostMapping(value="/allMileageSearch", produces = "application/json")
	@ResponseBody
	public Map<String, Object> allMileageSearch(@RequestBody Map<String, Object> paramMap) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		System.out.println(paramMap);
		List<Mileage> allMileageSearch = studentService.getAllMileageListBySearch(paramMap);
		
		resultMap.put("miList", allMileageSearch);
		
		return  resultMap;
	}
	
	@GetMapping("/waitingMileageGet")
	public String waitingMileageGet(Model model){ 
		System.out.println("constroller 실행");
		


		
		model.addAttribute("resnList", studentService.selectMileageResnList());
		model.addAttribute("title", "대기 마일리지 검색");
		model.addAttribute("midTitle", "대기 마일리지 검색"); 
		
		return "mileage/waitingMileageGet"; 
	}
	//대기mileage 검색
	@PostMapping(value="/waitingMileageSearch", produces = "application/json")
	@ResponseBody
	public Map<String, Object> waitingMileageSearch(@RequestBody Map<String, Object> paramMap) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		System.out.println(paramMap);
		List<Mileage> waitingMileageSearch = studentService.getwaitingMileageListBySearch(paramMap);
		
		resultMap.put("miList", waitingMileageSearch);
		
		return  resultMap;
	}


}

