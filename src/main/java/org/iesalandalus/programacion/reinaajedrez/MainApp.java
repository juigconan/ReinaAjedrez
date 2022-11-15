package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Consola;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	
	private static Reina reina;
	
	private static void ejecutarOpcion(int opcion) {
		switch (opcion) {
			case 0://despedirse
				Consola.despedirse();
				break;
			case 1://reina por defecto
				reina = crearReinaDefecto();
				mostrarReina();
				break;
			case 2://reina color
				reina = crearReinaColor(Consola.elegirOpcion());
				mostrarReina();
				break;
			case 3://mover reina
				mover();
				mostrarReina();
				break;
		}
	}
	
	private static Reina crearReinaDefecto() {
		return new Reina();
	}
	
	private static Reina crearReinaColor(Color color) {
		return new Reina(color);
	}
	
	private static void mover() {
		Direccion direccion;
		int pasos;
		
		Consola.mostrarMenuDirecciones();
		direccion = Consola.elegirDireccion();
		pasos = Consola.elegirPasos();
		try {
			reina.mover(direccion, pasos);
		} catch (OperationNotSupportedException | IllegalArgumentException | NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	private static void mostrarReina() {
		if (reina == null) {
			System.out.println("La reina no ha sido creada");
		}else {
			System.out.println(reina.toString());
		}
	}
	
	public static void main(String[] args) {
		int opcion;
		do {
		Consola.mostrarMenu();
		opcion = Consola.elegirOpcionMenu();
		ejecutarOpcion(opcion);
		}while(opcion != 0);
	}
}
