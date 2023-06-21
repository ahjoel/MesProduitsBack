package com.example.produits.repos;

import com.example.produits.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "cat")
@CrossOrigin("*")
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
