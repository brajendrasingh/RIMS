package com.bksoft.soap.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.io.File;

@WebService
@SOAPBinding(style = Style.RPC)
public interface FileAttachmentService {

	@WebMethod
	File downloadFile(String fileName);

	@WebMethod
	String uploadFile(File file);

}
