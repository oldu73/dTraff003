package com.company.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by OLDU on 20/09/2016.
 */
public class CryptStringTest {

    @Test
    public void encryptDecryptTest() {
        String source = "Hello, world! 1234";
        String password = "hi earth - 5678";
        String encrypted;
        String decrypted;

        CryptString.setPassword(password);
        encrypted = CryptString.getEncryptedString(source);
        decrypted = CryptString.getDecryptedString(encrypted);

        System.out.println("src: " + source);
        System.out.println("enc: " + encrypted);
        System.out.println("dec: " + decrypted);

        Assert.assertTrue("Decrypted text should be \"Hello, world! 1234\"", decrypted.equals("Hello, world! 1234"));

    }

}

