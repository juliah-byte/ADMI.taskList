import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import Task from './models/Task';

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  url = 'http://localhost:62345/tasksapi/tasks';


  constructor(private httpClient: HttpClient) { }

  findAll(): Observable<Task> {
    return this.httpClient.get<Task>(this.url);

  }


  save(task: Task): Observable<Task>{
    return this.httpClient.post<Task>(this.url, task);
  }

  delete(task: Task): void{
    this.httpClient.delete<Task>(this.url);
  }

}
