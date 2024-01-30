package entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Partidos")
public class Partidos {
	@Id
	private String nombre_partido;
	private int escaños;
	@OneToOne
	@JoinColumn(name="id", nullable=false)
	private Politicos politicos;
	public String getNombre_partido() {
		return nombre_partido;
	}
	public void setNombre_partido(String nombre_partido) {
		this.nombre_partido = nombre_partido;
	}
	public int getEscaños() {
		return escaños;
	}
	public void setEscaños(int escaños) {
		this.escaños = escaños;
	}
	public Politicos getPoliticos() {
		return politicos;
	}
	public void setPoliticos(Politicos politicos) {
		this.politicos = politicos;
	}
	
	
	


	
	


	
	

}
