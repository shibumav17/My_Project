package exception_handling;

public class Min_Balance__Custom_Exception extends Exception{

    public Min_Balance__Custom_Exception(String message){
        super(message);
    }
}

// Q. How to create custom exception?
//We can create custom exception in three steps:
//1-First we need to make exception as the parent class so that it'll have all the specs of exception.
//2-Override the constructor with the message, and this message will be thrown when the exception occurrs.
//3-Use the "super" keyword to point the parent class.

//Q.How to throw the exception?
//We can throw the exception whenever required by using "throw new" keyword.

//Q/Difference b/w throw and throws?
//Throw: basically "throw" keyword to used to throw the exception.
//THROWS: "throws" keyword is used to declare an exception at method level.