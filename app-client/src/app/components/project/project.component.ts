import { Component, OnInit } from '@angular/core';
import { Response } from '@angular/http';
import { Subject } from 'rxjs/Rx';
import 'rxjs/add/operator/map';
import {ProjectService} from '../../services/project.service';
import {Project} from '../../models/project.model';

@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.css']
})
export class ProjectComponent implements OnInit {

  dtOptions: DataTables.Settings = {};
  projects: Project[] = [];
  // We use this trigger because fetching the list of persons can be quite long,
  // thus we ensure the data is fetched before rendering
  dtTrigger: Subject<any> = new Subject<any>();

  constructor(public projectService: ProjectService) { }

  ngOnInit() {
    this.loadProjects();
  }

  loadProjects(){
    this.dtOptions = {
      pagingType: 'full_numbers',
      pageLength: 5
    };
    this.projectService.getProjectList()
      .subscribe(projects => {
        this.projects = projects;
        console.log(this.projects);
        // Calling the DT trigger to manually render the table
        this.dtTrigger.next();
      });
  }
}
