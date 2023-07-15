import { Component, OnInit } from '@angular/core';
import { Project } from '../models/project';
import { ProjectService } from '../services/project.service';
@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.scss']
})
export class ProjectComponent implements OnInit {
  projectForm= {
    projectname: '',
    projectgroup: '',
    projectversion:'',
   
  };
  constructor(private projectService: ProjectService) { }

  ngOnInit(): void {
  }
  generate( ) {
    this.projectService.generate(this.projectForm) .subscribe({
      next:() => { 
      console.log("your project is generated !")
      },
     
    })
  }
}
