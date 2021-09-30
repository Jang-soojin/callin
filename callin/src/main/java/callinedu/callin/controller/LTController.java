package callinedu.callin.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
		model.addAttribute("midTitle", "레벨테스트신청"); 
		
		return "LT/LTApply"; 
	}
	
	@GetMapping("/LTApplyList")
	public String LTApplyList(Model model){ 
		System.out.println("constroller 실행");
		
		List<LT> LTApplyList = LTService.getLTApplyList();
		System.out.println(LTApplyList);
		model.addAttribute("title", "레벨테스트신청리스트");
		model.addAttribute("midTitle", "레벨테스트신청리스트"); 
		
		return "LT/LTApplyList"; 
	}
	
	
	@PostMapping(value="/LTApplyListAjax", produces = "application/json")
	@ResponseBody
	public Map<String,Object> LTApplyListAjax(Model model, @RequestParam("time") String time, @RequestParam("part") String part, @RequestParam("nday") String nday ){ 
		
		Map<String,Object> map = new HashMap<String,Object>();
		int result = 0; //사용가능여부
		int partInt = 0;
		if(part != null) {
			partInt = Integer.parseInt(part);
		}
		
		if(partInt % 2 == 0) {
			result = 1; //1 사용가능일자
		}
		
		map.put("result", result);
		
		return map; 
	}
}
