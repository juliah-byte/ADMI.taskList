import { Component, OnInit } from '@angular/core';
import Task from '../models/Task';
import { TaskService } from '../task.service';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})

export class TaskListComponent implements OnInit {

  constructor (private service: TaskService) { }


  myId: number;
  myTask: Task;
  taskList: any = [];
  
  ngOnInit(): void {
    this.service.findAll().subscribe((data) => {
      //this.taskList = data;
      this.taskList = data;
      console.log(data);

    });
  }

  delete(id: number): void {
    this.service.delete(id).subscribe((data) => {
      this.ngOnInit();
    });
  }
}

