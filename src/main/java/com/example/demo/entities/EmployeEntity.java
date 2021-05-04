package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "employe")
public class EmployeEntity extends UserEntity {
	
	@ManyToOne
	@JoinColumn(name="admin_id")
	AdminEntity admin ;
	
	@OneToMany(mappedBy = "employe",cascade = CascadeType.ALL)
	List<TacheEntity> taches;

	public AdminEntity getAdmin() {
		return admin;
	}

	public void setAdmin(AdminEntity admin) {
		this.admin = admin;
	}

	public List<TacheEntity> getTaches() {
		return taches;
	}

	public void setTaches(List<TacheEntity> taches) {
		this.taches = taches;
	}
	
	
	
	
	
	
	

}
