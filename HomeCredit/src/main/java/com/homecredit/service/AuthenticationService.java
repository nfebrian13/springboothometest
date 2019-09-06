package com.homecredit.service;

import java.util.HashSet;
import java.util.Set;

import com.homecredit.model.Authentication;
import com.homecredit.model.Role;
import com.homecredit.model.UserDetail;
import com.homecredit.repository.UserDetailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.security.core.userdetails.User;

/**
 * @author Nana Febriana
 */

@Component
public class AuthenticationService implements UserDetailsService {

	@Autowired
    private UserDetailRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
        	if(username == null ||  username.isEmpty()){
        		throw new UsernameNotFoundException("User not found");
        	}
            UserDetail user = userRepository.findByUsername(username);
            if (user == null || user.getAuthentication() == null) {
            	throw new UsernameNotFoundException("User not found");
            }
            return new User(user.getAuthentication().getUsername(), user.getAuthentication().getPassword(), getAuthorities(user.getAuthentication()));
        } catch (Exception e) {
            throw new UsernameNotFoundException("User not found");
        }
    }
    
    private Set<GrantedAuthority> getAuthorities(Authentication authentication) {
        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        for (Role role : authentication.getRoles()) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getAuthority());
            authorities.add(grantedAuthority);
        }
        return authorities;
    }
}
