package callinedu.callin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import callinedu.callin.domain.Teacher;
import callinedu.callin.domain.TeacherSalarySettlement;
import callinedu.callin.service.TeacherService;


@Controller
@RequestMapping("/admin/teacher")
public class TeacherController {
	private final TeacherService teacherService;
		
	public TeacherController(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	@GetMapping("/teacherTotalList")
	public String getTeacherTotalList(Model model){ 
		List<Teacher> teacherList = teacherService.getTeacherList();
		model.addAttribute("title", "강사 목록");
		model.addAttribute("teacherList",teacherList); 
		return "teacher/teacherTotalList"; 
	}
	@GetMapping("/teacherModify")
	public String modifyTeacher(@RequestParam String id, Model model){ 
		System.out.println(id);
		Teacher teacherInfo = teacherService.getTeacherInfoById(id);
		model.addAttribute("teacher", teacherInfo);
		return "teacher/teacherModify"; 
	}
	
	@GetMapping("/teacherList")
	public String getTeacherList(Model model){ 
		List<Teacher> teacherList = teacherService.getTeacherList();
		model.addAttribute("title", "강사 목록");
		model.addAttribute("midTitle", "강사 목록");
		model.addAttribute("teacherList",teacherList); 
		return "teacher/teacherList"; 
	}
	
	@GetMapping("/teacherRegister")
	public String teacherRegister(Model model){ 
		model.addAttribute("title", "강사 등록");
		model.addAttribute("midTitle", "강사 등록");
		return "teacher/teacherRegister"; 
	}
	
	@GetMapping("/teacherSalaryList")
	public String teacherSalaryList(Model model){ 
		
		List<TeacherSalarySettlement> teacherSalaryList = teacherService.getTeacherSalaryList();
		model.addAttribute("title", "강사 급여 정산 목록");
		model.addAttribute("midTitle", "강사료 정산 리스트");
		model.addAttribute("teacherSalaryList",teacherSalaryList); 
		System.out.println(teacherSalaryList);
		
		return "teacher/teacherSalaryList"; 
	}
	
	@PostMapping(value="/searchSalaryList", produces = "application/json")
	@ResponseBody
	public List<TeacherSalarySettlement> searchSalaryList(@RequestParam Map<String, Object> map, Model model) {
		List<TeacherSalarySettlement> searchSalaryList = teacherService.searchSalaryList(map);
		return  searchSalaryList;
	}
	
	@GetMapping("/teacherSalary")
	public String teacherSalary(Model model) {
		model.addAttribute("title", "강사 급여 정산");
		model.addAttribute("midTitle", "강사 급여 정산");
		model.addAttribute("cardTitle", "강사 상세 정보");
			
		return "teacher/teacherSalary";
	}
	
	@PostMapping("/teacherRegister")
	public String teacherRegister(@RequestParam Map<String, String> map){ 
		System.out.println(map);
		teacherService.registerTeacher(map);
		return "redirect:/admin/teacher/teacherRegister"; 
	}
	@PostMapping("/teacherModify")
	public String teacherModify(@RequestParam Map<String, String> map){ 
		System.out.println(map);
		teacherService.modifyTeacher(map);
		return "redirect:/admin/teacher/teacherTotalList"; 
	}
	
	@PostMapping("/teacherSalary")
	public String teacherSalarySettlement(TeacherSalarySettlement teacherSalarySettlement){ 
		System.out.println(teacherSalarySettlement);
		teacherService.addTeacherSalarySettlement(teacherSalarySettlement);
		return "redirect:/admin/teacher/teacherSalary"; 
	}
	
	
	@PostMapping(value="/teacherSalaryAjax", produces = "application/json")
	@ResponseBody
	public Teacher teacherSalaryAjax(String teacherId) {
		Teacher teacherInfo = teacherService.getTeacherInfoById(teacherId);
		return  teacherInfo;
	}
	
	
	@PostMapping(value="/getTotalWorkHour", produces = "application/json")
	@ResponseBody
	public int getTotalWorkHour(@RequestParam Map<String, Object> map) {
		System.out.println("파라미터 맵"+map);
		String teacherId = (String)map.get("teacherId");
		String dateRangeFirst = (String)map.get("dateRangeFirst");
		String dateRangeLast = (String)map.get("dateRangeLast");
		
		int totalWorkHour = teacherService.getTotalWorkHour(teacherId, dateRangeFirst, dateRangeLast);
		
		System.out.println(totalWorkHour+"totalWorkHour");
		
		return  totalWorkHour;
	}

	

}

