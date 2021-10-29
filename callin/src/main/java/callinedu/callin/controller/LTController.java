package callinedu.callin.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import callinedu.callin.domain.LTApplyCode;
import callinedu.callin.service.LTService;

@Controller
@RequestMapping("/admin/LT/")
public class LTController {
	
	
	private static final Logger log = LoggerFactory.getLogger(LTController.class);

	private final LTService lTService;
	
	public LTController(LTService lTService) {
		this.lTService =lTService;
	}
	
	//레벨테스트신청화면
	@GetMapping("/LTApply")
	public String LTApply(Model model){ 
		System.out.println("constroller 실행");
		
		model.addAttribute("title", "레벨테스트신청");
		model.addAttribute("midTitle", "레벨테스트신청"); 
		
		return "LT/LTApply"; 
	}
	
	//레벨테스트신청
	@PostMapping("/LTApply")
	public String LTApply(@RequestParam Map<String, Object> map) {
		System.out.println("커맨드 객체 : map : " + map);
		
		lTService.LTApply(map);
		return "redirect:/admin/LT/LTApply";
		
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
	
	//LT신청목록조회
	@GetMapping("/LTApplyList")
	public String getLTApplyList(Model model){ 
		List<LTApplyCode> LTApplyList = lTService.getLTApplyList();
		model.addAttribute("title", "레벨테스트신청리스트");
		model.addAttribute("midTitle", "레벨테스트신청리스트"); 
		model.addAttribute("LTApplyList", LTApplyList); 
		log.info("레벨테스트신청리스트 검색 옵션 : {}", LTApplyList);
		
		return "LT/LTApplyList"; 
	}
	
	//LT신청목록검색
	@PostMapping(value="LTApplyListBySearch", produces = "application/json")
	@ResponseBody
	public List<LTApplyCode> LTApplyListBySearch(@RequestParam Map<String, Object> map, Model model){
		log.info("레벨테스트신청리스트 검색 옵션 : {}", map);
		List<LTApplyCode> lTApplyCodeList = lTService.getLTApplyListBySearchKey(map);
		
	    return lTApplyCodeList;
	}
	
	//LT신청목록삭제
	@GetMapping("/deleteLTApplyList")
	public String deleteLTApplyList(@RequestParam(name="ltCode",required = false) String ltCode
									,Model model) {
		
		System.out.println("(deleteLTApplyList)화면에서 입력받은 값:" + ltCode);
		
		model.addAttribute("title", "LT신청삭제");
		model.addAttribute("ltCode", ltCode);
		lTService.deleteLTApplyList(ltCode);
		if(ltCode != null) model.addAttribute("ltCode",ltCode);
		
		return "redirect:/admin/LT/LTApplyList";
	}
	
	
	@GetMapping("/LTListDetail")
	public String LTListDetail(Model model){ 
		System.out.println("constroller 실행");
		
		List<LTApplyCode> lTListDetail = lTService.LTListDetail();
		System.out.println(lTListDetail);
		model.addAttribute("title", "레벨테스트 상세정보");
		model.addAttribute("midTitle", "레벨테스트 상세정보"); 
		
		return "LT/LTListDetail"; 
	}
	
	@GetMapping("/LTListMynote")
	public String LTListMynote(Model model){ 
		System.out.println("constroller 실행");
		
		List<LTApplyCode> lTListMynote = lTService.LTListMynote();
		System.out.println(lTListMynote);
		model.addAttribute("title", "레벨테스트신청리스트");
		model.addAttribute("midTitle", "레벨테스트신청리스트"); 
		
		return "LT/LTListMynote"; 
	}
}
