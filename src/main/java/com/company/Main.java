package com.company;

import com.company.util.CryptString;

public class Main {

    public static void main(String[] args) {

        String source = "Coucou la terre !!!! 123456";
        String password = "hello";
        String encrypted;
        String decrypted;

        System.out.println("src: " + source);

        CryptString.setPassword(password);

        encrypted = CryptString.getEncryptedString(source);

        System.out.println("enc: " + encrypted);

        decrypted = CryptString.getDecryptedString(encrypted);

        System.out.println("dec: " + decrypted);
        
    }
}
