package callinedu.callin.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import callinedu.callin.domain.LT;
import callinedu.callin.service.LTService;

@Controller
@RequestMapping("/admin/LT/")
public class LTController {
	
	@GetMapping("/LTApply")
	public String LTApply(Model model){ 
		System.out.println("constroller 실행");
		
		List<LT> LTApply = LTService.getLTList();
		System.out.println(LTApply);
		model.addAttribute("title", "레벨테스트신청");
		model.addAttribute("LTApply",LTApply); 
		
		return "LT/LTApply"; 
	}
}
