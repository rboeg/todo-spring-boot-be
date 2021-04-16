package com.todoapp.be.controller;

import java.util.Optional;
//import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.todoapp.be.model.Task;
import com.todoapp.be.repository.TaskRepository;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

	@Autowired
	private TaskRepository taskRepository;

	@CrossOrigin
	@GetMapping
	public Iterable<Task> findAllTasks() {
		return taskRepository.findAllByOrderByIdDesc();
	}

	@CrossOrigin
	@GetMapping("/{id}")
	public ResponseEntity<Task> findTaskById(@PathVariable(value = "id") long id) {
		Optional<Task> task = taskRepository.findById(id);

		if (task.isPresent()) {
			return ResponseEntity.ok().body(task.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@CrossOrigin
	@PostMapping
	public Task saveTask(@Validated @RequestBody Task task) {
		return taskRepository.save(task);
	}

	@CrossOrigin
	@PutMapping("/{id}/edit")
	public Task updateTask(@Validated @RequestBody Task updatedTask, @PathVariable(value = "id") long id) {
		Task task = taskRepository.findById(id).get();
		task.setText(updatedTask.getText());
		task.setOrder(updatedTask.getOrder());
		task.setDone(updatedTask.getDone());
		task.setFolder(updatedTask.getFolder());
		return taskRepository.save(task);
	}
	
	@CrossOrigin
	@DeleteMapping("/{id}/delete")
	public void deleteById(@PathVariable(value = "id") long id) {
		taskRepository.deleteById(id);
    }

}