package com.firstproject.project;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest 
{
	public static void main(String args[])
	{
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encoded = encoder.encode("dummy");
		System.out.println(encoded);
	}
}
