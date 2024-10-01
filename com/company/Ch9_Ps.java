package com.company;

//  Question 1 --> Create a class cylinder and use getter and setters to set its radius and height

//class Cylinder {
//    private float radius, height;
//
//    public void setRadius(float r) {
//        radius = r;
//    }
//
//    public float getRadius() {
//        return radius;
//    }
//
//    public void setHeight(float h) {
//        height = h;
//    }
//
//    public float getHeight() {
//        return height;
//    }
//}


//  Question 2 --> Use ➊ to calculate surface and volume of the cylinder

//class Cylinder {
//    private float radius, height;
//    public void setRadius(float r) {
//        radius = r;
//    }
//    public float getRadius() {
//        return radius;
//    }
//    public void setHeight(float h) {
//        height = h;
//    }
//    public float getHeight() {
//        return height;
//    }
//    public float volume() {
//        return (float) (Math.PI*radius*radius*height);
//    }
//    public float surfaceArea() {
//        return (float) ((2*Math.PI*radius*height) + (2*Math.PI*radius*radius));
//    }
//}


//  Question 3 --> Use a constructor and repeat ➊

//class Cylinder {
//    private float radius, height;
//
//    public Cylinder(float r, float h) {
//        radius = r;
//        height = h;
//    }
//
//    public float getRadius() {
//        return radius;
//    }
//
//    public float getHeight() {
//        return height;
//    }
//}

//  Question 4 --> Overload a constructor used to initialize a rectangle of length 4 and breath 5 for using custom parameters

//class Rectangle {
//    private int length, breadth;
//    public Rectangle() {
//        this.length = 4;
//        this.breadth = 5;
//    }
//
//    public Rectangle(int l , int b) {
//        this.length = l;
//        this.breadth = b;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public int getBreadth() {
//        return breadth;
//    }
//}


//  Question 5 --> Repeat ➊ for a sphere

//class Sphere {
//    private float radius;
//
//    public Sphere(float radius) {
//        this.radius = radius;
//    }
//    public float volume() {
//        return (float) (4*Math.PI*radius*radius*radius/3);
//    }
//    public float surfaceArea() {
//        return (float) (Math.PI*radius*radius);
//    }
//}



public class CWH_Ch9_Ps {
        public static void main(String[] args) {

//        Answer 1 -->
//            Cylinder cyl = new Cylinder();
//            cyl.setRadius(3);
//            cyl.setHeight(8);
//            System.out.println("Radius --> " + cyl.getRadius());
//            System.out.println("Height --> " + cyl.getHeight());

//        Answer 2 -->
//            Cylinder cyl = new Cylinder();
//            cyl.setRadius(3);
//            cyl.setHeight(8);
//            System.out.println("Surface Area --> " + cyl.surfaceArea());
//            System.out.println("Volume --> " + cyl.volume());

//        Answer 3 -->
//            Cylinder cyl = new Cylinder(2,4);
//            System.out.println("Radius --> " + cyl.getRadius());
//            System.out.println("Height --> " + cyl.getHeight());

//            Answer 4 -->
//            Rectangle rect = new Rectangle();
//            Rectangle rect1 = new Rectangle(3,4);
//            System.out.println("Length --> " + rect.getLength());
//            System.out.println("Breadth --> " + rect.getBreadth());
//            System.out.println();
//            System.out.println("Length --> " + rect1.getLength());
//            System.out.println("Breadth --> " + rect1.getBreadth());

//            Answer 5 -->
//            Sphere sp = new Sphere(5);
//            System.out.println("Volume --> " + sp.volume());
//            System.out.println("Surface Area --> " + sp.surfaceArea());
        }
    }
