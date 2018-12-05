/**File name=SeekerLogin
 * Author=Govind Singh
 * Date=27/12/2018
 * 
 */
package com.ntl.topjobs.seekersignuplogin.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntl.topjobs.seekersignuplogin.bean.SeekerLogin;
import com.ntl.topjobs.seekersignuplogin.bean.SeekerSignup;
import com.ntl.topjobs.seekersignuplogin.dao.SignUpDao;
import com.ntl.topjobs.seekersignuplogin.dao.LoginDao;

/**
 * @author Training
 *
 */
@Service
public class SeekerService {
	
	@Autowired
	SignUpDao dao;
	@Autowired
	LoginDao loginDao;
	
	SeekerLogin loginBean;
	
	
public SeekerService() {
		super();
		loginBean=new SeekerLogin();
	}
public SeekerService(SignUpDao d, LoginDao logindb) {
	super();
	loginBean=new SeekerLogin();
	dao=d;
	loginDao=logindb;
}
public String generateResumeId() {
	int x = (int) (Math.random() * ((9999 - 1000) + 1)) + 1000;
	String str = Integer.toString(x);
	char a[] = { str.charAt(0), str.charAt(1), str.charAt(2), str.charAt(3) };
	return (new String(a));
}

public SeekerSignup addEmployee(SeekerSignup signupBean) {
	loginBean.setEmailId(signupBean.getEmailId());
	loginBean.setusername(signupBean.getUsername());
	loginBean.setPassword(signupBean.getPassword());
	String resumeId=generateResumeId();
	signupBean.setResumeid(resumeId);
	loginDao.save(loginBean);
	return dao.save(signupBean);  
}

public boolean getUser(String username,String password) {
	try {
	SeekerLogin tempLogin=loginDao.findById(username).get();
	if(tempLogin.getPassword().equals(password))
	{
		
		return true;
	}
	else return false;
	}
	catch(Exception e)
	{
		System.out.println("failed");
		return false;
	}
	
}

}
