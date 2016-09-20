package com.company.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by OLDU on 20/09/2016.
 */
public class CryptoTest {

    @Test
    public void encryptDecryptTest() {
        String source = "Hello, world! 1234";
        String password = "hi earth - 5678";
        String encrypted;
        String decrypted;

        Crypto.setPassword(password);
        encrypted = Crypto.getEncrypted(source);
        decrypted = Crypto.getDecrypted(encrypted);

        Assert.assertTrue("Decrypted text should be \"Hello, world! 1234\"", decrypted.equals("Hello, world! 1234"));
    }

}

