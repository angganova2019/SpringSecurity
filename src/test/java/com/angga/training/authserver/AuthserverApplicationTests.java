package com.angga.training.authserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.Assert;

@SpringBootTest
public class AuthserverApplicationTests {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Test
	void testGeneratePasswordBcrypt() {
		String passwordStaff = "teststaff";
		String bcryptStaff = passwordEncoder.encode(passwordStaff);
		Assert.notNull(bcryptStaff);
		System.out.println("teststaff : " +bcryptStaff);
	}

}
