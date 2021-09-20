import { Component, OnInit } from '@angular/core';
import { TaskService } from '../task.service';
import Task from '../models/Task';
import { DatePipe } from '@angular/common';


@Component({
  selector: 'app-new-task',
  templateUrl: './new-task.component.html',
  styleUrls: ['./new-task.component.css']
})
export class NewTaskComponent implements OnInit {
  
  taskToSave: Task = new Task();
  today: Date;

  constructor( private service: TaskService, public datepipe: DatePipe) {
    
  } 

  save(): void {

    this.today = new Date();
    let latest_date = this.datepipe.transform(this.today,'DD-MMM-YYYY HH:mm:ss');  
    this.service.save(this.taskToSave).subscribe(data => {
      console.log(data);
    });
  }

  ngOnInit(): void {
  }

}
