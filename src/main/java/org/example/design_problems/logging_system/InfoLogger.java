package org.example.logging_system;

public class InfoLogger extends Logger {
    public InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }


    public void log(int level, String message) {
        if(level==1){
            System.out.println("INFO : " + message);
        }else{
            super.log(level, message);
        }
    }

}
