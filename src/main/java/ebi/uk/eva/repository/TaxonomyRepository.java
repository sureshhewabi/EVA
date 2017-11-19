package ebi.uk.eva.repository;

import org.springframework.data.repository.CrudRepository;

import ebi.uk.eva.model.Taxonomy;

/**
 * 
 * @author suresh
 *
 */
public interface TaxonomyRepository extends CrudRepository<Taxonomy, Long>{

}