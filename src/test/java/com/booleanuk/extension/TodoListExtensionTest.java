package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.HashMap;

public class TodoListExtensionTest {
    private ArrayList<TodoItem> items = new ArrayList<>(){{
        TodoItem todoItem1 = new TodoItem(1, "Clean room", true);
        add(todoItem1);

        TodoItem todoItem2 = new TodoItem(1, "Buy groceries", false);
        add(todoItem2);

        TodoItem todoItem3 = new TodoItem(1, "Write CV", false);
        add(todoItem3);
    }};
}
