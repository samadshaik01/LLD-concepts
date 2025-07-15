package org.example.design_patterns.singleton_pattern;

public class Demo {
    public static void main(String[] args) {
        //eager initialization
        DbConnectionOne dbConnectionOne = DbConnectionOne.getInstance();
    }
}
