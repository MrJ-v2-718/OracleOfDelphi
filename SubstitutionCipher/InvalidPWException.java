//****************************************************************************
//  Name: MrJ
//  Date: 10/18/2024
//  Instructor: Yoda
//  Class: Java II
//  Purpose: A custom exception for short or non complex passwords
//****************************************************************************

public class InvalidPWException extends Exception {
    //-----------------------------------------------------------------
    //  Sets up the exception object with a message
    //-----------------------------------------------------------------
    public InvalidPWException(String message) {
        super(message);
    }
}
