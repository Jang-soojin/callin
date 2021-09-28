package callinedu.callin.service;

import org.springframework.stereotype.Service;

import callinedu.callin.domain.ClassPolicy;
import callinedu.callin.mapper.ClassMapper;

@Service
public class ClassService {
	
	public final ClassMapper classMapper;
	
	public ClassService(ClassMapper classMapper) {
		this.classMapper = classMapper;
	}
	
	public int addClassPolicy(ClassPolicy classPolicy) {
		return classMapper.addClassPolicy(classPolicy);
	}
	
	public ClassPolicy classPolicyNameCheck(ClassPolicy classPolicy) {
	    ClassPolicy c =	classMapper.classPolicyNameCheck(classPolicy);
	    return c;
	}
}
