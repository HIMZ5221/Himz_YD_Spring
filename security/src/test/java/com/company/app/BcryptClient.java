package com.company.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptClient {

	@Test
	public void encode() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
		String password = encoder.encode("RLAdlsrb5221@");
		assertTrue(encoder.matches("RLAdlsrb5221@", password));
		boolean result = encoder.matches("myP1111assword", password);
		System.out.println(password);
		System.out.println(result);
	}
}
