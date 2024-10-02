package webserver;

public enum HttpStatus {
    OK(200, "OK"),
    NOT_FOUND(404, "Not Found"),
    FOUND(302, "Found");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}