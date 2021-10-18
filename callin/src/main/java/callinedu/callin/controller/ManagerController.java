package callinedu.callin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import callinedu.callin.domain.Manager;
import callinedu.callin.domain.ManagerSalarySettlement;
import callinedu.callin.service.ManagerService;


@Controller
@RequestMapping("/admin/manager")
public class ManagerController {
	private final ManagerService managerService;
	public ManagerController(ManagerService managerService) {
		this.managerService = managerService;
	}
	
	@GetMapping("/managerSalary")
	public String ManagerSalary() {
		return "manager/managerSalary";
	}
	
	@GetMapping("/managerList")
	public String getManagerList(Model model) {
		List<Manager> managerList = managerService.getManagerList();
		model.addAttribute("title", "매니저 목록");
		model.addAttribute("managerList", managerList);
		return "manager/managerList";
	}
	
	
	@PostMapping(value="/getManagerInfoById", produces = "application/json")
	@ResponseBody
	public Manager getManagerInfoById(String managerId) {
		Manager managerInfo = managerService.getManagerInfoById(managerId);
		return  managerInfo;
	}
	
	@PostMapping(value="/manangerAbsent", produces = "application/json")
	@ResponseBody
	public int getManangerAbsent(String managerId, String dateRangeFirst, String dateRangeLast) {
		int getManangerAbsent = managerService.getManangerAbsent(managerId, dateRangeFirst, dateRangeLast);
		return  getManangerAbsent;
	}
	
	@PostMapping(value="/incomeTax", produces = "application/json")
	@ResponseBody
	public int getIncomeTax(String dependantsNum, String milliTaxFreeTotal) {
		int incomeTax = managerService.getIncomeTax(dependantsNum, milliTaxFreeTotal);
		return  incomeTax;
	}
	
	@PostMapping("/save")
	public String saveManagerSalary(ManagerSalarySettlement managerSalarySettlement) {
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆"+managerSalarySettlement);
		managerService.saveManagerSalary(managerSalarySettlement);
		return "redirect:/admin/manager/managerSalary"; 
	}
}


