package com.example.demo.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "manager")
public class ManagerEntity extends UserEntity {
	
	@ManyToOne
	@JoinColumn(name="admin_id")
	AdminEntity admin ;
	
	@OneToMany(mappedBy = "manager",cascade = CascadeType.ALL)
	List<TacheEntity> taches;
	
	@OneToMany(mappedBy = "manager",cascade = CascadeType.ALL)
	List<ProjetEntity> projets;
	
	

}
