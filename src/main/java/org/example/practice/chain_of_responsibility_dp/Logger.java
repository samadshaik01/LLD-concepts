package org.example.practice.chain_of_responsibility_dp;

public abstract class Logger {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    final Logger nextLogger;

    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    void log(int level, String message) {
        if (nextLogger != null) {
            nextLogger.log(level, message);
        }
    }
}
