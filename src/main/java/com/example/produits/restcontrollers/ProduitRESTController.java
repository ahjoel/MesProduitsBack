package com.example.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.produits.entities.Produit;
import com.example.produits.service.ProduitService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ProduitRESTController {
	
	@Autowired
	ProduitService produitService;
	
	//List of products
	@RequestMapping(path="all", method = RequestMethod.GET)
	public List<Produit> getAllProduits()
	{
		return produitService.getAllProduits();
	}
	
	// One product with id
	//@GetMapping("/{id}")
	@RequestMapping(value="/getbyid/{id}", method = RequestMethod.GET)
	public Produit getProduitById(@PathVariable("id") Long id) {
		return produitService.getProduit(id);
	}
	
	// Create product
	//@PostMapping
	@RequestMapping(value="/addprod", method = RequestMethod.POST)
	public Produit createProduit(@RequestBody Produit produit) {
		return produitService.saveProduit(produit);
	}
	
	// Update product
	//@PutMapping
	@RequestMapping(value="/updateprod", method=RequestMethod.PUT)
	public Produit updateProduit(@RequestBody Produit produit) {
		return produitService.updateProduit(produit);
	}
	
	// Delete product with id
	//@DeleteMapping("/{id}")
	@RequestMapping(value="/delprod/{id}", method=RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("id") Long id) {
		produitService.deleteProduitById(id);
	}
	
	// Product with categorie_related with ID Cat
	//@GetMapping("/prodscat/{idCat}")
	@RequestMapping(value="/prodscat/{idCat}", method = RequestMethod.PUT)
	public List<Produit> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
		return produitService.findByCategorieIdCat(idCat);
	}

	@RequestMapping(value="/prodsByName/{nom}", method = RequestMethod.GET)
	public List<Produit> findByNomProduitContains(@PathVariable("nom") String nom){
		return produitService.findByNomProduitContains(nom);
	}
	
}
