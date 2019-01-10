package com.ensim.micropoo.vingtquatreheures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.ensim.micropoo.vingtquatreheures.model.dao.PersonneRepository;
import com.ensim.micropoo.vingtquatreheures.utils.BCryptManagerUtil;
import com.sun.org.apache.xpath.internal.operations.And;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private PersonneRepository personneDAO;
	
	@Autowired
	private BCryptManagerUtil passwordEncoder;
	
    private final UserDetailsService userDetailsService;

    @Autowired
    public WebSecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }
    
    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder.passwordencoder());
    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
			.antMatchers("/admin**").hasAuthority(RoleEnum.ADMIN.toString())
			.antMatchers("/index").hasAnyAuthority(RoleEnum.ADMIN.toString() + ", " + RoleEnum.USER)
			.anyRequest().permitAll()
		.and()
			.formLogin().loginPage("/login").permitAll()
		.and()
			.logout().invalidateHttpSession(true)
			.logoutSuccessUrl("/hello").permitAll()
		.and()
			.sessionManagement().maximumSessions(1).expiredUrl("/login");
	}

//	@Bean
//	@Override
//	public UserDetailsService userDetailsService() {
//		
//		List<Personne> personList = (List<Personne>) personneDAO.findAll();
//		List<UserDetails> userDetailList = new ArrayList<>();
//		for(Personne p : personList) {
//			System.out.println("Ajout du user : " + p.getLogin() + " --> " + p.getRole());
//			UserDetails user =
//				User.withDefaultPasswordEncoder()
//				.username(p.getLogin())
//				.password(p.getPassword())
//				.roles(p.getRole())
//				.build();
//			userDetailList.add(user);
//		}
//
//		return new InMemoryUserDetailsManager(userDetailList);
//	}
}
