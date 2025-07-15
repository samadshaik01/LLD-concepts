package org.example.design_patterns.singleton_pattern;

//Eager Initialization
public class DbConnectionOne {
    private static final DbConnectionOne instance = new DbConnectionOne();

    private DbConnectionOne() {
    }

    public static DbConnectionOne getInstance() {
        return instance;
    }
}
