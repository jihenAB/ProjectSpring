package com.example.demo.entities;
import java.io.*;

import javax.persistence.*;
@Entity
public class Produit implements Serializable  {

	@Id
	@GeneratedValue
	private Long id;
	
	private String designation;
	
	private double prix;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Produit() {
		
	}

	public Produit(String designation) {
		super();
		this.designation = designation;
	}
	
	
	
	
	
}
