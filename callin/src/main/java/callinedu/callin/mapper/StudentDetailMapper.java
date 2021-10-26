package callinedu.callin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.StudentDetail;

@Mapper
public interface StudentDetailMapper {
	public List<StudentDetail> getStudentDetailListBySearch(Map<String, Object> paramMap);
	
	/**
	 * 학생상세정보 조회
	 * @param paramMap
	 * @return
	 */
	public StudentDetail getStudentDetailInfo(Map<String, Object> paramMap);
	
	/**
	 * 
	 * @param paramMap
	 * @return
	 */
	public void updateStudentDetail(Map<String, Object> paramMap);
	
	/**
	 * 
	 * @param paramMap
	 * @return
	 */
	public void updateStudentDetail2(Map<String, Object> paramMap);

}
