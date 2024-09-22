package dev.awd.ultimate;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static volatile Logger logger;
    private LogLevel logLevel;


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

    public void debug(String className, String message) {
        if (logLevel.ordinal() == LogLevel.DEBUG.ordinal()) {

            System.out.println("[Debug]" + Instant.now().toString() + className + ": " + message);
        }
    }

    public void info(String className, String message) {
        if (logLevel.ordinal() <= LogLevel.INFO.ordinal()) {
            System.out.println("[Info]" + getCurrentTimeFormatted() + className + ": " + message);
        }
    }

    public void warn(String className, String message) {
        if (logLevel.ordinal() <= LogLevel.WARN.ordinal()) {
            System.out.println("[Warn]" + Instant.now().toString() + className + ": " + message);
        }
    }

    public void error(String className, String message) {
        if (logLevel.ordinal() <= LogLevel.ERROR.ordinal()) {
            System.out.println("[Error]" + Instant.now().toString() + className + ": " + message);
        }
    }

    public void fatal(String className, String message) {
        if (logLevel.ordinal() <= LogLevel.FATAL.ordinal()) {
            System.out.println("[Fatal]" + Instant.now().toString() + className + ": " + message);
        }
    }

    private String getCurrentTimeFormatted() {
        Instant now = Instant.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" yyyy-MM-dd HH:mm:ss ")
                .withZone(ZoneId.systemDefault());
        return formatter.format(now);
    }
}
