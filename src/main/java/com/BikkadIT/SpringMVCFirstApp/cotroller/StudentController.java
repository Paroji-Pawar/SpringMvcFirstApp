package com.BikkadIT.SpringMVCFirstApp.cotroller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.SpringMVCFirstApp.model.Student;

@Controller
public class StudentController {
    @GetMapping("/getStu")
	public ModelAndView getStudent() {
		Student stu =new Student();
		stu.setSid(111);
		stu.setSname("Sachin");
		stu.setSaddrss("Pune");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("STU", stu);
		mav.setViewName("student");
		return mav;
		
	}
	@GetMapping("/getStus")
    public ModelAndView getStudents() {
    	Student stu=new Student();
    	stu.setSid(222);
    	stu.setSname("ganesh");
    	stu.setSaddrss("nanded");
    	
    	Student stu1=new Student();
    	stu1.setSid(333);
    	stu1.setSname("shubham");
    	stu1.setSaddrss("latur");
    	
    	Student stu2=new Student();
    	stu2.setSid(444);
    	stu2.setSname("prashant");
    	stu2.setSaddrss("kolhapur");
    	
    	Student stu3=new Student();
    	stu3.setSid(555);
    	stu3.setSname("santosh");
    	stu3.setSaddrss("nagar");
    	
    	ArrayList<Student> al=new ArrayList<>();
    	al.add(stu1);
    	al.add(stu2);
    	al.add(stu3);
    	
    	ModelAndView mav=new ModelAndView();
    	mav.addObject("STUDENT", al);
    	mav.setViewName("students");
    	
		return mav;
    	
    	
    }
}
