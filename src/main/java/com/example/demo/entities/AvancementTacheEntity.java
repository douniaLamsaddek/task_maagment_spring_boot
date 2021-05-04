package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class AvancementTacheEntity implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	private String Titre ;
	private int score;
	private Date date_ajout;
	
	@ManyToOne()
	@JoinColumn(name = "tache_id")
	private TacheEntity tache;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getDate_ajout() {
		return date_ajout;
	}

	public void setDate_ajout(Date date_ajout) {
		this.date_ajout = date_ajout;
	}

	public TacheEntity getTache() {
		return tache;
	}

	public void setTache(TacheEntity tache) {
		this.tache = tache;
	}

}
