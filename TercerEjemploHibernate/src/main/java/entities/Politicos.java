package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Politicos")
public class Politicos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dni;
	@Column
	private String estudios;
	private String nombre;
	@OneToOne(mappedBy="nombre_partido")
	private Partidos p;
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getEstudios() {
		return estudios;
	}
	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "politicos [dni=" + dni + ", estudios=" + estudios + ", nombre=" + nombre + "]";
	}
	
	

}
