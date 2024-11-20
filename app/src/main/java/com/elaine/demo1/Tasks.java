package com.elaine.demo1;

public class Tasks {
    private final String title;
    private final String description;

    public Tasks(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
