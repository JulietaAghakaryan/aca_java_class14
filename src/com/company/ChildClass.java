package com.company;

public class ChildClass extends ParentClass{

    private String childName;

    public ChildClass() {
        super();
        childName="child";

    }

    @Override
    public void init() {
        System.out.println(childName.toCharArray());
    }

    public static void main(String[] args) {
        new ChildClass();
    }
}
