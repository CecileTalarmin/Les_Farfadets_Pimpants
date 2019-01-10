package com.ensim.micropoo.vingtquatreheures.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ensim.micropoo.vingtquatreheures.model.Personne;
import com.ensim.micropoo.vingtquatreheures.model.dao.PersonneRepository;

@Service("userService")
public class UserService implements UserDetailsService {

    private final PersonneRepository userRepository;

    @Autowired
    public UserService(PersonneRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Personne user = userRepository.findByLogin(username);
        if (user == null) {
            throw new UsernameNotFoundException("No user present with username : " + username);
        }
        else {
            return user;
        }
    }

}
