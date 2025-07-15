package org.example.design_patterns.prototype_pattern;

public class Student implements Prototype {
    private final String name;
    private final String studentId;
    private final int age;

    public Student(String name, String studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    @Override
    public Prototype clone() {
        return new Student(name, studentId, age);
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", studentId='" + studentId + '\'' + ", age=" + age + '}';
    }
}
