package com.csse.ticketing.exceptions;

import org.springframework.http.HttpStatus;

public class DataNotFoundException extends UserException {

	/**
	 *@author Kasun
	 */
	 private static final long serialVersionUID = -554381281953166386L;

	    /**
	     * Instantiates a new user not found exception.
	     *
	     * @param message
	     *            
	     */
	    public DataNotFoundException(final String message) {
	        super(HttpStatus.NOT_FOUND.value(), message);
	    }
}
