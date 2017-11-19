package ebi.uk.eva.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ebi.uk.eva.model.Taxonomy;
import ebi.uk.eva.repository.TaxonomyRepository;

/**
 * 
 * @author suresh
 *
 */
@Service
public class TaxonomyService {
	
	@Autowired
	private TaxonomyRepository taxonomyRepository;

	public List<Taxonomy> getAllTaxonomies(){
		List<Taxonomy> taxonomies = new ArrayList<>();
		taxonomyRepository.findAll().forEach(taxonomies::add);
		return taxonomies;
	}
	
	public Taxonomy getTaxonomy(long id) {
		return taxonomyRepository.findOne(id);
	}
	
	public void addTaxonomy(Taxonomy taxonomy) {
		taxonomyRepository.save(taxonomy);
	}

	public void updateTaxonomy(Taxonomy taxonomy, long id) {
		taxonomyRepository.save(taxonomy);
	}

	public void deleteTaxonomy(long id) {
		taxonomyRepository.delete(id);
	}
}
