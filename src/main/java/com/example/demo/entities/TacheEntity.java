package com.example.demo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity(name = "tache")
public class TacheEntity implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	private String tache_id;
	private String titre;
	private String description;
	private Date date_debut;
	private Date date_fin;
	private String status;
	
	
	@ManyToOne
	@JoinColumn(name = "employe_id")
	private EmployeEntity employe;
	
	@ManyToOne
	@JoinColumn(name = "projet_id")
	private ProjetEntity projet;
	
	@ManyToOne
	@JoinColumn(name = "manager_id")
	private ManagerEntity manager;
	
	@OneToMany(mappedBy = "tache",cascade = CascadeType.ALL)
	List<AvancementTacheEntity> avancements;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTache_id() {
		return tache_id;
	}

	public void setTache_id(String tache_id) {
		this.tache_id = tache_id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EmployeEntity getEmploye() {
		return employe;
	}

	public void setEmploye(EmployeEntity employe) {
		this.employe = employe;
	}

	public ProjetEntity getProjet() {
		return projet;
	}

	public void setProjet(ProjetEntity projet) {
		this.projet = projet;
	}

	public ManagerEntity getManager() {
		return manager;
	}

	public void setManager(ManagerEntity manager) {
		this.manager = manager;
	}
	
	
	
	

}
