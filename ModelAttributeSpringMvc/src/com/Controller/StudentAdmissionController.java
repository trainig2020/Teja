package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/admissionForm.html",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model=new ModelAndView("AdmissionForm");
		//model.addObject("headerMessage","sietk,india");
		return model;
	}
	@ModelAttribute
	public void addingCommonObjects(Model model) {
	model.addAttribute("headerMessage","sietk,india");
	}
	
	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1")Student student1) {
		/*Student student1=new Student();
		student1.setStudentName(name);
		student1.setStudentHobby(hobby);
		*/
		ModelAndView model=new ModelAndView("AdmissionSuccess");
		//model.addObject("headerMessage","sietk,india");
		//model.addObject("student1",student1);
	
		return model;
	}

}
