package com.company;

class MyKeyPadPhone {
    @Deprecated
    void sendMessage() {
        System.out.println("Text message sent!");
    }
}

class MyAndroidPhone extends MyKeyPadPhone {
    @Override
    void sendMessage() {
        System.out.println("Message sent via WhatsApp!");
    }
}

public class CWH_108_AdvancedJava2_JavaAnnotations_2 {
    public static void main(String[] args) {

        MyAndroidPhone Samsung = new MyAndroidPhone();
        Samsung.sendMessage();
    }
}
