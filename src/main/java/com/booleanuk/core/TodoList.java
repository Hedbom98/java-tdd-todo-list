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


    // Task 1
    public boolean add(String taskName){
        return !this.tasks.containsKey(taskName);
    }


    // Task 2
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


    // Task 3
    public boolean updateTaskStatus(String task, Boolean status){
        if(this.tasks.containsKey(task)){
            this.tasks.put(task, status);
            return true;
        }
        return false;
    }


    // Task 4
    public String getCompletedTasks(){
        String completedTasks = "";
        for(String task : this.tasks.keySet()){
            if(this.tasks.get(task).equals(true)){
                completedTasks += task + ", ";
            }
        }
        if(!completedTasks.equals("")){
            return completedTasks;
        }
        return "There are no completed tasks!";
    }


    // Task 5

}
