package com.company;

import com.company.util.Crypto;

public class Main {

    public static void main(String[] args) {

        String source = "Coucou la terre !!!! 123456";
        String password = "hello";
        String encrypted;
        String decrypted;

        System.out.println("src: " + source);

        Crypto.setPassword(password);

        encrypted = Crypto.getEncrypted(source);

        System.out.println("enc: " + encrypted);

        decrypted = Crypto.getDecrypted(encrypted);

        System.out.println("dec: " + decrypted);
        
    }
}
