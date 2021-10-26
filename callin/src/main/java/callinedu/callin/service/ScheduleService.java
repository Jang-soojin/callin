package callinedu.callin.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import callinedu.callin.domain.Schedule;
import callinedu.callin.mapper.ScheduleMapper;

@Service
public class ScheduleService {
	
	public final ScheduleMapper scheduleMapper;
	
	@Autowired
	public ScheduleService(ScheduleMapper scheduleMapper) {
		this.scheduleMapper = scheduleMapper;
	}

	public void saveSchedule(List<Map<String, Object>> allData) {
		for(int i=0; i<allData.size(); i++) {
			String title = (String) allData.get(i).get("title");
			Boolean allDayBoolean = (Boolean) allData.get(i).get("allDay");
			String start = (String) allData.get(i).get("start");
			String end = (String) allData.get(i).get("end");
			
			String allDay = String.valueOf(allDayBoolean); 
			String startDay = start.substring(0,10);
			String startTime = start.substring(11,19);
			String endDay = end.substring(0,10);
			String endTime = end.substring(11,19);
			
			scheduleMapper.saveSchedule(title, allDay,startDay,startTime,endDay,endTime);
//			System.out.println("title : "+ title);
//			System.out.println("startDay : "+ startDay);
//			System.out.println("startTime : "+ startTime);
//			System.out.println("endDay : "+  endDay);
//			System.out.println("endTime : "+ endTime);
//			System.out.println("allDay : "+ allDay);
		}
	}

	public ArrayList<Map<String, Object>> getAllSchdule() {
		System.out.println("getAllSchdule 요청 확인~");
		List<Schedule> scheduleList = scheduleMapper.getAllSchedule();
		
		System.out.println("scheduleList 확인~ : "+ scheduleList);
		System.out.println("scheduleList 길이 확인~ : "+ scheduleList.size());
		ArrayList<Map<String,Object>> allEvents = new ArrayList<>();
		for(int i=0; i<scheduleList.size(); i++) {
			Map<String, Object> obj = new HashMap<String,Object>();
			String title = scheduleList.get(i).getStudentId2();
			String startDay = scheduleList.get(i).getClassStartDay();
			String startTime = scheduleList.get(i).getClassStartTime();
			String endDay = scheduleList.get(i).getClassEndDay();
			String endTime = scheduleList.get(i).getClassEndTime();	
			String allDay = scheduleList.get(i).getAllDay();
			
			String startYear = startDay.substring(0,4); 
			int startMonth = Integer.parseInt(startDay.substring(5,7))-1; 
			String startDate = startDay.substring(8,10); 
			String startHour = startTime.substring(0,2); 
			String startMinute = startTime.substring(3,5); 
			String endYear = endDay.substring(0,4); 
			int endMonth = Integer.parseInt(endDay.substring(5,7))-1; 
			String endDate = endDay.substring(8,10); 
			String endHour = endTime.substring(0,2); 
			String endMinute = endTime.substring(3,5); 
			
			obj.put("title", title);
			obj.put("startYear", startYear);
			obj.put("startMonth", startMonth);
			obj.put("startDate", startDate);
			obj.put("startHour", startHour);
			obj.put("startMinute", startMinute);
			obj.put("endYear", endYear);
			obj.put("endMonth", endMonth);
			obj.put("endDate", endDate);
			obj.put("endHour", endHour);
			obj.put("endMinute", endMinute);
			obj.put("allDay", allDay);
			
			allEvents.add(obj);
		}
		System.out.println("조회된 이벤트 목록 출력");
		System.out.println(allEvents);
		
		return allEvents;
	}

}
