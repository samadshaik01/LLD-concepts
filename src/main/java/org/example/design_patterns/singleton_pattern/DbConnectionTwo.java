package org.example.design_patterns.singleton_pattern;

//Lazy Initialization
public class DbConnectionTwo {
    private static DbConnectionTwo instance;
    private DbConnectionTwo() {}
    //problem with this code is that it is not thread-safe ,when multiple threads try to access this method at the same time, it can create multiple instances of DbConnectionTwo.
    public static DbConnectionTwo getInstance() {
        if (instance == null) {
            instance = new DbConnectionTwo();
        }
        return instance;
    }
}
