package dev.awd.ultimate;

import dev.awd.creational.singleton.LogLevel;

import java.time.Instant;

public class Logger {
    private LogLevel logLevel;
    private static Logger logger;
    private String className;


    private Logger(String className) {
        this.logLevel = LogLevel.INFO;
        this.className = className;
    }

    public static Logger getLogger(String className) {
        //Thread-Safe Approach => double-check
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger(className);
                }
            }
        }
        return logger;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void debug(String message) {
        if (logLevel.ordinal() == LogLevel.DEBUG.ordinal()) {

            System.out.println("[Debug]" + Instant.now().toString() + className + ": " + message);
        }
    }

    public void info(String message) {
        if (logLevel.ordinal() <= LogLevel.INFO.ordinal()) {
            System.out.println("[Info]" + Instant.now().toString() + className + ": " + message);
        }
    }

    public void warn(String message) {
        if (logLevel.ordinal() <= LogLevel.WARN.ordinal()) {
            System.out.println("[Warn]" + Instant.now().toString() + className + ": " + message);
        }
    }

    public void error(String message) {
        if (logLevel.ordinal() <= LogLevel.ERROR.ordinal()) {
            System.out.println("[Error]" + Instant.now().toString() + className + ": " + message);
        }
    }

    public void fatal(String message) {
        if (logLevel.ordinal() <= LogLevel.FATAL.ordinal()) {
            System.out.println("[Fatal]" + Instant.now().toString() + className + ": " + message);
        }
    }
}
