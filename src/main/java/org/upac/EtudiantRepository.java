package org.upac;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    //@Query("select e from Etudiant e where e.nom like :x")
    //public List<Etudiant> find(@Param("x") String nom);

    public List<Etudiant> findByNomContains(String nom);
}
