package callinedu.callin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import callinedu.callin.domain.Student;
import callinedu.callin.service.StudentService;


@Controller
@RequestMapping("/admin/mileage/")
public class MileageController {
	private final StudentService studentService;
		
	public MileageController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	
	
	/*
	 * @GetMapping("/mileageAdd") public String
	 * mileageAdd(@RequestParam(name="studentId", required = false) String
	 * studentId, Model model) { if(studentId!=null) { student student =
	 * studentService.getStudentInfoById(studentId); System.out.println(student+"");
	 * model.addAttribute("studentId", student.getStudentId());
	 * model.addAttribute("studentName", student.getStudentName());
	 * model.addAttribute("degreeName", student.getDegreeName()); }
	 * System.out.println("GET으로 실행"); model.addAttribute("title", "");
	 * model.addAttribute("midTitle", ""); model.addAttribute("cardTitle", "");
	 * 
	 * return "mileage/mileageAdd"; }
	 * 
	 * @PostMapping("/mileageAdd") public String mileageAddPost(student studentInfo,
	 * Model model) { System.out.println(""+studentInfo); student student =
	 * studentService.getStudentInfoById("id001"); System.out.println(student+"");
	 * model.addAttribute("studentId", student.getStudentId());
	 * model.addAttribute("studentName", student.getStudentName());
	 * model.addAttribute("degreeName", student.getDegreeName()); return
	 * "/mileage/mileageAdd"; }
	 * 
	 * 
	 */
	  @RequestMapping(value="mileageAdd") 
	  public String mileageAddPost(Student studentInfo, Model model) { 
		
		  System.out.println(""+studentInfo); 
		  Student student = new Student();
		  //student student = studentService.getStudentInfoById("id001"); // 지금 db 연결 안되어있잖앙ㅇㅇ 그래서 에러나는겨아까는 에러 안났어싾아 db연결 안되어있어서 내가 주석으로 막아논거였어아하
		  System.out.println(student+"");
		  model.addAttribute("studentId", student.getStudentId()); 
		  model.addAttribute("studentName", student.getStudentName()); 
		  model.addAttribute("degreeName",  student.getDegreeName());
			model.addAttribute("title", "마일리지");
			model.addAttribute("midTitle", "마일리지등록");
		  
		  //System.out.println("### map : " + studentService.getTest());
		 
	  return  "/mileage/mileageAdd"; 
	  } 
	 
	
	/**
	 * 검색
	 * @param param
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="mileageSearch")
	public @ResponseBody Map<String, Object> mileageSearch(@RequestParam Map<String, Object> param, HttpServletRequest request) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		// list 타입으로 가져오는 쿼리로 
		param.put("name", "홍길동");
		param.put("id", "hong");
		param.put("value", "hong");
		
		resultList.add(param);
		
		param = new HashMap<String, Object>();
		param.put("name", "홍길동2");
		param.put("id", "hong22");
		param.put("value", "hong22");
		resultList.add(param);
		
		resultMap.put("resultList", resultList);
		
		return resultMap;
	}
	
	/**
	 * 저장
	 * @param param
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="mileageSave")
	public String mileageSave(@RequestParam Map<String, Object> param, @RequestParam(value="moveSlct", required=false) String[] moveSlcts, HttpServletRequest request) throws Exception {
		System.out.println("### param : " + param);
		//여기도 실제 insert문 태우는걸로 
		//  moveSlcts 가 없어
		if(moveSlcts != null && moveSlcts.length > 0) {
			for(String dd : moveSlcts) {
				System.out.println("### moveSlcts : " + dd);
			}
		}
		
		return "forward:/mileageAdd";
		
	}


}

