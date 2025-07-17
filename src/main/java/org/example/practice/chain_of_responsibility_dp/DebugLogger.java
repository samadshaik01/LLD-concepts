package org.example.practice.chain_of_responsibility_dp;

public class DebugLogger extends Logger {

    public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }

    public void log(int level, String message) {
        if(level==2){
            System.out.println("DEBUG : " + message);
        }else{
            super.log(level, message);
        }
    }

}
