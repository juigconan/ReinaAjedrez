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

		while (opcion < 0 | opcion > 3) {
			System.out.println("Opcion no valida, vuelve a escoger.");
			opcion = Entrada.entero();
		}
		return opcion;
	}

	public static Color elegirColor() {
		int opcion;
		Color color;

		System.out.println("Escoge un color");
		System.out.println();
		System.out.println("1 - " + Color.BLANCO.toString());
		System.out.println("2 - " + Color.NEGRO.toString());

		opcion = Entrada.entero();

		while (opcion != 1 & opcion != 2) {
			System.out.println("Opcion no valida, vuelve a escoger.");
			opcion = Entrada.entero();
		}
		/*
		 * Uso color para clarificar el codigo y usar un solo return en vez de 1 por
		 * cada color
		 */
		if (opcion == 1) {
			color = Color.BLANCO;
		} else {
			color = Color.NEGRO;
		}
		return color;
	}

	public static void mostrarMenuDirecciones() {
		System.out.println("Escoge una opcion:");
		System.out.println();
		System.out.println("-------------------------");
		System.out.println();
		// Esto se podria hacer con 8 syso pero queria ver si era capaz de hacerlo así
		for (int i = 0; i < Direccion.values().length; i++) {
			System.out
					.println((i + 1) + " - " + Direccion.values()[i].toString().substring(0, 1) + Direccion.values()[i]
							.toString().substring(1, (Direccion.values()[i].toString().length())).toLowerCase());
		}
	}

	public static Direccion elegirDireccion() {
		int opcion;
		/*
		 * Inicializo direccion a null para poder hacer el return ya que debe tener
		 * valor, aunque nunca deberia devolver null
		 */
		Direccion direccion = null;

		System.out.println("Escoge una opcion");

		opcion = Entrada.entero();

		while (opcion < 1 | opcion > 8) {
			System.out.println("Opcion no valida, vuelve a escoger.");
			opcion = Entrada.entero();
		}
		switch (opcion) {
		/*
		 * Utilizo Direccion.values()[] para que tenga el mismo valor que en el syso de
		 * mostrarMenuDirecciones()seria posible realiazrlo poniendo
		 * Direccion.NORTE (o el corresponiente) en su lugar
		 */
		case 1:
			direccion = Direccion.values()[0];
			break;
		case 2:
			direccion = Direccion.values()[1];
			break;
		case 3:
			direccion = Direccion.values()[2];
			break;
		case 4:
			direccion = Direccion.values()[3];
			break;
		case 5:
			direccion = Direccion.values()[4];
			break;
		case 6:
			direccion = Direccion.values()[5];
			break;
		case 7:
			direccion = Direccion.values()[6];
			break;
		case 8:
			direccion = Direccion.values()[7];
			break;
		}
		return direccion;
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
