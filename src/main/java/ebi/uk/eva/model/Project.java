package ebi.uk.eva.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

import ebi.uk.eva.model.Taxonomy;;

/**
 * 
 * @author suresh
 *
 */
@Entity
@Table(name="projects")
public class Project {

	@Id	
	@Column(name = "project_id", unique = true, nullable = false)
	private String id;

	@Column(name = "title")
	@NotNull
	private String title;

	@Column(name = "description", length=10000)
    	private String description;

    	@Column(name = "source_type")
    	private String sourceType;

    	@Column(name = "study_type")
    	private String studyType;

    	@Column(name = "eva_center_name")
    	private String evaCenterName;

    	@Column(name = "center_name")
    	private String centerName;

	@ManyToOne
    @JoinColumn(name = "taxonomy_id")
	@JsonBackReference
    private Taxonomy taxonomy;

	public Project() {

	}

	public Project(String id, String title, String description, String sourceType, String studyType,
			String evaCenterName, String centerName, Taxonomy taxonomy) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.sourceType = sourceType;
		this.studyType = studyType;
		this.evaCenterName = evaCenterName;
		this.centerName = centerName;
		this.taxonomy = taxonomy;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getStudyType() {
		return studyType;
	}

	public void setStudyType(String studyType) {
		this.studyType = studyType;
	}

	public String getEvaCenterName() {
		return evaCenterName;
	}

	public void setEvaCenterName(String evaCenterName) {
		this.evaCenterName = evaCenterName;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}


	public Taxonomy getTaxonomy() {
		return taxonomy;
	}

	public void setTaxonomy(Taxonomy taxonomy) {
		this.taxonomy = taxonomy;
	}
}
