import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioGrupo {   
    
    // Declarando variables globales
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    // Declaración de un arreglo de tipo TDA
    public static Alumnos[] alumnos;

    public static void leerAlumnos() throws IOException {
        String matricula, nombre;

        System.out.println("Solicitud de información de cada estudiante");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("-------------------------------------------");
            System.out.println("Escribe la matrícula: ");
            entrada = bufer.readLine();
            matricula = entrada;
            System.out.println("Escribe el nombre: ");
            entrada = bufer.readLine();
            nombre = entrada;
            
            // Creación de un objeto Alumno
            Alumnos a = new Alumnos(nombre, matricula);
            System.out.println("Escribe calificación de estructuras: ");
            entrada = bufer.readLine();
            a.setEstrucuturas(Double.parseDouble(entrada));
            System.out.println("Escribe calificación de inglés: ");
            entrada = bufer.readLine();
            a.setIngles(Double.parseDouble(entrada));
            System.out.println("Escribe la calificación de IoT: ");
            entrada = bufer.readLine();
            a.setIot(Double.parseDouble(entrada));
            a.setPromedio();

            // Agregando un alumno al arreglo
            alumnos[i] = a;
        }
    }

    public static void imprimirAlumnos() {
        System.out.println("Contenido del arreglo de alumnos:");
        for (Alumnos a : alumnos) {
            System.out.println("--------------------------");
            System.out.println("Información del alumno: ");
            System.out.println(a.toString());
        }
    }

    public static double calcularPromedioGrupo() {
        double suma = 0;
        for (Alumnos a : alumnos) {
            suma += a.getPromedio();
        }
        return (suma / alumnos.length);
    }

    public static double calcularPromedioEstructuras() {
        double suma = 0;
        for (Alumnos a : alumnos) {
            suma += a.getEstructuras();
        }
        return suma / alumnos.length;
    }

    public static double calcularPromedioIngles() {
        double suma = 0;
        for (Alumnos a : alumnos) {
            suma += a.getIngles();
        }
        return suma / alumnos.length;
    }

    public static double calcularPromedioIot() {
        double suma = 0;
        for (Alumnos a : alumnos) {
            suma += a.getIot();
        }
        return suma / alumnos.length;
    }

    public static void main(String[] args) throws IOException {
        int n; // Tamaño del grupo
        double promedioGeneral, promedioEstructuras, promedioIngles, promedioIot;

        System.out.println("Programa que ca3lcula el promedio de un grupo");
        System.out.println("---------------------------------------------");
        // Recuperando el tamaño del grupo
        System.out.println("Escribe el número de alumnos en el grupo:");
        entrada = bufer.readLine(); // Lectura del teclado
        n = Integer.parseInt(entrada); // Conversión de string a int

        // Construir el arreglo de alumnos
        alumnos = new Alumnos[n];
        // Introducir información
        leerAlumnos();
        // Mostrar información
        imprimirAlumnos();
        // Obtener promedio general
        promedioGeneral = calcularPromedioGrupo();
        promedioEstructuras = calcularPromedioEstructuras();
        promedioIngles = calcularPromedioIngles();
        promedioIot = calcularPromedioIot();

        System.out.println("---------------------------------------");
        System.out.println("El promedio general del grupo es: "  + promedioGeneral);
        System.out.println("---------------------------------------");
        System.out.println("El promedio de estructuras del grupo es: " + promedioEstructuras);
        System.out.println("---------------------------------------");
        System.out.println("El promedio de ingles del grupo es: " + promedioIngles);
        System.out.println("---------------------------------------");
        System.out.println("El promedio de IoT del grupo es: " + promedioIot);
    }
}