package entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Afiliado")
public class Afiliados {
	@Id
	private int dni;
	@Column
	private int salario;
	private int aportacion;
	private String partidoafiliado;
	private String cuenta;
	private int saldo;
	private List<Direccion> direccion;
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getAportacion() {
		return aportacion;
	}
	public void setAportacion(int aportacion) {
		this.aportacion = aportacion;
	}
	public String getPartidoafiliado() {
		return partidoafiliado;
	}
	public void setPartidoafiliado(String partidoafiliado) {
		this.partidoafiliado = partidoafiliado;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public List<Direccion> getDireccion() {
		return direccion;
	}
	public void setDireccion(List<Direccion> direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "afiliados [dni=" + dni + ", salario=" + salario + ", aportacion=" + aportacion + ", partidoafiliado="
				+ partidoafiliado + ", cuenta=" + cuenta + ", saldo=" + saldo + ", direccion=" + direccion + "]";
	}
	
	

	
	
	

}
