package com.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;
@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/admissionForm.html",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model=new ModelAndView("AdmissionForm");
		return model;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,@RequestParam("studentHobby") String hobby){
		
		ModelAndView model=new ModelAndView("AdmissionSuccess");
		model.addObject("msg","details submitted by you: Name: "+name+", hobby:" +hobby);
	
		return model;
	}

}
