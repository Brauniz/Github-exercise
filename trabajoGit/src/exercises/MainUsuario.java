package exercises;

import java.util.Scanner;
import java.util.Arrays;

public class MainUsuario {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear array de usuarios
        Usuario[] usuarios = new Usuario[3];

        // Pedir datos para crear los usuarios
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Ingrese datos para el usuario " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea después de nextInt()
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese valoraciones separadas por espacios: ");
            String valoracionesStr = sc.nextLine();
            String[] valoracionesArray = valoracionesStr.split(" ");
            int[] valoraciones = Arrays.stream(valoracionesArray).mapToInt(Integer::parseInt).toArray();

            // Crear objeto Usuario con los datos ingresados
            usuarios[i] = new Usuario(id, nombre, valoraciones);
        }

        // Invocar los métodos para cada usuario en el array
        for (Usuario usuario : usuarios) {
            System.out.println("\n" + usuario.toString());
            System.out.println("Valoración Media: " + usuario.valoracionMedia());
            System.out.print("Todas las Valoraciones: ");
            usuario.mostrarValoraciones();

            System.out.print("Ingrese un valor para contar las valoraciones superiores: ");
            int valorSuperior = sc.nextInt();
            System.out.println("Valoraciones que superan " + valorSuperior + ": " + usuario.contarValoracionesSuperiores(valorSuperior));

            System.out.print("Ingrese una valoración para verificar si supera la media: ");
            int valoracionVerificar = sc.nextInt();
            System.out.println("¿La valoración " + valoracionVerificar + " supera la media? " + usuario.valoracionSuperaMedia(valoracionVerificar));
        }

        // Cerrar el scanner
        sc.close();
    }

}
