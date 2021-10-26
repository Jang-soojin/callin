package callinedu.callin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import callinedu.callin.service.ScheduleService;

@Controller
public class ScheduleController {
	
	private final ScheduleService scheduleService;
	
	public ScheduleController(ScheduleService scheduleService) {
		this.scheduleService = scheduleService;
	}
	
	@GetMapping("/teacherPage/myPage/calendar")
	public String calendar(){
		return "fullcalendar/calendar"; 
	}
	
	@PostMapping("/saveSchedule")
	@ResponseBody
	public String saveSchedule(@RequestBody List<Map<String,Object>> allData){  
		System.out.println(allData);
		scheduleService.saveSchedule(allData);
		String result = "저장 완료";
		return result; 
	}
	@PostMapping("/loadSchedule")
	@ResponseBody
	public ArrayList<Map<String,Object>> loadSchedule(){
		System.out.println("loadSchedule 요청 확인~");
		ArrayList<Map<String,Object>> allEvents = scheduleService.getAllSchdule();
		return allEvents;
	}
	
}
