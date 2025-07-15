package org.example.design_patterns.builder_pattern;

public class Demo {
    public static void main(String[] args) {
        User user = new User.UserBuilder("samad","shaik").age(20).build();
        System.out.println(user);
    }
}
