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

    // EXTENSION 1
    @Test
    public void enteringNonExistingID(){
        TodoListExtension todoList = new TodoListExtension(items);
        Integer nonExistingID = 4;

        Assertions.assertEquals("ID is not in todo list", todoList.getTaskByID(nonExistingID));
    }

    @Test
    public void enteringExistingID(){
        TodoListExtension todoList = new TodoListExtension(items);
        Integer nonExistingID = 3;

        Assertions.assertEquals("Write CV, not completed", todoList.getTaskByID(nonExistingID));
    }

    // EXTENSION 2
    @Test
    public void enteringNonExistingIDWhenUpdatingName(){
        TodoListExtension todoList = new TodoListExtension(items);
        Integer nonExistingID = 4;

        Assertions.assertEquals("ID is not in todo list", todoList.updateNameByID(nonExistingID, "Do homework"));
    }

    @Test
    public void enteringExistingIDWhenUpdatingName(){
        TodoListExtension todoList = new TodoListExtension(items);
        Integer nonExistingID = 1;

        Assertions.assertEquals("Task with ID 1 has a new name: Do homework", todoList.updateNameByID(nonExistingID, "Do homework"));
    }

    // EXTENSION 3
    @Test
    public void enteringNonExistingIDWhenUpdatingStatus(){
        TodoListExtension todoList = new TodoListExtension(items);
        Integer nonExistingID = 4;

        Assertions.assertEquals("ID is not in todo list", todoList.updateStatusByID(nonExistingID, true));
    }

    @Test
    public void enteringExistingIDWhenUpdatingStatus(){
        TodoListExtension todoList = new TodoListExtension(items);
        Integer nonExistingID = 3;

        Assertions.assertEquals("Task with ID 3 has a new status: completed", todoList.updateStatusByID(nonExistingID, true));
    }
}
