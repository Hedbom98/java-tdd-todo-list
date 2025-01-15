package com.booleanuk.extension;

public class TodoItem {
    private String name;
    private Boolean completed;
    private Integer todoID;

    public TodoItem(Integer todoID, String name, Boolean completed){
        this.todoID = todoID;
        this.name = name;
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Integer getTodoID() {
        return todoID;
    }

    public void setTodoID(Integer todoID) {
        this.todoID = todoID;
    }
}
