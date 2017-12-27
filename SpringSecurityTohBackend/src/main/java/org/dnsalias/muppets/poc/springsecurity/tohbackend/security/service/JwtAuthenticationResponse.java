package org.dnsalias.muppets.poc.springsecurity.tohbackend.security.service;

import java.io.Serializable;

public class JwtAuthenticationResponse implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4436760309833532840L;
	
	private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
