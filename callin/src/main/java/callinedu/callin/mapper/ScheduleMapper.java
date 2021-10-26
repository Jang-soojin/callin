package callinedu.callin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.Schedule;

@Mapper
public interface ScheduleMapper {

	public void saveSchedule(String title, String allDay, String startDay, String startTime, String endDay,String endTime);

	public List<Schedule> getAllSchedule();
	
}
