/**File name=SeekerLogin
 * Author=Govind Singh
 * Date=27/12/2018
 * 
 */
package com.ntl.topjobs.seekersignuplogin.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.ntl.topjobs.seekersignuplogin.service.SeekerService;

/**
 * @author Training
 *
 */
@Entity
public class SeekerSignup {
	
	private String firstName;
	private String lastName;
	private String password;
	private String emailId;
	private LocalDate  dob;
	@Transient
	private String address;
    private int  mobileno;
    @Column(name="gender")
	private String Gender;
	private String bio;
	@Column(name="city")
	private String City;
	private String zipcode;
	private String country;
	private String states;
	
	@Id
	private String username;
	private String resumeid;
	@Transient
	SeekerService serviceClass;
	/**
	 * 
	 */
	

	
	public SeekerSignup() {
		super();
			
	}
		 
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the mobileno
	 */
	public long  getMobileno() {
		return mobileno;
	}
	/**
	 * @param mobileno the mobileno to set
	 */
	public void setMobileno(int  mobileno) {
		this.mobileno = mobileno;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}
	/**
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}
	/**
	 * @param bio the bio to set
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		City = city;
	}
	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the states
	 */
	public String getStates() {
		return states;
	}
	/**
	 * @param states the states to set
	 */
	public void setStates(String states) {
		this.states = states;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the resumeid
	 */
	public String getResumeid() {
		return resumeid;
	}
	/**
	 * @param resumeid the resumeid to set
	 */
	/**
	 * @return the serviceClass
	 */
	public SeekerService getServiceClass() {
		return serviceClass;
	}
	/**
	 * @param serviceClass the serviceClass to set
	 */
	public void setServiceClass(SeekerService serviceClass) {
		this.serviceClass = serviceClass;
	}
	public void setResumeid(String resumeid) {
		  this.resumeid=resumeid;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SeekerSignup [serviceClass=" + serviceClass + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", emailId=" + emailId + ", dob=" + dob + ", address=" + address
				+ ", mobileno=" + mobileno + ", Gender=" + Gender + ", bio=" + bio + ", City=" + City + ", zipcode="
				+ zipcode + ", country=" + country + ", states=" + states + ", username=" + username + ", resumeid="
				+ resumeid + "]";
	}
	
	
	
}