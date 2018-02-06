package com.eci.cosw.springbootsecureapi.model;

public class Todo {

    String description;
    Number priotity;
    boolean complete;

    public Todo(String description, Number priotity, boolean complete) {
        this.description = description;
        this.priotity = priotity;
        this.complete = complete;
    }

}
