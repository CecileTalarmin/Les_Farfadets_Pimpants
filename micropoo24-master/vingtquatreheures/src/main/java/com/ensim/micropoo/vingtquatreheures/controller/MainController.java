package com.ensim.micropoo.vingtquatreheures.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ensim.micropoo.vingtquatreheures.RoleEnum;
import com.ensim.micropoo.vingtquatreheures.model.Personne;
import com.ensim.micropoo.vingtquatreheures.model.dao.PersonneRepository;
import com.ensim.micropoo.vingtquatreheures.utils.BCryptManagerUtil;
import com.ensim.micropoo.vingtquatreheures.utils.UtilsBean;

@Controller
public class MainController {

	@Autowired
	private PersonneRepository personneDAO;
	
	@Autowired 
	private UtilsBean monBean;
 
    // Injectez (inject) via application.properties.
    @Value("${welcome.message}")
    private String message;
 
    @Value("${error.message}")
    private String errorMessage;
 
    @RequestMapping(value = { "", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
 
        model.addAttribute("message", message);
 
        return "index";
    }
 
    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String personListe(Model model) {
 
        //model.addAttribute("persons", persons);
    	List<Personne> listePersonne = (List<Personne>) personneDAO.findAllByName("Girault");
    	model.addAttribute("listePersonne", listePersonne);
    	
		monBean.test();
 
        return "personList";
    }
 
    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.GET)
    public String showAddPersonPage(Model model) {
 
        Personne personForm = new Personne();
        model.addAttribute("personForm", personForm);
 
        return "addPerson";
    }
 
    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.POST)
    public String savePerson(Model model, //
            @ModelAttribute("personForm") Personne personForm) {
 
        String firstName = personForm.getFirstName();
        String lastName = personForm.getLastName();
 
        if (firstName != null && firstName.length() > 0 //
                && lastName != null && lastName.length() > 0) {
            Personne newPerson = new Personne(firstName, lastName);
            System.out.println("pass : " + personForm.getPassword());
            newPerson.setPassword(BCryptManagerUtil.passwordencoder().encode(personForm.getPassword()));
            newPerson.setRole(personForm.getRole());
            newPerson.setLogin(personForm.getLogin());
            personneDAO.save(newPerson);
 
            return "redirect:/personList";
        }
 
        model.addAttribute("errorMessage", errorMessage);
        return "addPerson";
    }
}
