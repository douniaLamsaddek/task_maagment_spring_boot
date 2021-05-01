package com.example.demo.requests;

import java.util.Date;

public class ProjetRequest {
	
	
	private String titre ;
	private String descriprion;
	private Date date_debut;
	private Date date_fin;
	private String pdf;
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescriprion() {
		return descriprion;
	}
	public void setDescriprion(String descriprion) {
		this.descriprion = descriprion;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public String getPdf() {
		return pdf;
	}
	public ProjetRequest(String titre, String descriprion, Date date_debut, Date date_fin, String pdf) {
		super();
		this.titre = titre;
		this.descriprion = descriprion;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.pdf = pdf;
	}
	public ProjetRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setPdf(String pdf) {
		this.pdf = pdf;
	}
	
	
}
