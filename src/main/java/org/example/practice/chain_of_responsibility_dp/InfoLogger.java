package org.example.practice.chain_of_responsibility_dp;

public class InfoLogger extends Logger {


    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }

    void log(int level, String message) {
        if (level == 1) {
            System.out.println("info" + message);
        } else {
            super.log(level, message);
        }
    }


}
