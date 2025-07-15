package org.example.design_patterns.singleton_pattern;

//Double-checked locking is a design pattern that reduces the overhead of acquiring a lock by first testing the locking criterion without actually acquiring the lock.
// Only if the check indicates that locking is required does the actual lock proceed.
//industry standard
public class DbConnectionFour {
    private static DbConnectionFour instance;

    private DbConnectionFour() {
    }

    public static DbConnectionFour getInstance() {
        if (instance == null) {

            synchronized (DbConnectionFour.class) {
                if (instance == null) {
                    instance = new DbConnectionFour();
                }
            }
        }
        return instance;
    }
}

