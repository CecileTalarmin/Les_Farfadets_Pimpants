package com.farfadetpimpant.ensim.micro_projet_24h.service;

import com.farfadetpimpant.ensim.micro_projet_24h.model.dao.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {
    private final UtilisateurRepository ur;

    @Autowired
    public UtilisateurService(UtilisateurRepository userRepo) {
        this.ur = userRepo;
    }
}
