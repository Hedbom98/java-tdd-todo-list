package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void tryToAddToTodoList(){
        TodoList todoList = new TodoList();
        String taskName = "Go do exercise";

        Assertions.assertTrue(todoList.add(taskName));
    }
}
