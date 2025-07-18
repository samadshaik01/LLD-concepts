package org.example.logging_system;

public class ErrorLogger extends Logger {
    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }
    public void log(int level, String message) {
        if(level==3){
            System.out.println("ERROR : " + message);
        }else{
            super.log(level, message);
        }
    }
}
