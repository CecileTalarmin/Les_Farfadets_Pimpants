package com.ensim.micropoo.vingtquatreheures.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.annotation.Secured;

import com.ensim.micropoo.vingtquatreheures.controller.HelloController;

public class UtilsBean {

	private static final Logger log = LoggerFactory.getLogger(HelloController.class);
	
	public void test() {
		log.info("Je suis dans mon bean utilitaire !");
	}
}
