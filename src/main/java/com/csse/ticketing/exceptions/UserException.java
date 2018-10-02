package com.csse.ticketing.exceptions;

public class UserException extends RuntimeException {

	/**
	 * @author Kasun
	 */
	
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4836827547108110089L;

    /** The code. */
    private int code;

    /**
     * new user exception
     * @param code
     * @param message
     */
    public UserException(final int code, final String message) {
        super(message);
        this.code = code;
    }

    /**
     * Gets the code.
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the code.
     *
     * @param code
     *           
     */
    public void setCode(final int code) {
        this.code = code;
    }
}
