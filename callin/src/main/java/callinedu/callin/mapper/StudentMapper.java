package callinedu.callin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.Mileage;
import callinedu.callin.domain.Student;

@Mapper
public interface StudentMapper {
	public List<Student> getStudentList();
	public Student getStudentInfoById(String studentId);
	public List<Student> getMemberListBySearch(Map<String, Object> paramMap);
	public List<Mileage> getAllMileageListBySearch(Map<String, Object> paramMap);
	public List<Mileage> getwaitingMileageListBySearch(Map<String, Object> paramMap);
	public int addMileage(Mileage mileage);
	public List<Mileage> selectMileageResnList();
	
	/**
	 * 대기 마일리지 즉시적립으로 Update
	 * @param paramMap
	 */
	public void updateMileageWaiting(Map<String, Object> paramMap);
	/**
	 * 대기 마일리지  Delete
	 * @param paramMap
	 */
	public void deleteMileageWaiting(Map<String, Object> paramMap);

}
