package com.xworkz.readoperations;

public enum ConnectionConstants {
    URL("jdbc:mysql://localhost:3306/highschoolstudents"),  USERNAME("root"), PASSWORD("Shashank@2002");

    private final String value;

    private ConnectionConstants(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
