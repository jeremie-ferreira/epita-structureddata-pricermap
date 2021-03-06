package com.epita.pricer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Plateforme {
	
	@Id
	@Column(length=3)
	private String code;
	
	@ManyToOne
	@JoinColumn(foreignKey=@ForeignKey(name="fk_plateforme_gare"))
	private Gare gare;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Gare getGare() {
		return gare;
	}

	public void setGare(Gare gare) {
		this.gare = gare;
	}
	
	
}
