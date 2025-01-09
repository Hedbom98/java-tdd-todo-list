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

    //Task 1
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



    //Task 2
    @Test
    public void tasksExistInTodoList(){
        TodoList todoList = new TodoList();

        if(!todoList.tasks.isEmpty()){
            Assertions.assertFalse(todoList.listTasks().isEmpty());
        }

    }

    @Test
    public void tasksDoesNotExistInTodoList(){
        TodoList todoList = new TodoList();

        if(todoList.tasks.isEmpty()){
            Assertions.assertEquals("The todolist does not contain any tasks!", todoList.listTasks());
        }

    }



    //Task 3
    @Test
    public void doesStatusUpdateIfTaskExist(){
        TodoList todoList = new TodoList();
        String task = "Clean room";

        Assertions.assertTrue(todoList.updateTaskStatus(task, true));
    }

    @Test
    public void doesStatusUpdateIfTaskDoesNotExist(){
        TodoList todoList = new TodoList();
        String task = "Go do exercise";

        Assertions.assertFalse(todoList.updateTaskStatus(task, true));
    }


    // Task 4
    @Test
    public void doesExistCompletedTasks(){
        TodoList todoList = new TodoList();

        Assertions.assertFalse(todoList.getCompletedTasks().isEmpty());
    }

    @Test
    public void doesNotExistCompletedTasks(){
        TodoList todoList = new TodoList();

        if(todoList.getCompletedTasks().isEmpty()){
            Assertions.assertEquals("There are no completed tasks!", todoList.getCompletedTasks());
        }
    }


    // Task 5
    @Test
    public void UncompletedTasksExist(){
        TodoList todoList = new TodoList();

        Assertions.assertFalse(todoList.getUncompletedTasks().isEmpty());
    }


}
