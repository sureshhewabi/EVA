package ebi.uk.eva.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/projects")
public class ProjectController {
	
	final static Logger logger = Logger.getLogger(ProjectController.class);

	@Autowired
	private ProjectService projectService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Project> getAllProjects() {
		return projectService.getAllProjects();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public Project getProject(@PathVariable String id) {
		return projectService.getProject(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public void addProject(@RequestBody Project project) {
		projectService.addProject(project);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void addProject(@RequestBody Project project, @PathVariable String id) {
		projectService.updateProject(project, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteProject(@PathVariable String id) {
		projectService.deleteProject(id);
	}
}
