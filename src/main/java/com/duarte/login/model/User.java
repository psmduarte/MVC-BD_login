package com.duarte.login.model;

import java.util.HashSet;
import java.util.Set;

import javax.management.relation.Role;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	
	@Column(name="email")
	@Email(message="Please provide a valid email")
	@NotEmpty(message="Please provide an email")
	private String email;
	
	@Column(name="password")
	@Length(min=5, message="Your password must have ate leats 5 characters")
	@NotEmpty(message="Please provide a password")
	private String password;
	
	@Column(name="name")
	@NotEmpty(message="Please provide your name")
	private String nome;
	
	@Column(name="last_name")
	@NotEmpty(message="Please provide your last name")
	private String lastName;
	
	@Column(name="active")
	private int active;

	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Role> roles;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Set<Role> SetRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public void setRoles(HashSet<com.duarte.login.model.Role> hashSet) {
		// TODO Auto-generated method stub
		
	}

	
	
}
