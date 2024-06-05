package com.distribuida.entities;

import org.springframework.stereotype.Component;

@Component


public class FacturaDetalle {
	
	private int idFacturaDetalle;
	private int cantidad;
	private double subtotal;
	private int idFactura;
	private int idLibro;
	public FacturaDetalle() {}
	public FacturaDetalle(int idFacturaDetalle, int cantidad, Float subtotal, int idFactura, int idLibro) {
		
		this.idFacturaDetalle = idFacturaDetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.idFactura = idFactura;
		this.idLibro = idLibro;
	}
	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}
	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", idFactura=" + idFactura + ", idLibro=" + idLibro + "]";
	}
	
	
	

}
