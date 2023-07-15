import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Project } from 'src/app/models/project';
@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  constructor(private http: HttpClient) { }


  generate( Project :any) {
    return this.http.post('http://localhost:8085/back/executeScript', Project);
  }



}
