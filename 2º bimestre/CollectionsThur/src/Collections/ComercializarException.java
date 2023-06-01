package Collections;

public class ComercializarException extends Exception{
    public ComercializarException() {
    }

    public ComercializarException(String message) {
        super(message);
    }

    public ComercializarException(String message, Throwable cause) {
        super(message, cause);
    }

    public ComercializarException(Throwable cause) {
        super(cause);
    }

    public ComercializarException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
