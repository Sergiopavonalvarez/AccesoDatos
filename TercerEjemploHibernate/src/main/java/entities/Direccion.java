package entities;

public class Direccion {
	private String tipo_via;
	private String nombre_via;
	private int numero;
	
	
	public String getTipo_via() {
		return tipo_via;
	}
	public void setTipo_via(String tipo_via) {
		this.tipo_via = tipo_via;
	}
	public String getNombre_via() {
		return nombre_via;
	}
	public void setNombre_via(String nombre_via) {
		this.nombre_via = nombre_via;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "direccion [tipo_via=" + tipo_via + ", nombre_via=" + nombre_via + ", numero=" + numero + "]";
	}

	
	
}
