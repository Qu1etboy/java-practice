package com.qu1etboy.pattern.strategy;

public class Main {

    public static void main(String[] args) {
        Email email = new Email();

        String text = "Hello, World";
        email.setText(text);

        CipherEncryption cipher = new CipherEncryption();
        RSAEncryption rsa = new RSAEncryption();

        email.send();
        email.send(cipher);
        email.send(rsa);

    }
}
