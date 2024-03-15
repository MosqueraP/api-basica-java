package com.javaapp.rest.controller;

import com.javaapp.rest.model.Task;
import com.javaapp.rest.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoRepository todoRepository; // inyección de los métodos de JPA para el CRUD

    @GetMapping("/") //localhost:8080
    public String holaAlumno(){

        return "HOLA MUNDO";
    }

    @GetMapping("/tasks") //localhost:8080/tasks
    public List<Task> getTasks(){

        return todoRepository.findAll();
    }

    @PostMapping("/tasks/create") //localhost:8080/tasks
    public String saveTasks(@RequestBody Task task){
        todoRepository.save(task);

        return "saved tasks";
    }

    @PutMapping("/tasks/update/{id}") //localhost:8080/tasks
        public String updateTask(@PathVariable Long id, @RequestBody Task task){
            Task udpateTask = todoRepository.findById(id).get();

            udpateTask.setTitle(task.getTitle());
            udpateTask.setDescription(task.getDescription());
            todoRepository.save(udpateTask);

            return "updated tasks";

        }

    @DeleteMapping("/tasks/delete/{id}") //localhost:8080/tasks
    public String deleteTask(@PathVariable Long id){
        Task deleteTask = todoRepository.findById(id).get();

        todoRepository.delete(deleteTask);

        return "DeleteTask tasks";

    }


}
