/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molaa
 */


public class UnderAgeException extends Exception {
/*
    If the transaction was for either a movie or a series and the customer’s age was less
than 18, then an UnderAgeException object is thrown with the message:
● Use try-catch block to handle this exception and to print the exception message to the
file.
    */
    /**
     * Creates a new instance of <code>UnderAgeException</code> without detail
     * message.
     */
    
    public UnderAgeException() {
        
    }

    /**
     * Constructs an instance of <code>UnderAgeException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UnderAgeException(String msg) {
        super(msg);
    }
}

