package callinedu.callin.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import callinedu.callin.domain.StudentDetail;
import callinedu.callin.mapper.StudentDetailMapper;

@Service
public class StudentDetailService {
	
	public final StudentDetailMapper studentDetailMapper;
	
	@Autowired
	public StudentDetailService(StudentDetailMapper studentDetailMapper) {
		this.studentDetailMapper = studentDetailMapper;
	}
	public List<StudentDetail> getStudentDetailListBySearch(Map<String, Object> paramMap) {
		String searchKey = (String) paramMap.get("searchKey");
		if(searchKey != null && !searchKey.equals("")) {
			if("user_name".equals(searchKey))  paramMap.put("searchKey", "user_name");
			if("user_id".equals(searchKey)) paramMap.put("searchKey", "user_id");
			if("user_email".equals(searchKey)) paramMap.put("searchKey", "user_email");
		}
		return studentDetailMapper.getStudentDetailListBySearch(paramMap);
	}
	
	/**
	 * 학생상세정보 조회
	 * @param paramMap
	 * @return
	 */
	public StudentDetail getStudentDetailInfo(Map<String, Object> paramMap) {
		return studentDetailMapper.getStudentDetailInfo(paramMap);
	}
	
	/**
	 * 
	 * @param paramMap
	 * @return
	 */
	public void updateStudentDetail(Map<String, Object> paramMap) {
		studentDetailMapper.updateStudentDetail(paramMap);
		studentDetailMapper.updateStudentDetail2(paramMap);
	}
}
