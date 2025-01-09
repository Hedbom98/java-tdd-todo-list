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
    public void addTaskThatDoesNotExist(){
        TodoList todoList = new TodoList();
        String taskName = "Go do exercise";

        Assertions.assertTrue(todoList.add(taskName));
    }

    @Test
    public void addTaskThatDoesExist(){
        TodoList todoList = new TodoList();
        String taskName = "Clean room";

        Assertions.assertFalse(todoList.add(taskName));
    }
}
