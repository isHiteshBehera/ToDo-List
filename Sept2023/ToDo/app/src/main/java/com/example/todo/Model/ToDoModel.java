package com.example.todo.Model;

public class ToDoModel {
    private int id, status; // Status: boolean variable for checkbox; but int because no bool in SQLite
    private String task; // actual text  of tasks

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
