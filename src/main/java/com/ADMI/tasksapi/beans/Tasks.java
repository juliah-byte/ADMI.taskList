package com.ADMI.tasksapi.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Tasks {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long Id;
	
	@Column(name = "Description")
	private String Description;
	
	@Column(name = "creationDate")
	private String creationDate;
	
	@Column(name = "dueDate")
	private String dueDate;

	public Tasks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tasks(Long id, String description, String creationDate, String dueDate) {
		super();
		this.Id = id;
		this.Description = description;
		this.creationDate = creationDate;
		this.dueDate = dueDate;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		this.Id = id;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Tasks [Id=" + Id + ", Description=" + Description + ", creationDate=" + creationDate + ", dueDate="
				+ dueDate + "]";
	}

	
	
	

}
