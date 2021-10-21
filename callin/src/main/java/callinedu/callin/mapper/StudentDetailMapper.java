package callinedu.callin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.StudentDetail;

@Mapper
public interface StudentDetailMapper {
	public List<StudentDetail> getStudentDetailListBySearch(Map<String, Object> paramMap);

}
