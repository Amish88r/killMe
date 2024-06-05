package exceptions;

public class BuildCancelleExeption extends RuntimeException {

    public class BuildCancelleException extends RuntimeException {
        public BuildCancelleException() {
            super("Build cancelled");
        }

        public BuildCancelleException(String message) {
            super(message);
        }
    }
}
