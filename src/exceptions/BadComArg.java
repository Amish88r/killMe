package exceptions;

/**
 * плохой аргумент в команде, не соответсвующий ожиданиям
 */
public class BadComArg extends RuntimeException {
    public BadComArg(final String message) {
        super(message);
    }
}