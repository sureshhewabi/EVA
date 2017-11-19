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

import ebi.uk.eva.model.Taxonomy;
import ebi.uk.eva.service.TaxonomyService;

/**
 * 
 * @author suresh
 *
 */
@RestController
@RequestMapping("/taxonomies")
public class TaxonomyController {

	@Autowired
	private TaxonomyService taxonomyService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Taxonomy>> getAllTaxonomies() {
		List<Taxonomy> taxonomies = taxonomyService.getAllTaxonomies();
		if (taxonomies.isEmpty()) {
			return new ResponseEntity<List<Taxonomy>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Taxonomy>>(taxonomies, HttpStatus.OK); 
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<Taxonomy> getTaxonomy(@PathVariable long id) {
		Taxonomy taxonomy = taxonomyService.getTaxonomy(id);
		if (taxonomy == null) {
			return new ResponseEntity<Taxonomy>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Taxonomy>(taxonomy, HttpStatus.OK); 
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Taxonomy> addTaxonomy(@RequestBody Taxonomy taxonomy) {
		taxonomyService.addTaxonomy(taxonomy);
		return new ResponseEntity<Taxonomy>(taxonomy, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public ResponseEntity<Void> updateTaxonomy(@RequestBody Taxonomy taxonomy, @PathVariable long id) {
		Taxonomy foundTaxonomy = taxonomyService.getTaxonomy(id);
		if (foundTaxonomy == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			taxonomyService.updateTaxonomy(taxonomy, id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public ResponseEntity<Void> deleteTaxonomy(@PathVariable long id) {
		Taxonomy foundTaxonomy = taxonomyService.getTaxonomy(id);
		if (foundTaxonomy == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		} else {
			taxonomyService.deleteTaxonomy(id);
			return new ResponseEntity<Void>(HttpStatus.GONE);
		}
	}
}
