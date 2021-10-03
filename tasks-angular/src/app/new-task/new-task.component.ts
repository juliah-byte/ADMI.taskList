import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { TaskService } from '../task.service';
import Task from '../models/Task';
import { DatePipe } from '@angular/common';
import { stringify } from 'querystring';


@Component({
  selector: 'app-new-task',
  templateUrl: './new-task.component.html',
  styleUrls: ['./new-task.component.css'],
  providers: [DatePipe]
})
export class NewTaskComponent implements OnInit {
  
  taskToSave: Task = new Task();
  
 // @ViewChild('cDate', {static: true}) cDateElement: ElementRef;
  Today = new Date(Date.now());
  pipe = new DatePipe('en-US')
  date: Date;
  endDate: any;
 
  myToday = this.pipe.transform(this.Today, 'MM/dd/yyy')

  constructor( private service: TaskService, private datepipe: DatePipe, cDateElement: ElementRef) {
   // this.cDateElement = cDateElement;
     //this.Today = this.datepipe.transform(this.Today, 'MM-dd-yyyy')
  } 


  save(): void {
    this.date = new Date(Date.now());
    this.taskToSave.creationDate = this.pipe.transform(this.date, 'MM/dd/yyyy')
    this.taskToSave.dueDate = this.pipe.transform(this.taskToSave.dueDate, 'MM-dd-yyyy')
    
    this.service.save(this.taskToSave).subscribe(data => {
      console.log(data);
    }); 
  }

  ngOnInit(): void {
    //this.taskToSave.creationDate = new Date(Date.now());
    //this.taskToSave.creationDate = Object.assign(this.Today)
  }

}
