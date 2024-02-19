package exercises;

import java.util.Scanner;

public class constructorTrabajador {
	String nombre;
	String DNI;
	double salario;

	public constructorTrabajador() {

	}

	public constructorTrabajador(String nombre, String DNI, double salario) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.salario = salario;
	}

	public String toString() {
		return "Trabajador [nombre=" + nombre + ", DNI=" + DNI + ", salario=" + salario + "]";
	}

	public boolean valido() {
		if (DNI.length() == 9) {
			return true;
		}
		return false;
	}

	public String sueldoMayor(constructorTrabajador trabajador2) {
		if (this.salario > trabajador2.salario) {
			return this.nombre;
		} else {
			return trabajador2.nombre;
		}
	}

	public boolean esIgual(constructorTrabajador trabajador2) {
		if (this.nombre.equalsIgnoreCase(trabajador2.nombre) && this.DNI.equalsIgnoreCase(trabajador2.DNI)
				&& this.salario == trabajador2.salario) {
			return true;
		}
		return false;
	}
}
