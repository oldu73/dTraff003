package com.company.util;

import org.jasypt.util.text.StrongTextEncryptor;

/**
 * Created by OLDU on 20/09/2016.
 */
public enum CryptString {

    INSTANCE;

    private static final StrongTextEncryptor textEncryptor = new StrongTextEncryptor();

    public static void setPassword(String password) {
        textEncryptor.setPassword(password);
    }

    public static String getEncryptedString(String stringToEncrypt) {
        return textEncryptor.encrypt(stringToEncrypt);
    }

    public static String getDecryptedString(String stringToDecrypt) {
        return textEncryptor.decrypt(stringToDecrypt);
    }
}
