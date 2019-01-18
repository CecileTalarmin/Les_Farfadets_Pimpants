package com.farfadetpimpant.ensim.micro_projet_24h.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FicheDetailsController {

    @GetMapping("/fiche_details")
    public String fiche_details() {

        return "fiche_details";
    }
}