package callinedu.callin.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import callinedu.callin.domain.LTApplyCode;
import callinedu.callin.mapper.LTMapper;

@Service
public class LTService {
	
	private static final Logger log = LoggerFactory.getLogger(LTService.class);

	public final LTMapper ltMapper;
	
	@Autowired
	public LTService(LTMapper ltMapper) {
		this.ltMapper = ltMapper;
	}
	
	//LT신청
	public int LTApply(Map<String, Object> map ) {
		String tdate = (String) map.get("tdate");
		String studentId = (String) map.get("studentId");
		String userNameEx = (String) map.get("userNameEx");
		String userNicknameEx = (String) map.get("userNicknameEx");
		String skypeIdEx = (String) map.get("skypeIdEx");
		String userEmailEx = (String) map.get("userEmailEx");
		String userPhoneEx = (String) map.get("userPhoneEx");
		String requestedTerm = (String) map.get("requestedTerm");
		
		
		String lTHopeDate = tdate.substring(0, 10);
		String lTHopeTime1 = tdate.substring(11, 13);
		String lTHopeTime2 = tdate.substring(15, 17);
		String lTHopeTime = lTHopeTime1+":"+lTHopeTime2+":00";
		
		
		System.out.println("lTHopeDate:"+lTHopeDate);
		System.out.println("lTHopetime1:"+ lTHopeTime1);
		System.out.println("lTHopetime2:"+lTHopeTime2);
		return ltMapper.LTApply(studentId, userNameEx, userNicknameEx, skypeIdEx, userEmailEx, userPhoneEx, lTHopeDate, lTHopeTime, requestedTerm);
	}
	
	//LT신청목록조회
	public List<LTApplyCode> getLTApplyList() {
		List<LTApplyCode> lTApplyList = ltMapper.getlTApplyList();
		return lTApplyList;
	}
	
	//LT신청목록검색
	public List<LTApplyCode> getLTApplyListBySearchKey(Map<String,Object> map){
		
		String searchKey = (String)map.get("searchKey");
		String searchValue = (String)map.get("searchValue");
		String dateRangeFirst = (String)map.get("dateRangeFirst");
		String dateRangeLast = (String)map.get("dateRangeLast");
		
		List<LTApplyCode> lTApplyCodeList = ltMapper.getLTApplyListBySearchKey(searchKey, searchValue, dateRangeFirst, dateRangeLast);
		
		return lTApplyCodeList;
	}
	
	//LT신청목록삭제
	public int deleteLTApplyList(String ebookDataCode) {
		return ltMapper.deleteLTApplyList(ebookDataCode);
	}
	//LT신청목록삭제 Ajax
	public void deleteLTApplyListAjax(Map<String, Object> paramMap) {
		ltMapper.deleteLTApplyListAjax(paramMap);
	}
	
	
	
	

	public List<LTApplyCode> LTListDetail() {
		
		return null;
	}


	public List<LTApplyCode> LTListMynote() {
		
		return null;
	}






	



	
}
