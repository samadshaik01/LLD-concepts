package org.example.design_patterns.factory_pattern;

public class Teacher implements School{
    @Override
    public void getDetails() {
        System.out.println("I am a teacher");
    }

}
