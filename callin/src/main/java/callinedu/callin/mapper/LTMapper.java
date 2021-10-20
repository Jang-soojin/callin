package callinedu.callin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import callinedu.callin.domain.LTApplyCode;

@Mapper
public interface LTMapper {
	
	//레벨테스트 신청
	public int LTApply(LTApplyCode lTApplyCode);
	
	//레벨테스트신청목록조회
	public List<LTApplyCode> getLTApplyListBySearchKey(@Param(value = "levelSearchKey") 	String levelSearchKey
													  ,@Param(value = "lTApplySearchValue") String lTApplySearchValue
													  ,@Param(value = "searchStartDate") 	String searchStartDate
													  ,@Param(value = "searchEndDate") 		String searchEndDate);
	
	public List<LTApplyCode> LTListDetail();
		
	public List<LTApplyCode> LTListMynote();
	
}
