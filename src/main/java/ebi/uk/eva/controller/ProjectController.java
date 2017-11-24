package ebi.uk.eva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ebi.uk.eva.model.Project;
import ebi.uk.eva.service.ProjectService;

/**
 * 
 * @author suresh
 *
 */
@RestController
@RequestMapping("/studies")
public class ProjectController {

	@Autowired
	private ProjectService projectService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Project> getAllProjects() {
		return projectService.getAllProjects();
//		if (projects.isEmpty()) {
//			return new ResponseEntity<List<Project>>(HttpStatus.NO_CONTENT);
//		}
//		return new ResponseEntity<List<Project>>(projects, HttpStatus.OK); 
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<Project> getProject(@PathVariable String id) {
		Project project = projectService.getProject(id);
		if (project == null) {
			return new ResponseEntity<Project>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Project>(project, HttpStatus.OK); 
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Project> addProject(@RequestBody Project project) {
		projectService.addProject(project);
		return new ResponseEntity<Project>(project, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public ResponseEntity<Void> addProject(@RequestBody Project project, @PathVariable String id) {
		Project foundProject = projectService.getProject(id);
		if (foundProject == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			projectService.updateProject(project, id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public ResponseEntity<Void> deleteProject(@PathVariable String id) {
		Project foundProject = projectService.getProject(id);
		if (foundProject == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			projectService.deleteProject(id);
			return new ResponseEntity<Void>(HttpStatus.GONE);
		}
	}
}
