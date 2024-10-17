//********************************************************************
//  StringTooLongException.java
//
// Provided to show an example of a custom exception.
//********************************************************************
public class StringTooLongException extends Exception {
    //-----------------------------------------------------------------
    //  Sets up the exception object with a particular message.
    //-----------------------------------------------------------------
    public StringTooLongException(String message) {
        super(message);
    }
}
