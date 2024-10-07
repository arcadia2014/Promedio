import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Promedio{

    public static void main(String[] args) throws IOException {
        int n; // tamaño del grupo
        double[] calificaciones; // calificaciones de cada alumno
        double suma = 0; // para sumar calificaciones
        double promedio; // el promedio del grupo

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Programa que calcula el promedio de un grupo");
        System.out.println("--------------------------------------------");
        // Recuperando el tamaño del grupo

        System.out.println("Escribe el número de alumnos en el grupo:");
        entrada = bufer.readLine(); // lectura de teclado
        n = Integer.parseInt(entrada); // conversión de string a int

        calificaciones = new double[n];

        // Pedir cada calificación

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Escribe calificación del estudiante [" + (i + 1) + "]:");
            entrada = bufer.readLine();
            calificaciones[i] = Double.parseDouble(entrada);
            suma += calificaciones[i];
        }

        // Obtener el promedio
        promedio = suma / n;
        System.out.println("-------------------------------------");
        System.out.println("Las calificaciones de cada alumno son:");

        for (double calif : calificaciones) {
            System.out.println(calif);
        }
        System.out.println("----------------------------------------");
        System.out.println("Promedio del grupo es: " + promedio);
    }
}
