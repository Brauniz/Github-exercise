package exercises;
import java.util.Arrays;

public class constructorEmpresa {
String nombre;
String NIF;
constructorTrabajador[] listaTrabajadores;

public constructorEmpresa() {
	
}
public constructorEmpresa(String nombre, String NIF, constructorTrabajador[] listaTrabajadores) {
	this.nombre = nombre;
	this.NIF = NIF;
	this.listaTrabajadores = listaTrabajadores;	
}

public String toString() {
	return "Empresa [nombre=" + nombre + ", NIF=" + NIF + ", listaTrabajadores="
			+ Arrays.toString(listaTrabajadores) + "]";
}

public boolean existeTrabajador(String dni) {
	for(constructorTrabajador t : listaTrabajadores) {
		if(t.DNI.equalsIgnoreCase(dni)) {
			return true;
		}
		
	}return false;
}

public int numeroTrabajadores() {
	return this.listaTrabajadores.length;
}

public double salarioTotal() {
	double suma = 0;
	for(constructorTrabajador t : listaTrabajadores) {
		suma += t.salario;
		
	}
	return suma;
}

public int mas3000() {
	int contador = 0;
	for(constructorTrabajador t : listaTrabajadores) {
		if(t.salario > 3000) {
			contador++;
		}
	}
	return contador;
}

public int menosSMI() {
	int contador = 0;
	for(constructorTrabajador t : listaTrabajadores) {
		if(t.salario < 1130) {
			contador++;
		}
	}
	return contador;
}

public int masCantidadParametro(double cantidad) {
	int contador = 0;
	for(constructorTrabajador t : listaTrabajadores) {
		if(t.salario > cantidad) {
			contador++;
		}
	}
	return contador;
}

public boolean dniValido() {
	for(constructorTrabajador t : listaTrabajadores) {
		return t.valido();
	}
	return false;
}

public boolean esIgual(constructorEmpresa empresa2) {
	if(this.nombre.equalsIgnoreCase(empresa2.nombre) && this.NIF.equalsIgnoreCase(empresa2.NIF )) {
		return true;
	}return false;
}
}