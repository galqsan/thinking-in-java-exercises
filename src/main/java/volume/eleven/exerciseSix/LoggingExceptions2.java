package volume.eleven.exerciseSix;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

//Exercise 6:  Create two exception classes, each of which performs its own logging automatically.
// Demonstrate that these work.
public class LoggingExceptions2 extends Exception {
    public static Logger logger = Logger.getLogger("LoggingExceptions2");

    public static void logException(Exception e) {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class Test {
    public static void main(String[] args) {
        try {
            throw new LoggingException1();
        } catch (LoggingException1 loggingException1) {
            System.err.println("In catch:" + loggingException1);
        }
        try {
            throw new LoggingExceptions2();
        } catch (LoggingExceptions2 e) {
            LoggingExceptions2.logException(e);
        }
    }
}


