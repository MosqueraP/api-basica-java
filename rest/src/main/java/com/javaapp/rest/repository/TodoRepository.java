package com.javaapp.rest.repository;

import com.javaapp.rest.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <Task, Long> {
}
