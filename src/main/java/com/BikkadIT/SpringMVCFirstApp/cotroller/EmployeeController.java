package com.BikkadIT.SpringMVCFirstApp.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.SpringMVCFirstApp.model.Employee;

@Controller
public class EmployeeController {
	@GetMapping("/getData")
	public ModelAndView getEmp() {
		Employee emp=new Employee();
		emp.setEmpid(11);
		emp.setEmpname("Sachin");
		emp.setEmpAddr("Pune");
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("EMP", emp);
		mav.setViewName("employee");
		
		
		return mav;
		
		
	}

}
