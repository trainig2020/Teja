package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/admissionForm.html",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model1=new ModelAndView("AdmissionForm");
		
		return model1;
	}
	@ModelAttribute
	public void addingCommonObjects(Model model1) {
	model1.addAttribute("headerMessage","sietk,india");
	}
	
	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1")Student student,BindingResult result) {
		
		if(result.hasErrors()) {
			ModelAndView model1=new ModelAndView("AdmissionForm");
		}
		ModelAndView model1=new ModelAndView("AdmissionSuccess");
		
		return model1;
	}

}
