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
		//Esto se podria hacer con 8 syso pero ueria ver si era capaz de hacerlo así
		for(int i = 0; i < Direccion.values().length; i++) {
			System.out.println((i+1) + " - " + Direccion.values()[i].toString().substring(0,1)+Direccion.values()[i].toString().substring(1,(Direccion.values()[i].toString().length())).toLowerCase());
		}
	}
	
	public static int elegirDireccion() {
		int opcion;
		
		System.out.println("Escoge una opcion");
		
		opcion = Entrada.entero();
		
		while(opcion < 1 | opcion > 8) {
			System.out.println("Opcion no valida, vuelve a escoger.");
			opcion = Entrada.entero();
		}
		return opcion;
	}
	
	public static int elegirPasos() {
		int pasos;
		
		System.out.println("Escoge cuantos pasos desplazarte");
		
		pasos = Entrada.entero();
	
		return pasos;
	}
	
	public static void despedirse() {
		System.out.println("Hasta luego Lucas!!!");
	}
}
