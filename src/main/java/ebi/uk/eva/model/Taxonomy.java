package ebi.uk.eva.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author suresh
 *
 */

@Entity
public class Taxonomy {

	@Id	
	@Column(name = "id", unique = true, nullable = false)
	private long id;

	@Column(name = "taxonomy_common_name")
	@NotNull
	private String commonName;

	@OneToMany(mappedBy = "taxonomy", cascade = CascadeType.ALL)
	private List<Project> projects = new ArrayList<>();
	 
	public Taxonomy() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	 @Override
	    public String toString() {
	        String result = String.format(
	                "Taxonomy[id=%d, commonName='%s']%n",
	                id, commonName);
	        if (projects != null) {
	            for(Project project : projects) {
	                result += String.format(
	                        "project[id=%s, title='%s']%n",
	                        project.getId(), project.getTitle());
	            }
	        }

	        return result;
	    }
}
