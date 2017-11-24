package ebi.uk.eva.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import ebi.uk.eva.model.Taxonomy;;

/**
 * 
 * @author suresh
 *
 */
@Entity
public class Project {

	@Id	
	@Column(name = "id", unique = true, nullable = false)
	private String id;

	@Column(name = "title")
	@NotNull
	private String title;

	@ManyToOne
    @JoinColumn(name = "taxonomy_id")
    private Taxonomy taxonomy;

	public Project() {

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

	public Taxonomy getTaxonomy() {
		return taxonomy;
	}

	public void setTaxonomy(Taxonomy taxonomy) {
		this.taxonomy = taxonomy;
	}
}
