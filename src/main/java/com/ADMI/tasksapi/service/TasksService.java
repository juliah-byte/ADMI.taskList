package com.ADMI.tasksapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ADMI.tasksapi.beans.Tasks;
import com.ADMI.tasksapi.data.TasksRepository;

@Service
public class TasksService {
	
	@Autowired
	private TasksRepository tRepo;
	
	public List<Tasks> findAll(){
		
		return tRepo.findAll();
		
	}
	
	
	public Tasks save(Tasks task) {
		
		return tRepo.save(task);
	}
	
	public void deleteById(Long id) {
	
		tRepo.deleteById(id);
		
		
	}

}