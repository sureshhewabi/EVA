package ebi.uk.eva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author suresh
 *
 */

@Entity
@Table(name = "taxonomies")
public class Taxonomy {

	@Id	
	@Column(name = "taxonomy_id", unique = true, nullable = false)
	private long id;

	@Column(name = "taxonomy_common_name")
	@NotNull
	private String commonName;
	
	@Column(name = "taxonomy_scientific_name")
	@NotNull
	private String scientificName;

	public Taxonomy() {

	}

	public Taxonomy(long id, String commonName, String scientificName) {
		super();
		this.id = id;
		this.commonName = commonName;
		this.scientificName = scientificName;
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

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}
	
	
}
