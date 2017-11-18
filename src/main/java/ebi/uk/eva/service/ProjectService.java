package ebi.uk.eva.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ebi.uk.eva.model.Project;
import ebi.uk.eva.repository.ProjectRepository;

/**
 * 
 * @author suresh
 *
 */
@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;

	public List<Project> getAllProjects(){
		List<Project> projects = new ArrayList<>();
		projectRepository.findAll().forEach(projects::add);
		return projects;
	}
	
	public Project getProject(String id) {
		return projectRepository.findOne(id);
	}
	
	public void addProject(Project project) {
		projectRepository.save(project);
	}

	public void updateProject(Project project, String id) {
		projectRepository.save(project);
	}

	public void deleteProject(String id) {
		projectRepository.delete(id);
	}
}
