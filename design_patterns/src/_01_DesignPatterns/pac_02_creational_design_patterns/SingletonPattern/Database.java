package _01_DesignPatterns.pac_02_creational_design_patterns.SingletonPattern;

public enum Database {
    INSTANCE;

    public void connect() {
        System.out.println("Connecting to the database...");
    }

    public void disconnect() {
        System.out.println("Disconnecting the database...");
    }
}
