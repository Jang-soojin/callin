package callinedu.callin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import callinedu.callin.domain.LT;
import callinedu.callin.domain.LTApplyCode;

@Mapper
public interface LTMapper {
	
	public List<LT> getLTList();
	
	public List<LTApplyCode> getLTApplyListBySearchKey(@Param(value = "levelSearchKey") 	String levelSearchKey
													  ,@Param(value = "lTApplySearchValue") String lTApplySearchValue
													  ,@Param(value = "searchStartDate") 	String searchStartDate
													  ,@Param(value = "searchEndDate") 		String searchEndDate);
	
	public List<LT> getLTListDetail();
		
	public List<LT> LTListMynote();
	
}
