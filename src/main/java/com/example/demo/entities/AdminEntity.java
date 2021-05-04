package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity(name = "admin")
public class AdminEntity extends UserEntity {
	public List<EmployeEntity> getEmployes() {
		return employes;
	}

	public void setEmployes(List<EmployeEntity> employes) {
		this.employes = employes;
	}

	public List<ProjetEntity> getProjets() {
		return projets;
	}

	public void setProjets(List<ProjetEntity> projets) {
		this.projets = projets;
	}

	public List<ManagerEntity> getManagers() {
		return managers;
	}

	public void setManagers(List<ManagerEntity> managers) {
		this.managers = managers;
	}

	@OneToMany(mappedBy = "admin",cascade = CascadeType.ALL)
	List<EmployeEntity> employes ;
	
	@OneToMany(mappedBy = "projet",cascade = CascadeType.ALL)
	List<ProjetEntity> projets ;
	
	@OneToMany(mappedBy = "manager",cascade = CascadeType.ALL)
	List<ManagerEntity> managers;

}
