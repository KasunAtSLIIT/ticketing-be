package com.csse.ticketing.exceptions;

import org.springframework.http.HttpStatus;

public class BadRequestException extends UserException {


	/**
	 *@author Kasun
	 */
	 private static final long serialVersionUID = 8454870022974731248L;

	    /**
	     * Instantiates a new note not found exception.
	     *
	     * @param message
	     *            
	     */
	    public BadRequestException(final String message) {
	        super(HttpStatus.BAD_REQUEST.value(), message);
	    }
}
