package com.company;

class KeyPadPhone {
    void sendMessage() {
        System.out.println("Text message sent!");
    }
}

class AndroidPhone extends KeyPadPhone {
    @Override
    void sendMessage() {
        System.out.println("Message sent via WhatsApp!");
    }
}

public class CWH_108_AdvancedJava2_JavaAnnotations {
    
    public static void main(String[] args) {
        AndroidPhone Samsung = new AndroidPhone();
        Samsung.sendMessage();
    }
}
