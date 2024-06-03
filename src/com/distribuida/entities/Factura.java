package com.distribuida.entities;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component

public class Factura {
	private int idFactura;
	private String numFactura;
	private Date fecha;
	private double totalNeto;
	private double iva;
	//private int idCliente;
	
	public Factura() {}
	public Factura(int idFactura, String numFactura, Date fecha, double totalNeto, double iva)  {
	
		this.idFactura = idFactura;
		this.numFactura = numFactura;
		this.fecha = fecha;
		this.totalNeto = totalNeto;
		this.iva = iva;
	//A continuación los getters and setters.
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public String getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getTotalNeto() {
		return totalNeto;
	}
	public void setTotalNeto(Float totalNeto) {
		this.totalNeto = totalNeto;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(Float iva) {
		this.iva = iva;
	// EL toString
	}
	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", numFactura=" + numFactura + ", fecha=" + fecha + ", totalNeto="
				+ totalNeto + ", iva=" + iva + "]";
	}
	
	

}
