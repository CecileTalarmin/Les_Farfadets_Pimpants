package com.farfadetpimpant.ensim.micro_projet_24h.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AjoutFilmController {

    @GetMapping("/ajouterFilm")
    public String ajouterFilm() {

        return "ajouterFilm";
    }
}