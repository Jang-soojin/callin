package callinedu.callin.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import callinedu.callin.domain.LT;
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
	
	public List<LTApplyCode> getLTApplyListBySearchKey(String levelSearchKey, String lTApplySearchValue, String searchStartDate, String searchEndDate){

		if("studentName".equals(levelSearchKey)) 	levelSearchKey = "user_name";
		if("studentEmail".equals(levelSearchKey)) 	levelSearchKey = "user_email";
		if("studentTel".equals(levelSearchKey))		levelSearchKey = "user_phone";
		
		List<LTApplyCode> lTApplyCodeList = ltMapper.getLTApplyListBySearchKey(levelSearchKey, lTApplySearchValue, searchStartDate, searchEndDate );
		
		log.info("LTService 검색된 리스트: {}", lTApplyCodeList);
		
		return lTApplyCodeList;
	}

	public List<LT> getLTList() {
		
		return null;
	}
	public List<LT> getLTApplyList() {
		
		return null;
	}

	public List<LT> getLTListDetail() {
		
		return null;
	}


	public List<LT> getLTListMynote() {
		
		return null;
	}




	
}
