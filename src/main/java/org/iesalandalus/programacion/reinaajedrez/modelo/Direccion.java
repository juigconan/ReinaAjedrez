package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Direccion {
	NORTE("Norte"),
	NORESTE("Noreste"),
	ESTE("Este"),
	SURESTE("Sureste"),
	SUR("Sur"),
	SUROESTE("Suroeste"),
	OESTE("Oeste"),
	NOROESTE("Noroeste");
	
	private String direccion;
	
	private Direccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return direccion;
	}
}
