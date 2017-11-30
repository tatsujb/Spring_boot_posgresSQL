package com.example.demo.Dao;

import com.example.demo.Entity.Todo;
import org.springframework.stereotype.Repository;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class TodoDao {

    private static Map<Integer, Todo> todos;

    static {
        todos = new HashMap<Integer, Todo>(){
            {
                put(1, new Todo(1, "afaire", "lallala"));
                put(1, new Todo(2, "atyre", "luila"));
                put(1, new Todo(3, "afrtre", "lulala"));
                put(1, new Todo(4, "u", "uala"));
            }
        };
    }

    public Collection<Todo> getAllTodos(){
        return this.todos.values();
    }
}
