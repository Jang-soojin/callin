package callinedu.callin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import callinedu.callin.domain.Teacher;
import callinedu.callin.service.TeacherService;


@Controller
@RequestMapping("/admin/manager")
public class ManagerController {
	private final TeacherService teacherService;
	public ManagerController(TeacherService teacherService) {
		this.teacherService = teacherService;
	}
	
	@GetMapping("/managerList")
	public String managerList(Model model){ 
		System.out.println("constroller 실행");
		
		List<Teacher> teacherList = teacherService.getTeacherList();
		System.out.println(teacherList);
		model.addAttribute("title", "매니저 목록");
		model.addAttribute("teacherList",teacherList); 
		
		return "manager/managerList"; 
	}
	
	@GetMapping("/managerSalary")
	public String managerSalary(@RequestParam(name="teacherId", required = false) String teacherId,
								Model model) {
		if(teacherId!=null) {
		Teacher teacher = teacherService.getTeacherInfoById(teacherId);
		System.out.println(teacher+"★★★★★★★★★★★★★★★★★");
		model.addAttribute("teacherId", teacher.getTeacherId());
		model.addAttribute("teacherName", teacher.getTeacherId()); // 쿼리 확인용 임시(삭제예정)
		model.addAttribute("ContractType", teacher.getContractTypeCode());
		model.addAttribute("HourlyRate", teacher.getUnitPay());
		}
		System.out.println("GET으로 실행");
		model.addAttribute("title", "매니저 급여 정산");
		model.addAttribute("midTitle", "매니저 급여 정산");
		model.addAttribute("cardTitle", "매니저 상세 정보");
			
		return "manager/managerSalary";
		}
	@PostMapping("/managerSalary")
	public String managerSalary(Teacher teacherInfo, Model model) {
		System.out.println("★★★★★★★★★★★★★★★★★"+teacherInfo);
		Teacher teacher = teacherService.getTeacherInfoById("id001");
		System.out.println(teacher+"★★★★★★★★★★★★★★★★★");
		model.addAttribute("teacherId", teacher.getTeacherId());
		model.addAttribute("teacherName", teacher.getTeacherId()); // 쿼리 확인용 임시(삭제예정)
		model.addAttribute("ContractType", teacher.getContractTypeCode());
		model.addAttribute("HourlyRate", teacher.getUnitPay());
		return "manager/managerSalary";
	}


}

