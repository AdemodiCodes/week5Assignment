package Week5;

interface Logger {
    void log(String message);
    void error(String message);
}
public class App { //Declares class as app
    public static void main(String[] args) { //Declares main method.
        Logger asteriskLogger = new AsteriskLogger(); //This line declares a variable asteriskLogger of type Logger and
        //assigns an instance of the AsteriskLogger class to it. 
        Logger spacedLogger = new SpacedLogger(); // This is creating an object of the AsteriskLogger class
        //implements the Logger interface.

        asteriskLogger.log("Welcome to the game..."); //Printing log using Asterisk log method ".log" is used to call the log method
        asteriskLogger.error("Failed to connect"); //Printing error using Asterisk error method ".error" is used to call the error method

        spacedLogger.log("Goodbye"); //Printing log using Spaced log method ".log" is used to call the log method
        spacedLogger.error("Logging user out"); //Printing error using Asterisk error method ".error" is used to call the error method
    }
}
