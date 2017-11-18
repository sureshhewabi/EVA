package ebi.uk.eva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author suresh
 *
 */

@Entity
@Table(name = "project")
public class Project implements java.io.Serializable  {

	private static final long serialVersionUID = -2743647582252587100L;

	@Id	
	@Column(name = "project_id", unique = true, nullable = false)
	private String id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "source_type")
	private String sourceType;

	@Column(name = "study_type")
	private String studyType;

	@Column(name = "eva_center_name")
	private String evaCenterName;

	@Column(name = "center_name")
	private String centerName;

	@Column(name = "taxonomy_id")
	private int taxonomyId;

	public Project() {

	}

	public Project(String id, String title, String description, String sourceType, String studyType,
			String evaCenterName, String centerName, int taxonomyId) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.sourceType = sourceType;
		this.studyType = studyType;
		this.evaCenterName = evaCenterName;
		this.centerName = centerName;
		this.taxonomyId = taxonomyId;
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

	public int getTaxonomyId() {
		return taxonomyId;
	}

	public void setTaxonomyId(int taxonomyId) {
		this.taxonomyId = taxonomyId;
	}
}
