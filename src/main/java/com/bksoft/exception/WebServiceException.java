package com.bksoft.exception;

import javax.xml.ws.WebFault;

@WebFault(name = "WebServiceException", targetNamespace = "http://bksoft.com")
public class WebServiceException extends Exception {

	private static final long serialVersionUID = 8980152112650845445L;
	private String webServiceException;

	public WebServiceException() {
		super();
	}

	public WebServiceException(String message) {
		super(message);
	}

	public WebServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public WebServiceException(String message, java.lang.String webServiceException) {
		super(message);
		this.webServiceException = webServiceException;
	}

	public WebServiceException(String message, java.lang.String webServiceException, Throwable cause) {
		super(message, cause);
		this.webServiceException = webServiceException;
	}

	public String getFaultInfo() {
		return this.webServiceException;
	}

}
