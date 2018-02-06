package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Todo;
import com.eci.cosw.springbootsecureapi.model.User;
import com.eci.cosw.springbootsecureapi.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.util.List;


@RestController
@RequestMapping( "api" )
public class TodoController {

    @Autowired
    private TodoService todoService;


    @RequestMapping(path = "/task", method = RequestMethod.GET)
    public List<Todo> getAllUsers() {
        return todoService.getTodoList();
    }

    @RequestMapping(path = "/addTask", method = RequestMethod.POST)
    public void addNewTask(@RequestBody Todo todo) {
        todoService.addTodo(todo);
    }

}
