package com.qu1etboy.pattern.strategy;

public class RSAEncryption implements Encryptable {
    @Override
    public String encrypt(String text) {
        System.out.println("RSA Encryption");
        return text;
    }
}
