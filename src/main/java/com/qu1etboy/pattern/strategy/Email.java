package com.qu1etboy.pattern.strategy;

public class Email {

    private String text;

    public void send() {
        System.out.println("Send without encryption");
    }

    public void send(Encryptable encrypter) {
        System.out.println("Send with encryption");

        String encryptedText = encrypter.encrypt(this.text);

        System.out.println("Text = " + encryptedText);
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
