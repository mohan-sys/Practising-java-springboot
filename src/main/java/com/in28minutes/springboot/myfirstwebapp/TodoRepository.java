package com.in28minutes.springboot.myfirstwebapp;

import com.in28minutes.springboot.myfirstwebapp.todo.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> { // class type, primary key type
    public List<Todo> findByUsername(String username);
}
