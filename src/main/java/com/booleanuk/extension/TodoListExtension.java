package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoListExtension {
    private ArrayList<TodoItem> tasks;
    private static long idCounter = 0;

    public TodoListExtension(ArrayList<TodoItem> tasks){
        this.tasks = tasks;
    }

    public String getTaskByID(Integer id){
        for(TodoItem item : tasks){
            if(item.getTodoID().equals(id)){
                if(item.getCompleted()){
                    return item.getName() + ", completed";
                } else {
                    return item.getName() + ", not completed";
                }
            }
        }
        return "ID is not in todo list";
    }

    public String updateNameByID(Integer id, String newName){
        for(TodoItem item : tasks){
            if(item.getTodoID().equals(id)){
                item.setName(newName);
                return "Task with ID " + id + " has a new name: " + newName;
            }
        }
        return "ID is not in todo list";
    }
}
