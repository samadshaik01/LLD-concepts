package org.example.logging_system;

import static org.example.logging_system.Logger.*;

public class LoggingSystemDemo {

    public static void main(String[] args) {
        Logger logobj = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        logobj.log(INFO, "This is an info message");
        logobj.log(DEBUG, "This is a debug message");
        logobj.log(ERROR, "This is an error message");


    }
}
