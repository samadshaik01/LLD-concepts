package org.example.design_patterns.prototype_pattern;

public class Demo {
    //The Prototype Design Pattern is a creational design pattern that lets you create new objects by cloning existing ones, instead of instantiating them from scratch.
    public static void main(String[] args) {
        Student student1 = new Student("sam", "s123", 26);
        System.out.println(student1);

        Student student2 = (Student) student1.clone();
        System.out.println(student2);
    }
}
