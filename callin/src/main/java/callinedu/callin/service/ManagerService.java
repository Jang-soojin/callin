package callinedu.callin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import callinedu.callin.domain.Manager;
import callinedu.callin.domain.ManagerSalarySettlement;
import callinedu.callin.mapper.ManagerMapper;

@Service
public class ManagerService {

	public final ManagerMapper managerMapper;
	
	@Autowired
	public ManagerService(ManagerMapper managerMapper) {
		this.managerMapper = managerMapper;
	}

	public List<Manager> getManagerList() {
		
		List<Manager> managerList = managerMapper.getManagerList();
		return managerList;
	}

	public Manager getManagerInfoById(String managerId) {
		Manager managerinfo = managerMapper.getManagerInfoById(managerId);
		return managerinfo;
	}

	public int getManangerAbsent(String managerId, String dateRangeFirst, String dateRangeLast) {
		
		int getManangerAbsent = managerMapper.getManangerAbsent(managerId, dateRangeFirst, dateRangeLast);
		return  getManangerAbsent;
	}

	public int getIncomeTax(String dependantsNum, String milliTaxFreeTotal) {
		int IncomeTax = managerMapper.getIncomeTax(dependantsNum, milliTaxFreeTotal);
		return  IncomeTax;
	}

	public void saveManagerSalary(ManagerSalarySettlement managerSalarySettlement) {
		managerMapper.saveManagerSalary(managerSalarySettlement);
	}

	public List<ManagerSalarySettlement> managerSalaryList() {
		List<ManagerSalarySettlement> managerSalaryList = managerMapper.managerSalaryList();
		return managerSalaryList;
	}
	
}
