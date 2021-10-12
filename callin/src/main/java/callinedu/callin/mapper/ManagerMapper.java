package callinedu.callin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import callinedu.callin.domain.Manager;
import callinedu.callin.domain.ManagerSalarySettlement;

@Mapper
public interface ManagerMapper {

	public List<Manager> getManagerList();

	public Manager getManagerInfoById(String managerId);

	public int getManangerAbsent(String managerId, String dateRangeFirst, String dateRangeLast);

	public int getIncomeTax(String dependantsNum, String milliTaxFreeTotal);

	public int saveManagerSalary(ManagerSalarySettlement managerSalarySettlement);
}
