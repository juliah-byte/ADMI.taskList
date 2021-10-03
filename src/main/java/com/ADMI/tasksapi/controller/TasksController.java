package com.ADMI.tasksapi.controller;

import java.util.List;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ADMI.tasksapi.beans.Tasks;
import com.ADMI.tasksapi.service.TasksService;

@RestController
@RequestMapping("tasksapi/tasks")
@CrossOrigin("http://localhost:4200")
public class TasksController {
	
	@Autowired
	private TasksService tservice;
	
	
	@GetMapping
	public ResponseEntity<List<Tasks>> findAll() {
		
		return new ResponseEntity<List<Tasks>>(tservice.findAll(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Tasks> save(@RequestBody Tasks task){
		 
		
		return new ResponseEntity<Tasks>(tservice.save(task), HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Long> delete(@PathVariable Long id){
		
	    tservice.deleteById(id);
	    
	    return new ResponseEntity<>(id, HttpStatus.OK);
		
	}

}
