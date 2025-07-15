package org.example.design_patterns.factory_pattern;

public class Student implements School{
    @Override
    public void getDetails() {
        System.out.println("i am a student");
    }
}
