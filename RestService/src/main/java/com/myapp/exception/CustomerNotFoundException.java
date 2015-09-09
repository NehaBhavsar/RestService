package com.myapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author neha
 * 
 * Created on 09/09/2015
 * Handing customer not found exception.
 *
 */
@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Customer not found.")
public class CustomerNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
