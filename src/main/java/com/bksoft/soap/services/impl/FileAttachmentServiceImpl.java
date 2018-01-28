package com.bksoft.soap.services.impl;

import java.io.File;
import java.io.IOException;

import javax.jws.WebService;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.MTOM;

import com.bksoft.soap.services.FileAttachmentService;

@MTOM
@WebService(endpointInterface = "com.bksoft.soap.services.FileAttachmentService")
public class FileAttachmentServiceImpl implements FileAttachmentService {

	@Override
	public File downloadFile(String fileName) {
		
		return null;
	}

	@Override
	public String uploadFile(File file) {

		return null;
	}
}
