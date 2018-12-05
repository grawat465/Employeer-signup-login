/**File name=SeekerLogin
 * Author=Govind Singh
 * Date=27/12/2018
 * 
 */
package com.ntl.topjobs.seekersignuplogin.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SeekerLoginNotFoundException  extends RuntimeException {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SeekerLoginNotFoundException(String message) {
		super(message);
	}
	
	@Override
	public String toString() {
		return "SeekrLoginNotFound";
	}

}



