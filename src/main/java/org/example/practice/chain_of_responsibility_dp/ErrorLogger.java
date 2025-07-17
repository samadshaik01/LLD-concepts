package org.example.practice.chain_of_responsibility_dp;

public class ErrorLogger extends Logger {

    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int level, String message) {
        if (level == 3) {
            System.out.println("ERROR : " + message);
        } else {
            super.log(level, message);
        }
    }
}
