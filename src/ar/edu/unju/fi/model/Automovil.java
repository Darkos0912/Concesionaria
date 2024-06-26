package ar.edu.unju.fi.model;

import ar.edu.unju.fi.model.constantes.Colores;

public class Automovil {
	private String patente;
	private String marca;
	private String modelo;
	private short anio;
	private double precio;
	private Colores color;
	
	public Automovil() {
		
	}

	public Automovil(String patente, String marca, String modelo, short anio, double precio, Colores color) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
		this.color = color;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public short getAnio() {
		return anio;
	}

	public void setAnio(short anio) {
		this.anio = anio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Colores getColor() {
		return color;
	}

	public void setColor(Colores color) {
		this.color = color;
	}
	
	
	
}
