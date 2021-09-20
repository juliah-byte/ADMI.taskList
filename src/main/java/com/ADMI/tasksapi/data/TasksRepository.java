package com.ADMI.tasksapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ADMI.tasksapi.beans.Tasks;

@Repository
public interface TasksRepository extends JpaRepository <Tasks, Long> {
	
	

}
