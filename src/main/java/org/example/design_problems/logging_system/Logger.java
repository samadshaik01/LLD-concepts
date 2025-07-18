package org.example.logging_system;

public abstract class Logger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    private Logger nextLogger;

    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(int level, String message) {
        if(nextLogger != null) {
            nextLogger.log(level, message);
        }
    }
}
