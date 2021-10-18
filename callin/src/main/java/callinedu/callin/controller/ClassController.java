package callinedu.callin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import callinedu.callin.domain.ClassPolicy;
import callinedu.callin.domain.RegularClass;
import callinedu.callin.service.ClassService;

@Controller
@RequestMapping("/admin/class/")
public class ClassController {
	
	private static final Logger log = LoggerFactory.getLogger(ClassController.class);
	
	private final ClassService classService;
	
	public ClassController(ClassService classSercive) {
		this.classService = classSercive;
	}
	
	@GetMapping("classPolicy")
	public String classPolicy(Model model) {
		System.out.println("수업정책 등록 컨트롤러 실행 ");
		model.addAttribute("title", "수업관리");
		model.addAttribute("midTitle", "수업 정책 등록");
		
		return "class/classPolicy";
	}
	@GetMapping("classPolicyList")
	public String classPolicyList(Model model) {
		System.out.println("수업정책 리스트 컨트롤러 실행 ");
		model.addAttribute("title", "수업관리");
		model.addAttribute("midTitle", "수업 정책 리스트");
		List<ClassPolicy> classPolicy = classService.getClassPolicy();
	      
		model.addAttribute("classPolicy", classPolicy);
		
		return "class/classPolicyList";
	}
	
	@GetMapping("regularClass")
	public String regularClass(Model model) {
		System.out.println("정규수업 등록 컨트롤러 실행");
		model.addAttribute("title", "정규수업");
		model.addAttribute("midTitle", "정규수업등록");
		
		return "class/regularClass";
	}
	
	@GetMapping("classMain")
	public String classMain(Model model) {
		System.out.println("수업 카테고리 메인화면 보기 실행");
		model.addAttribute("title", "수업 메인");
		model.addAttribute("midTitle", "메인");
		
		return "class/classMain";
	}
	@GetMapping("regularClassList")
	public String regularClassList(Model model) {
		System.out.println("정규수업 리스트 컨트롤러 실행");
		model.addAttribute("title", "정규수업");
		model.addAttribute("midTitle", "정규 수업 리스트");
		
		return "class/regularClassList";
	}
	
	@PostMapping("addClassPolicy")
	public String addClassPolicy(Model model, @ModelAttribute ClassPolicy classPolicy) {
		System.out.println("정규수업 컨트롤러 실행" + "---" + classPolicy.toString());
		model.addAttribute("title", "정규수업");
		model.addAttribute("midTitle", "정규수업등록");		
		
		int result = classService.addClassPolicy(classPolicy);
		
		System.out.println(result);
		return "redirect:/admin/class/classPolicy";
		
		
	}
	@GetMapping("/deleteClassPolicy")
	public String removeMember(@RequestParam(name="classPolicyCode", required = false) String classPolicyCode
							  ,Model model){
		
		System.out.println("(removeMember)화면에서 입력받은 값 : " + classPolicyCode);
		
		model.addAttribute("title", "정책 삭제");
		model.addAttribute("classPolicyCode", classPolicyCode);
		String result = classService.deleteClassPolicy(classPolicyCode);
		if(classPolicyCode != null) model.addAttribute("classPolicyCode", classPolicyCode);
		return "redirect:/classPolicyList";
	}
	@RequestMapping(value="/classPolicyNameCheck", method= RequestMethod.POST)
	@ResponseBody
	public String classPolicyNameCheck(ClassPolicy classPolicy){
	    ClassPolicy c = classService.classPolicyNameCheck(classPolicy);
	    String message=null;
	    if(c==null) {
	        message = "success";
	    }else {
	        message = "fail";
	    }	
	    return message;
	}
	@RequestMapping(value="searchPolicyList", method= RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public List<ClassPolicy> searchPolicyList( 
			@RequestParam(value = "classPeriod",required = false) String classPeriod
		,	@RequestParam(value = "classDay", required = false) String classDay
		,	@RequestParam(value = "className", required = false) String className
		,	@RequestParam(value = "classTime", required = false) String classTime
			){
		
		log.info("수업기간 검색 옵션 : {}", classPeriod);
		log.info("수업요일 검색 옵션 : {}", classDay);
		log.info("수업시간 검색 옵션 : {}", classTime);
		log.info("수업시간 검색 옵션 : {}", className);
		
		List<ClassPolicy> classPolicyList = classService.searchPolicyList(classPeriod, classDay, classTime, className);
		
		return classPolicyList;
	}
	@GetMapping("/List")
	   public String List(Model model) {
	      model.addAttribute("title", "UPBUS");
	      model.addAttribute("h1text", "전체 회원 목록");
	      List<ClassPolicy> classPolicy = classService.getClassPolicy();
	      
	      model.addAttribute("classPolicy", classPolicy);
	      return "admin/class/classPolicyList";
	   }

}
