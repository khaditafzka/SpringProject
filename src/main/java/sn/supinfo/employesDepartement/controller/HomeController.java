package sn.supinfo.employesDepartement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sn.supinfo.employesDepartement.service.DepartementService;
import sn.supinfo.employesDepartement.service.EmployeService;

@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	EmployeService empService;
	
	@Autowired
	DepartementService deptService;

	@RequestMapping("/")
	public String landingPage(Model model) {
		model.addAttribute("countEmp", empService.getAllEmploye().size());
		model.addAttribute("countDept", deptService.getAllDepartement().size());
		return "index";
	}
}
