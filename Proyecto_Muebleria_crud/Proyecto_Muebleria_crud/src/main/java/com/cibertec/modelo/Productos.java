package com.cibertec.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Productos")

public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMueble;
	private String nombreMueble;
	private String idProveedor;
	private int idCategoria;
	private String umedida;
	private int precioUnidad;
	private int unidadExistencia;
	
	public Productos() {
		
	}

	public Productos(int idMueble, String nombreMueble, String idProveedor, int idCategoria, String umedida,
			int precioUnidad, int unidadExistencia) {
		super();
		this.idMueble = idMueble;
		this.nombreMueble = nombreMueble;
		this.idProveedor = idProveedor;
		this.idCategoria = idCategoria;
		this.umedida = umedida;
		this.precioUnidad = precioUnidad;
		this.unidadExistencia = unidadExistencia;
	}
	

	public int getIdMueble() {
		return idMueble;
	}

	public void setIdMueble(int idMueble) {
		this.idMueble = idMueble;
	}

	public String getNombreMueble() {
		return nombreMueble;
	}

	public void setNombreMueble(String nombreMueble) {
		this.nombreMueble = nombreMueble;
	}

	public String getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getUmedida() {
		return umedida;
	}

	public void setUmedida(String umedida) {
		this.umedida = umedida;
	}

	public int getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(int precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public int getUnidadExistencia() {
		return unidadExistencia;
	}

	public void setUnidadExistencia(int unidadExistencia) {
		this.unidadExistencia = unidadExistencia;
	}

	

	
	
	
	
	
}
