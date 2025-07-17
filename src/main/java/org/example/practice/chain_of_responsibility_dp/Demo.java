package org.example.practice.chain_of_responsibility_dp;

import static org.example.practice.chain_of_responsibility_dp.Logger.*;

public class Demo {
    public static void main(String[] args) {
        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        logger.log(INFO, "hello");
        logger.log(DEBUG, "hello");
        logger.log(ERROR, "hello");
    }
}
