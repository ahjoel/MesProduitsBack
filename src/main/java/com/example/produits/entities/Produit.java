package com.example.produits.entities;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Produit {
	
	@Id
	//Auto-increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idProduit;
	private String nomProduit;
	private Double prixProduit;
	private Date dateCreation;
	private String imagePath;

	@ManyToOne
	private Categorie categorie;

	@OneToOne
	private Image image;


	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Produit(Long idProduit, String nomProduit, Double prixProduit, Date dateCreation) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.dateCreation = dateCreation;
	}

	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public Double getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(Double prixProduit) {
		this.prixProduit = prixProduit;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prixProduit=" + prixProduit
				+ ", dateCreation=" + dateCreation + "]";
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
