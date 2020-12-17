package com.erosion.core.exception;

/**
 *This exception indicates that the object the annotation is acting on is incorrect
 *
 * @author Erosion
 * @since  15.0.1
 * */
public class ActionObjectException extends RuntimeException{

    /**
     * Constructs an {@code ActionObjectException} with no
     * detail message.
     */
    public ActionObjectException()
    {

    }
    /**
     * Constructs an {@code ActionObjectException} with the
     * specified detail message.
     *
     * @param message the detail message
     */
    public ActionObjectException(String message)
    {
        super(message);
    }

    /**
     * Constructs a new exception with the specified detail message and
     * cause.
     *
     * @param message the detail message
     * @param cause 
     */
    public ActionObjectException(String message, Throwable cause)
    {
        super(message, cause);
    }
    public ActionObjectException(Throwable cause)
    {
        super(cause);
    }
    @java.io.Serial
    private static final long serialVersionUID = -5362687448856061245L;
}
