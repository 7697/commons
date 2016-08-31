package org.opensource.utils.security;

import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.KeyGenerator;

/**
 * 
 * 对称加密
 * @author king
 *
 */
public class DESUtils {

	private static Key key;
	private static String KEY_STR = "mykey";
	
	static {
		try {
			KeyGenerator generator = KeyGenerator.getInstance(KEY_STR);
			generator.init(new SecureRandom(KEY_STR.getBytes()));
			key = generator.generateKey();
			generator = null;
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
