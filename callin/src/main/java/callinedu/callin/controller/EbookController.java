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

import callinedu.callin.domain.EbookData;
import callinedu.callin.service.EbookService;

@Controller
@RequestMapping("/admin/ebook")
public class EbookController {

	  private final EbookService ebookService;
	  
	  public EbookController(EbookService ebookService) {
		  this.ebookService = ebookService;
	  }
	 
	  //교재리스트화면
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
	 
}
