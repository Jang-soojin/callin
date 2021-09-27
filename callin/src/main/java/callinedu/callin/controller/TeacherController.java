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
import callinedu.callin.service.TeacherService;


@Controller
@RequestMapping("/admin/teacher")
public class TeacherController {
	private final TeacherService teacherService;
		
	public TeacherController(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	@GetMapping("/teacherList")
	public String teacherList(Model model){ 
		
		List<Teacher> teacherList = teacherService.getTeacherList();
		model.addAttribute("title", "강사 목록");
		model.addAttribute("teacherList",teacherList); 
		
		return "teacher/teacherList"; 
	}
	@GetMapping("/teacherSalaryList")
	public String teacherSalaryList(Model model){ 
		
		List<Teacher> teacherList = teacherService.getTeacherList();
		model.addAttribute("title", "강사 급여 정산 목록");
		model.addAttribute("midTitle", "강사료 정산 리스트");
		model.addAttribute("teacherList",teacherList); 
		
		return "teacher/teacherSalaryList"; 
	}
	
	@GetMapping("/teacherSalary")
	public String teacherSalary(@RequestParam(name="teacherId", required = false) String teacherId,
								Model model) {
		if(teacherId!=null) {
		Teacher teacher = teacherService.getTeacherInfoById(teacherId);
		model.addAttribute("teacherId", teacher.getTeacherId());
		model.addAttribute("teacherName", teacher.getTeacherName());
		model.addAttribute("ContractType", teacher.getContractType());
		model.addAttribute("HourlyRate", teacher.getHourlyRate());
		}
		model.addAttribute("title", "강사 급여 정산");
		model.addAttribute("midTitle", "강사 급여 정산");
		model.addAttribute("cardTitle", "강사 상세 정보");
			
		return "teacher/teacherSalary";
		}
	@PostMapping("/teacherSalary")
	public String teacherSalaryPost(Teacher teacherInfo, Model model) {
		Teacher teacher = teacherService.getTeacherInfoById("id001");
		model.addAttribute("teacherId", teacher.getTeacherId());
		model.addAttribute("teacherName", teacher.getTeacherName());
		model.addAttribute("ContractType", teacher.getContractType());
		model.addAttribute("HourlyRate", teacher.getHourlyRate());
		return "teacher/teacherSalary";
	}
	
	@PostMapping(value="/teacherSalaryAjax", produces = "application/json")
	@ResponseBody
	public Teacher teacherSalaryAjax(Teacher teacherInfo, Model model) {
		model.addAttribute("teacherId", teacherInfo.getTeacherId());
		model.addAttribute("teacherName", teacherInfo.getTeacherName());
		model.addAttribute("ContractType", teacherInfo.getContractType());
		model.addAttribute("HourlyRate", teacherInfo.getHourlyRate());
		return  teacherInfo;
	}
	@PostMapping(value="/teacherSalaryAjax2", produces = "application/json")
	@ResponseBody
	public int teacherSalaryAjax2(@RequestParam Map<String, Object> map, Model model) {
		String teacherId = (String)map.get("teacherId");
		String dateRange1 = (String)map.get("dateRange1");
		String dateRange2 = (String)map.get("dateRange2");
		
		int totalWorkHour = teacherService.getTotalWorkHour(teacherId, dateRange1, dateRange2);
		
		System.out.println(totalWorkHour+"totalWorkHour");
		
		return  totalWorkHour;
	}


}

