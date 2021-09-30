package callinedu.callin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import callinedu.callin.domain.ClassPolicy;
import callinedu.callin.service.ClassService;

@Controller
@RequestMapping("/admin/class/")
public class ClassController {
	private final ClassService classService;
	
	public ClassController(ClassService classSercive) {
		this.classService = classSercive;
	}
	
	@GetMapping("classPolicy")
	public String classPolicy(Model model) {
		System.out.println("수업정책 컨트롤러 실행 ");
		model.addAttribute("title", "수업관리");
		model.addAttribute("midTitle", "수업 정책 등록");
		
		return "class/classPolicy";
	}
	
	@GetMapping("regularClass")
	public String regularClass(Model model) {
		System.out.println("정규수업 컨트롤러 실행");
		model.addAttribute("title", "정규수업");
		model.addAttribute("midTitle", "정규수업등록");
		
		return "class/regularClass";
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
	@RequestMapping(value="/classPolicyNameCheck", method= RequestMethod.POST)
	@ResponseBody
	public String classPolicyNameCheck(ClassPolicy classPolicy){
	    //select * from member where userid = #{};
	    //이 member 객체에는 id만 값이 들어있고, 다른 것은 다 null 값이다.
	    ClassPolicy c = classService.classPolicyNameCheck(classPolicy);
	    String message=null;
	    if(c==null) {//사용할 수 있다. db에서 찾았는데없으니까
	        message = "success";
	    }else {//사용할 수 없다.
	        message = "fail";
	    }	
	    return message;
	}
	
}
