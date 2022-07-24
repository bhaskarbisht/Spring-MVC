package com.bhaskar.practice.Formdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhaskar.practice.Formdata.Dao.StudentRepository;
import com.bhaskar.practice.Formdata.model.StudentModel;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepository str;
	

	@RequestMapping(value="/filldata",method = RequestMethod.GET)	
	public String studentdata() {
		
		
		return "formdata";
	}
	
//	@RequestMapping(value="/filldata",method = RequestMethod.POST)	
//	public String Savedata(@RequestParam String name,@RequestParam String age,@RequestParam String Schoolname,ModelMap model) {
//		
//		model.put("name", name);
//		model.put("age",age);
//		model.put("Schoolname", Schoolname);
//
//		return "formdata";
//	}
//	
	@RequestMapping(value="/filldata",method = RequestMethod.POST)	
	public String SavedatacommandBean(ModelMap model,StudentModel studentmodel) {
		
		str.insert(studentmodel);
		model.put("rollid", studentmodel.getRollid());
		
		
		
		

		return "welcome";
	}
	
	
	
}
