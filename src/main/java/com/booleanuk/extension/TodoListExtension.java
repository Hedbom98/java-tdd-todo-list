package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoListExtension {
    private ArrayList<TodoItem> tasks;
    private static long idCounter = 0;

    public TodoListExtension(ArrayList<TodoItem> tasks){
        this.tasks = tasks;
    }

}
