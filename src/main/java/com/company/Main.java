package com.company;

import com.company.util.CryptString;

public class Main {

    public static void main(String[] args) {

        CryptString.setPassword("hello");

        String test1 = CryptString.getEncryptedString("Coucou la terre !!!! 123456");

        System.out.println("test1: " + test1);

        String test2 = CryptString.getDecryptedString(test1);

        System.out.println("test2: " + test2);
        
    }
}
