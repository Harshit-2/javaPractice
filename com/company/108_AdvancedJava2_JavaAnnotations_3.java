package com.company;

class KeyPadPhone1 {
    @Deprecated
    void sendMessage() {
        System.out.println("Text message sent!");
    }
}

class AndroidPhone1 extends KeyPadPhone1 {
    @Override
    void sendMessage() {
        System.out.println("Message sent via WhatsApp!");
    }
}

public class CWH_108_AdvancedJava2_JavaAnnotations_3 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        KeyPadPhone1 Nokia = new KeyPadPhone1();
        AndroidPhone1 Samsung = new AndroidPhone1();
        Samsung.sendMessage();
        Nokia.sendMessage();
    }
}
