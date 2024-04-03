package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.domain.UserUsingObject;

@Controller
public class UserController {

	@GetMapping("/users")
	public String getUserData(Model model) {
		
		UserUsingObject  userobj = new UserUsingObject();
		userobj.setUserId(2160504);
		userobj.setFirstName("Pillamgolla Akhil");
		userobj.setLastName("Akhil");
		userobj.setGender("Male");
		userobj.setDob("04-10-2000");
		
		model.addAttribute("UserData", userobj);  // key & value (Strong user Object into Model)	
        //store data into the object 
		
		//to print object data we use ${UserData}
		
		//to print data in object once see JSPFILE
		
		return "user";
	}
	
}
