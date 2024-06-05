package exceptions;

public class InvalidScriptException extends RuntimeException {
    public InvalidScriptException() {
        super("Invalid script");
    }
}