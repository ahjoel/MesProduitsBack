package com.example.produits;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.produits.repos.ProduitRepository;
import com.example.produits.entities.Categorie;
import com.example.produits.entities.Produit;

@SpringBootTest
class ProduitsApplicationTests {

	// Declaration - interface
	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void testCreateProduit() 
	{
		Produit prod = new Produit(null, "PC Dell",5100.200, new Date());
		produitRepository.save(prod);
	}

	@Test
	public void testFindProduit()
	{
		Produit p = produitRepository.findById(1L).get();
		System.out.println(p);
	}

	@Test
	public void testUpdateProduit()
	{
		Produit p = produitRepository.findById(1L).get();
		p.setPrixProduit(2000.0);
		produitRepository.save(p);
		
		System.out.println(p);
	}

	@Test
	public void testDeleteProduit()
	{
		produitRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllProduit()
	{
		List<Produit> prods = produitRepository.findAll();
		
		for(Produit p:prods) {			
			System.out.println(p);
		}
	}
	
	@Test
	public void testFindProduitByNom()
	{
		List<Produit> prods = produitRepository.findByNomProduit("PC Dell");
		
		for(Produit p:prods) {			
			System.out.println(p);
		}
	}
	
	@Test
	public void testFindProduitByNomContains()
	{
		List<Produit> prods = produitRepository.findByNomProduitContains("e");
		
		for(Produit p:prods) {			
			System.out.println(p);
		}
	}
	
	@Test
	public void testFindByNomPrix()
	{
		List<Produit> prods = produitRepository.findByNomPrix("PC Dell", 1000.0);
		
		for(Produit p:prods) {			
			System.out.println(p);
		}
	}
	
	@Test
	public void testFindByCategorie()
	{
		//recherche par id 
		Categorie cat = new Categorie();
		cat.setIdCat(2L);
		
		List<Produit> prods = produitRepository.findByCategorie(cat);
		
		for(Produit p:prods) {			
			System.out.println(p);
		}
	}
	
	@Test
	public void testFindByCategorieIdCat()
	{

		List<Produit> prods = produitRepository.findByCategorieIdCat(2L);
		
		for(Produit p:prods) {			
			System.out.println(p);
		}
	}
	
	@Test
	public void testFindByOrderByNomProduitAsc()
	{

		List<Produit> prods = produitRepository.findByOrderByNomProduitAsc();
		
		for(Produit p:prods) {			
			System.out.println(p);
		}
	}
	
	@Test
	public void testTrierProduitsNomsPrix()
	{

		List<Produit> prods = produitRepository.trierProduitsNomsPrix();
		
		for(Produit p:prods) {			
			System.out.println(p);
		}
	}
}
