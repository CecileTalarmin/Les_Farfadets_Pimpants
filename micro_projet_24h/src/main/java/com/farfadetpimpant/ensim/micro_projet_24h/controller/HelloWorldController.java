package com.farfadetpimpant.ensim.micro_projet_24h.controller;

import com.farfadetpimpant.ensim.micro_projet_24h.model.Utilisateur;
import com.farfadetpimpant.ensim.micro_projet_24h.model.dao.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @Autowired
    private UtilisateurRepository utilisateurDAO;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="nameGET", required=false, defaultValue="World")
                           String nameGET, Model model) {
        model.addAttribute("nomTemplate", nameGET);

        Utilisateur user1 = new Utilisateur(1, "bbb", "Le Berre", "Pierre");
        utilisateurDAO.save(user1);

        return "greeting";
    }
}
