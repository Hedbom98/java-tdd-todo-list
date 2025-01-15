package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoListExtensionTest {
    private ArrayList<TodoItem> items = new ArrayList<>(){{
        TodoItem todoItem1 = new TodoItem(1, "Clean room", true);
        add(todoItem1);

        TodoItem todoItem2 = new TodoItem(2, "Buy groceries", false);
        add(todoItem2);

        TodoItem todoItem3 = new TodoItem(3, "Write CV", false);
        add(todoItem3);
    }};

    @Test
    public void enteringNonExistingID(){
        TodoListExtension todoList = new TodoListExtension(items);
        Integer nonExistingID = 4;

        Assertions.assertFalse(todoList.getTaskByID(nonExistingID));
    }
}
