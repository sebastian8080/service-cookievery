package com.moviles.complexivo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int producto_id; 
	
	@Column(name = "nombre_producto", nullable = false)
	private String nombre_producto;
	
	@Column(name = "descripcion_producto", nullable = false)
	private String descripcion_producto;
	
	@Column(name = "precio_producto", nullable = false)
	private double precio_producto;
	
	public Producto() {}

	public Producto(int producto_id, String nombre_producto, String descripcion_producto, double precio_producto) {
		super();
		this.producto_id = producto_id;
		this.nombre_producto = nombre_producto;
		this.descripcion_producto = descripcion_producto;
		this.precio_producto = precio_producto;
	}

	public int getProducto_id() {
		return producto_id;
	}

	public void setProducto_id(int producto_id) {
		this.producto_id = producto_id;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getDescripcion_producto() {
		return descripcion_producto;
	}

	public void setDescripcion_producto(String descripcion_producto) {
		this.descripcion_producto = descripcion_producto;
	}

	public double getPrecio_producto() {
		return precio_producto;
	}

	public void setPrecio_producto(double precio_producto) {
		this.precio_producto = precio_producto;
	}

	
	
	
}
