package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventos")

public class Invento {
	@Id
	private String nombeInvento;
	@Column
	private String inventor;
	private int fecha;

	public String getNombeInvento() {
		return nombeInvento;
	}

	public void setNombeInvento(String nombeInvento) {
		this.nombeInvento = nombeInvento;
	}

	public String getInventor() {
		return inventor;
	}

	public void setInventor(String inventor) {
		this.inventor = inventor;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Invento [nombeInvento=" + nombeInvento + ", inventor=" + inventor + ", fecha=" + fecha + "]";
	}

}
