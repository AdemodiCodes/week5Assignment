package Week5;

class AsteriskLogger implements Logger { //Implements Logger interface in App. //Asterisklogger Class
    public void log(String message) { //String Method
        System.out.println("***" + message + "***"); //Asterisks then inserts message followed by asterisks.
    }
    @Override
    public void error(String message) {
        System.out.println("****************\n***Error: " + message + "***\n****************"); //Same as above but error added Asterisks then inserts message followed by asterisks.
    }
}