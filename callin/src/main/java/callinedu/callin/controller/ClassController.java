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

import callinedu.callin.domain.ClassApply;
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
	
	@PostMapping("modifyPolicy")
	public String modifyPolicy(ClassPolicy classPolicy) {
		System.out.println("수업정책 수정 컨트롤러 실행");
		classService.modifyPolicy(classPolicy);
		return "redirect:/admin/class/classPolicyList";
	}
	
	@GetMapping("modifyPolicy")
	public String modifyPolicy(@RequestParam(name = "classPolicyCode", required = false) String classPolicyCode ,Model model) {
		System.out.println("=========================");
		System.out.println("classPolicyCode : " + classPolicyCode);
		System.out.println("=========================");
		
		ClassPolicy classPolicy = classService.getPolicyInfoByCode(classPolicyCode);
		
		System.out.println("수업정책 수정 컨트롤러 실행");
		model.addAttribute("title", "수업관리");
		model.addAttribute("midTitle", "수업 정책 수정");
		model.addAttribute("classPolicy", classPolicy);
		
		
		return "class/modifyPolicy";
	}
	
	@GetMapping("regularClass")
	public String regularClass(Model model) {
		System.out.println("정규수업 등록 컨트롤러 실행");
		model.addAttribute("title", "정규수업");
		model.addAttribute("midTitle", "정규수업등록");
		List<ClassPolicy> classPolicy = classService.getClassPolicy();
		model.addAttribute("classPolicy", classPolicy);
		
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
		List<RegularClass> regularClass = classService.getRegularClass();
		
		model.addAttribute("regularClass", regularClass);
		
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
	public String deleteClassPolicy(@RequestParam(name="classPolicyCode", required = false) String classPolicyCode
							  ,Model model){
		
		System.out.println("(deleteClassPolicy)화면에서 입력받은 값 : " + classPolicyCode);
		
		model.addAttribute("title", "정책 삭제");
		model.addAttribute("classPolicyCode", classPolicyCode);
		classService.deleteClassPolicy(classPolicyCode);
		if(classPolicyCode != null) model.addAttribute("classPolicyCode", classPolicyCode);
		return "redirect:/admin/class/classPolicyList";
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
	
	@RequestMapping(value="classPolicyListBySearch", method= RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public List<ClassPolicy> getClassPolicyListBySearchKey( @RequestParam(value="levelSearchKey", required = false) String levelSearchKey
													,@RequestParam(value="classPolicySearchValue", required = false) String classPolicySearchValue){
		
		log.info("정책 리스트 검색 옵션 : {}", levelSearchKey);
		log.info("정책 리스트 검색 옵션 : {}", classPolicySearchValue);
		
		List<ClassPolicy> classPolicyList = classService.getClassPolicyListBySearchKey(levelSearchKey, classPolicySearchValue);
		
	    return classPolicyList;
	}
	
	@PostMapping("addRegularClass")
	public String addRegularClass(Model model, @ModelAttribute RegularClass regularClass) {
		System.out.println("정규수업 컨트롤러 실행" + "---" + regularClass.toString());
		model.addAttribute("title", "정규수업");
		model.addAttribute("midTitle", "정규수업등록");	
		
		int result = classService.addRegularClass(regularClass);
		
		System.out.println(result);
		
		return "redirect:/admin/class/regularClass";
		
		
	}
	@GetMapping("classApplyList")
	public String ClassPolicyList(Model model) {
		System.out.println("정규수업 리스트 컨트롤러 실행");
		model.addAttribute("title", "정규수업");
		model.addAttribute("midTitle", "정규 수업 리스트");
		List<ClassApply> classApplyList = classService.getClassApplyList();
		
		model.addAttribute("classApplyList", classApplyList);
		
		return "class/classApplyList";
	}
}
