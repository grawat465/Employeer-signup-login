package com.ntl.topjobs.seekersignuplogin.controller;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Optional;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.ntl.topjobs.seekersignuplogin.bean.SeekerLogin;
import com.ntl.topjobs.seekersignuplogin.bean.SeekerSignup;
import com.ntl.topjobs.seekersignuplogin.controller.SeekerController;
import com.ntl.topjobs.seekersignuplogin.dao.LoginDao;
import com.ntl.topjobs.seekersignuplogin.dao.SignUpDao;
import com.ntl.topjobs.seekersignuplogin.service.SeekerService;


@RunWith(MockitoJUnitRunner.class)
public class SeekerControllerTest {
	@Mock
	SeekerService service;
	
	SeekerSignup seekerup;
	
	SeekerLogin seekerlogin;
	@Mock
    SignUpDao dao;
	
	@Mock
	LoginDao loginDao;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testsignup() {
		SeekerSignup seeker=new SeekerSignup();
		seeker.setAddress("asd");
		seeker.setBio("ASd");
		seeker.setCity("Hyd");
		seeker.setCountry("Inf");
		seeker.setDob(LocalDate.of(1997, 12, 12));
		seeker.setFirstName("Varun");
		seeker.setUsername("VK123");
		
		Mockito.lenient().when(service.addEmployee(seeker)).thenReturn(seeker);
		SeekerController c=new SeekerController(service);
		assertEquals(seeker,c.signup(seeker));
	
	}

	
	

	public void testGetUser() {
		
	}

}

