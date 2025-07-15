package org.example.design_patterns.singleton_pattern;

//Synchronized Method
public class DbConnectionThree {
    private static DbConnectionThree instance;

    private DbConnectionThree() {
    }

    //problem with this code is its expensive .every time need to use lock with synchronized .
    // if t1,t2,t3 access this method.it will put lock for t1 and t2 will wait for t1 to complete and t3 will wait for t2 to complete.
    public static synchronized DbConnectionThree getInstance() {
        if (instance == null) {
            instance = new DbConnectionThree();
        }
        return instance;

    }
}
