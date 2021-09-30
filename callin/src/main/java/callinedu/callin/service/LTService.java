package callinedu.callin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import callinedu.callin.domain.LT;
import callinedu.callin.mapper.LTMapper;

@Service
public class LTService {
	
	
public final LTMapper ltMapper;
	
	@Autowired
	public LTService(LTMapper ltMapper) {
		this.ltMapper = ltMapper;
	}
	

	public static List<LT> getLTList() {
		
		return null;
	}
	public static List<LT> getLTApplyList() {
		
		return null;
	}




	
}
