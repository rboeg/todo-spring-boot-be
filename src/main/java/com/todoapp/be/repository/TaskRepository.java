package com.todoapp.be.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.todoapp.be.model.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
	public Iterable<Task> findAllByOrderByIdDesc();
}