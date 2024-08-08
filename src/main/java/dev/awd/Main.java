package dev.awd;


import dev.awd.creational.singleton.LogLevel;
import dev.awd.creational.singleton.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger =  Logger.getLogger();
        logger.setLogLevel(LogLevel.ERROR);
        logger.info("Hello World! info");
        logger.error("Hello World! Error");
    }
}