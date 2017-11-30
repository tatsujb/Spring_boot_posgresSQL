package com.example.demo.Service;

import com.example.demo.Dao.TodoDao;
import com.example.demo.Entity.Todo;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TodoService {

    private TodoDao todoDao;

    public Collection<Todo> getAllTodos(){
        return todoDao.getAllTodos();
    }
}
