package com.farfadetpimpant.ensim.micro_projet_24h.controller;

import com.farfadetpimpant.ensim.micro_projet_24h.model.Film;
import com.farfadetpimpant.ensim.micro_projet_24h.model.Serie;
import com.farfadetpimpant.ensim.micro_projet_24h.model.Utilisateur;
import com.farfadetpimpant.ensim.micro_projet_24h.model.dao.FilmRepository;
import com.farfadetpimpant.ensim.micro_projet_24h.model.dao.SerieRepository;
import com.farfadetpimpant.ensim.micro_projet_24h.model.dao.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class MainController {

    @GetMapping("/index")
    public String index() {

        return "index";
    }
}
