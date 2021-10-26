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

import callinedu.callin.domain.EbookData;
import callinedu.callin.service.EbookService;

@Controller
@RequestMapping("/admin/ebook")
public class EbookController {
	
	
	private static final Logger log = LoggerFactory.getLogger(EbookController.class);

	private final EbookService ebookService;
	  
	public EbookController(EbookService ebookService) {
		this.ebookService = ebookService;
	}
	
	

	
	  
	//교재등록화면
	@GetMapping("/ebookRegister")
	public String ebookRegister(Model model){ 
			
		model.addAttribute("title", "교재관리");
		model.addAttribute("midTitle", "교재등록"); 
		
		return "ebook/ebookRegister"; 
	}
	
	//교재등록
	@PostMapping("ebookRegister")
	public String ebookRegister(@RequestParam Map<String, Object> map) {
		
		log.info("교재 등록 옵션 : {}", map);
		ebookService.ebookRegister(map);
		
		return "redirect:/admin/ebook/ebookRegister";
	}
	
	
	  
	  
	//교재목록화면
	@GetMapping("/ebookList")
	public String getEbookList(Model model) {
		List<EbookData> ebookList = ebookService.getEbookList();
		model.addAttribute("title", "교재 관리");
		model.addAttribute("midTitle","교재 리스트");
		model.addAttribute("ebookList",ebookList);
			  
		return "ebook/ebookList";
	}
	
	  
	//교재목록조회
	@PostMapping(value="/searchEbookList", produces = "application/json")
	@ResponseBody
	public List<EbookData> searchEbookList(@RequestParam Map<String, Object> map, Model model) {
	 
		List<EbookData> searchEbookList = ebookService.getEbookListBySearchKey(map);
		  
		return searchEbookList; 
	}
	
	//교재삭제
	@GetMapping("/deleteEbookList")
	public String deleteEbookList(@RequestParam(name="ebookDataCode",required = false) String ebookDataCode
									,Model model) {
		
		System.out.println("(deleteEbookList)화면에서 입력받은 값:" + ebookDataCode);
		
		model.addAttribute("title", "교재 삭제");
		model.addAttribute("ebookDataCode", ebookDataCode);
		ebookService.deleteEbookList(ebookDataCode);
		if(ebookDataCode != null) model.addAttribute("ebookDataCode",ebookDataCode);
		
		return "redirect:/admin/ebook/ebookList";
	}
		 
	//교재삭제Ajax
	@PostMapping(value="/deleteEbookListAjax", produces = "application/json")
	@ResponseBody
	public Map<String, Object> deleteEbookListAjax(@RequestBody Map<String, Object> paramMap) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		System.out.println(paramMap);
		
		ebookService.deleteEbookListAjax(paramMap);
		
		resultMap.put("paramMap", paramMap);
		
		return resultMap;
	}
	
}

