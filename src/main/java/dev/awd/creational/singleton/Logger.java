package dev.awd.creational.singleton;

import java.time.Instant;

public class Logger {
    LogLevel logLevel;
    static Logger logger;

    private Logger() {
        this.logLevel = LogLevel.INFO;
    }

    public static Logger getLogger() {
        //Thread-Safe Approach => double-check
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
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
            System.out.println("[Debug]" + Instant.now().toString() + " " + message);
        }
    }

    public void info(String message) {
        if (logLevel.ordinal() <= LogLevel.INFO.ordinal()) {
            System.out.println("[Info]" + Instant.now().toString() + " " + message);
        }
    }

    public void warn(String message) {
        if (logLevel.ordinal() <= LogLevel.WARN.ordinal()) {
            System.out.println("[Warning]" + Instant.now().toString() + " " + message);
        }
    }

    public void error(String message) {
        if (logLevel.ordinal() <= LogLevel.ERROR.ordinal()) {
            System.out.println("[Error]" + Instant.now().toString() + " " + message);
        }
    }

    public void fatal(String message) {
        if (logLevel.ordinal() <= LogLevel.FATAL.ordinal()) {
            System.out.println("[Fatal]" + Instant.now().toString() + " " + message);
        }
    }
}
