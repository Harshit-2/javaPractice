package com.company;

//  Question 1 --> Create an abstract class pen with methods write () and refill () as abstract methods

abstract class Pen{
    abstract void write();
    abstract void refill();
}


//  Question 2 --> Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()

class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("Writing...");
    }
    @Override
    void refill() {
        System.out.println("Refilling...");
    }

    void changeNib(){
        System.out.println("Changing Nib...");
    }
}


//  Question 3 --> Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits this monkey class and implements BasicAnimal interface with eat ( ) and sleep ( ) methods
//  Question 5 --> Demonstrate polymorphism using monkey  class from Q3

class Monkey {
    void jump() {
        System.out.println("Jumping...");
    }
    void bite() {
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}


//  Question 4 --> Create a class telephone with ring ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism

abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnected();
}
    class SmartTelephone extends Telephone{
    void ring(){
        System.out.println("Ringing");
    }
    void lift(){
        System.out.println("Picking the phone...");
    }
    void disconnected(){
        System.out.println("Disconnected..!!");
    }
    void MusicPlayer(){
        System.out.println("Playing music...");
    }
    void gps(){
        System.out.println("Navigating...");
    }
}

//  Question 6 --> Create an interface TVremote and use it to inherit another interface smart TVremote
//  Question 7 --> Create a class TV which implements TVremote interface from Q6

interface TVremote{
    void changeChannel();
    void changeVolume();
}
interface SmartTVremote extends TVremote{
    void touchScreen();
    void AdjustableButtons();
}
class TV implements TVremote{
    public void changeChannel(){
        System.out.println("Channel changed..!!");
    }
        public void changeVolume(){
            System.out.println("Volume is changed...");
    }
    void watchDrama(){
        System.out.println("Watching K-Drama...");
    }
    void listenSongs(){
        System.out.println("Listening songs...");
    }
}




public class CWH_Ch_11_Ps {
    public static void main(String[] args) {

//        Answer 2 -->
//        FountainPen fp = new FountainPen();
//        fp.changeNib();

//        Answer 3 -->
//        Human h = new Human();
//        h.eat();
//        h.sleep();
//        h.jump();
//        h.bite();

//        Answer 4 -->
//        Telephone t = new SmartTelephone();
//        System.out.println("Properties of Telephone --> ");
//        t.ring();
//        t.lift();
//        t.disconnected();
//        SmartTelephone st = new SmartTelephone();
//        System.out.println("Properties of Smart Telephone --> ");
//        st.MusicPlayer();
//        st.gps();
//        st.ring();
//        st.lift();
//        st.disconnected();

//        Answer 5 -->
//        System.out.println("Properties of monkey --> ");
//        Monkey m = new Human();
//        m.bite();
//        m.jump();
//        System.out.println("Properties of Human --> ");
//        Human h = new Human();
//        h.eat();
//        h.sleep();
//        h.jump();
//        h.bite();
//        System.out.println("Properties of Basic Human --> ");
//        BasicAnimal ba = new Human();
//        ba.eat();
//        ba.sleep();

//        Answer 7 -->
//        TV t = new TV();
//        t.changeChannel();
//        t.watchDrama();
//        t.changeVolume();
//        t.listenSongs();

    }
}
