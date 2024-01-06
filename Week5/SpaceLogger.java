package Week5;

class SpacedLogger implements Logger {//Implements Logger interface in App. //SpacedLogger Class
    @Override //Override because method is implemented only in the declared main.
    public void log(String message) { //String Method
        String spacedMessage = String.join(" ", message.split("")); //his line of code takes the input message
        //splits it into individual characters using message.split("") joins these characters back together with a space in between using String.join(" ")
        System.out.println(spacedMessage);//The result of the previous line is stored in "spacedMessage" which is printed here
    }

    @Override
    public void error(String message) {
        String spacedErrorMessage = String.join(" ", ("ERROR: " + message).split("")); //Same as above with error added
        System.out.println(spacedErrorMessage); //Same as above result of previous line stored in "spacedErrorMessage"
    }
		
}
