package org.iesalandalus.programacion.reinaajedrez.modelo;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {
		
	}
	
	public static void mostrarMenu() {
		System.out.println("Menu del ejercicio");
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
		System.out.println("1 - Crear reina por defecto.");
		System.out.println("2 - Crear reina elijiendo el color.");
		System.out.println("3 - Mover a la reina.");
		System.out.println();
		System.out.println("0 - Salir del programa.");
	}
	
	public static int elegirOpcionMenu() {
		int opcion;
		
		System.out.println("Escoge una opcion");
		
		opcion = Entrada.entero();
		
		while(opcion < 0 | opcion > 3) {
			System.out.println("Opcion no valida, vuelve a escoger.");
			opcion = Entrada.entero();
		}
		return opcion;
	}
	
	public static int elegirOpcion() {
		int opcion;
		
		System.out.println("Escoge una opcion");
		
		opcion = Entrada.entero();
		
		while(opcion != 1 | opcion != 2) {
			System.out.println("Opcion no valida, vuelve a escoger.");
			opcion = Entrada.entero();
		}
		return opcion;
	}
	
	public static void mostrarMenuDirecciones () {
		System.out.println("Escoge una opcion:");
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
		
		for(int i = 0; i < Direccion.l(); i++) {
			
		}
	}
}
