package exercises;

public class Usuario {
    int id;
    String nombre;
    int[] valoraciones;

    public Usuario() {
        this.id = 0;
        this.nombre = "Default";
        this.valoraciones = new int[] {};
    }

    public Usuario(int id, String nombre, int[] valoraciones) {
        this.id = id;
        this.nombre = nombre;
        this.valoraciones = valoraciones;
    }

    public String toString(int[] valoraciones2) {
        return "ID: " + id + "\nNombre: " + nombre + "\nValoraciones: " + toString(valoraciones);
    }

    public double valoracionMedia() {
        if (valoraciones.length == 0) {
            return 0;
        }
        int suma = 0;
        for (int valoracion : valoraciones) {
            suma += valoracion;
        }
        return (double) suma / valoraciones.length;
    }

    public void mostrarValoraciones() {
        System.out.println(toString(valoraciones));
    }

    public int contarValoracionesSuperiores(int valor) {
        int count = 0;
        for (int valoracion : valoraciones) {
            if (valoracion > valor) {
                count++;
            }
        }
        return count;
    }

    public boolean valoracionSuperaMedia(int valor) {
        return valor > valoracionMedia();
    }

}
