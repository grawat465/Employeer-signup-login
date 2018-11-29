/**
 * 
 */
package com.ntl.topjobs.seekersignuplogin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ntl.topjobs.seekersignuplogin.bean.SeekerSignup;
import com.ntl.topjobs.seekersignuplogin.service.SeekerService;

/**
 * @author Training
 *
 */
@CrossOrigin(origins="http://localhost:4201",maxAge=3600)
@RestController
public class SeekerController {
	@Autowired
	SeekerService serviceClass;
	@Autowired 
	
	
	//SignupBean beanSignup= new SignupBean();

	public SeekerController() {
		super();		
	}

	public SeekerController(SeekerService sc) {
		super();		
		serviceClass=sc;
	}
	
	@PostMapping("/seeker/signup")
	public SeekerSignup signup(@RequestBody SeekerSignup signupBean) {
	System.out.println(signupBean.getCity());
		return (serviceClass.addEmployee(signupBean));

	}

	@GetMapping("/seeker/login/emp/{id}/{password}")
	public boolean login(@PathVariable("id") String id, @PathVariable("password") String password) {
		System.out.println("i m darth vader");
		if (serviceClass.getUser(id, password) == true) {
			return true;
		} else
			return false;
	}
	
	@GetMapping("/testComm")
	public String testComm() {
		System.out.println("TEST SUCCESS");
		return "SUCCESS";
	}

}
	