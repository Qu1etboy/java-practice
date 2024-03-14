package com.qu1etboy.pattern.strategy;

public class CipherEncryption implements Encryptable {

    @Override
    public String encrypt(String text) {
        System.out.println("Caesar Cipher Encryption");

        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result += Character.toString((char) (text.charAt(i) + 2));
        }

        return result;
    }
}
