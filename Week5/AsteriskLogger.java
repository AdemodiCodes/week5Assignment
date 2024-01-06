package Week5;

class AsteriskLogger implements Logger {
    public void log(String message) {
        System.out.println("***" + message + "***");
    }
    @Override
    public void error(String message) {
        System.out.println("****************\n***Error: " + message + "***\n****************");
    }
}