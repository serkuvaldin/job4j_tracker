package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message + "\n");
    }

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error ok = new Error(false, 200, "OK");
        ok.printInfo();
        Error badRequest = new Error(true, 400, "Wrong syntax");
        badRequest.printInfo();
        Error serverError = new Error(false, 500, "Internal Server Error");
        serverError.printInfo();
    }

}
