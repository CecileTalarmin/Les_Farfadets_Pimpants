package com.ensim.micropoo.vingtquatreheures.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ensim.micropoo.vingtquatreheures.model.Personne;
import com.ensim.micropoo.vingtquatreheures.model.dao.PersonneRepository;
import com.ensim.micropoo.vingtquatreheures.utils.UtilsBean;

@Controller
@RequestMapping("/")
public class HelloController {
	
	private static final Logger log = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	private PersonneRepository personneDAO;
	
	@Autowired 
	private UtilsBean monBean;
	
	@GetMapping("/hello")
    public String hello(@RequestParam(name="name", required=false, defaultValue="Inconnue") String name,
    		@RequestParam(name="firstName", required=false, defaultValue="Personne") String firstName,
    		Model model) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		//System.out.println("Acces a la page hello du user : " + auth.getName());
		
		if(auth != null) {
			Personne p = personneDAO.findByLogin(auth.getName());
			//log.info("Nom : " + p.get().getLastName());
			
			model.addAttribute("personne", p);
		}
		
        return "hello";
    }
	
	@GetMapping("/hello2")
	public String hello2() {
		return "hello2";
	}
}
