package callinedu.callin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.LTApplyCode;

@Mapper
public interface LTMapper {
	
	//레벨테스트 신청
	public int LTApply(String studentId
			, String userNameEx
			, String userNicknameEx
			, String skypeIdEx
			, String userEmailEx
			, String userPhoneEx
			, String lTHopeDate
			, String lTHopeTime
			, String requestedTerm
			);

	//레벨테스트신청목록조회
	public List<LTApplyCode> getlTApplyList();
	
	//레벨테스트신청목록검색
	public List<LTApplyCode> getLTApplyListBySearchKey(String searchKey
													  ,String searchValue
													  ,String dateRangeFirst
													  ,String dateRangeLast);
	//LT신청삭제
	public int deleteLTApplyList(String ltCode);
	
	
	public List<LTApplyCode> LTListDetail();
		
	public List<LTApplyCode> LTListMynote();


}
