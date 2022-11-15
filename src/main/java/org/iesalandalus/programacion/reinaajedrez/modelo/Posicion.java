package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {

	private int fila;
	private char columna;
	
	private static final int MAX_FILA = 8;
	private static final int MIN_FILA = 0;
	private static final char MAX_COLUMNA = 'h';
	private static final char MIN_COLUMNA = 'a';
	
	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		if (fila < MIN_FILA | fila > MAX_FILA) {
			throw new IllegalArgumentException();
		}
		this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	private void setColumna(char columna) {
		//TODO error
		this.columna = columna;
	}
	
	
	
}
