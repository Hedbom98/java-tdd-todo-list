package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    HashMap<String, Boolean> tasks = new HashMap<>();

    public TodoList(){
        this.tasks = new HashMap<>(){{
            put("Clean room", false);
            put("Buy groceries", false);
            put("Write CV", true);
        }};
    }

    public boolean add(String taskName){
        return !this.tasks.containsKey(taskName);
    }

    public String listTasks(){
        if(this.tasks.isEmpty()){
            return "The todolist does not contain any tasks!";
        }
        String listOfTasks = "";
        for(String task : this.tasks.keySet()){
            listOfTasks += task + ", ";
        }
        return listOfTasks;
    }

}
