package ebi.uk.eva.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ebi.uk.eva.model.Project;

/**
 * 
 * @author suresh
 *
 */
@Repository
public interface ProjectRepository extends CrudRepository<Project, String>{

}