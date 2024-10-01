package com.company;

class MyEmployee1 {
    private int id;
    private String name;

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class CWH_40_Ch_9_GettersAndSetters {
    public static void main(String[] args) {
        MyEmployee1 harry = new MyEmployee1();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());
    }
}
