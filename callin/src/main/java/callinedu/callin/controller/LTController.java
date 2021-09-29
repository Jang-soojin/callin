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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import callinedu.callin.domain.LT;
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
	
	@GetMapping("/LTApply")
	public String LTApply(Model model){ 
		System.out.println("constroller 실행");
		
		List<LT> lTApply = lTService.getLTList();
		System.out.println(lTApply);
		model.addAttribute("title", "레벨테스트신청");
		model.addAttribute("midTitle", "레벨테스트신청"); 
		
		return "LT/LTApply"; 
	}
	
	@GetMapping("/LTApplyList")
	public String LTApplyList(Model model){ 
		System.out.println("constroller 실행");
		
		List<LT> LTApplyList = lTService.getLTApplyList();
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
	
	@GetMapping("/LTListDetail")
	public String LTListDetail(Model model){ 
		System.out.println("constroller 실행");
		
		List<LT> lTListDetail = lTService.getLTListDetail();
		System.out.println(lTListDetail);
		model.addAttribute("title", "레벨테스트 상세정보");
		model.addAttribute("midTitle", "레벨테스트 상세정보"); 
		
		return "LT/LTListDetail"; 
	}
	
	@GetMapping("/LTListMynote")
	public String LTListMynote(Model model){ 
		System.out.println("constroller 실행");
		
		List<LT> lTListMynote = lTService.getLTListMynote();
		System.out.println(lTListMynote);
		model.addAttribute("title", "레벨테스트신청리스트");
		model.addAttribute("midTitle", "레벨테스트신청리스트"); 
		
		return "LT/LTListMynote"; 
	}
	
	@RequestMapping(value="LTApplyListBySearch", method= RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public List<LTApplyCode> getLTApplyListBySearchKey( @RequestParam(value="levelSearchKey", required = false) String levelSearchKey
													,@RequestParam(value="lTApplySearchValue", required = false) String lTApplySearchValue){
		log.info("레벨테스트신청리스트 검색 옵션 : {}", levelSearchKey);
		log.info("레벨테스트신청리스트 검색 옵션 : {}", lTApplySearchValue);
		
		List<LTApplyCode> lTApplyCodeList = lTService.getLTApplyListBySearchKey(levelSearchKey, lTApplySearchValue);
		
	    return lTApplyCodeList;
	}
	
	
}
