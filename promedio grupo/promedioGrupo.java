import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromedioGrupo {   
    
    //Declarando variables globales
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    // declaracion de un arreglo de tipo TDA 
    public static Alumnos[] alumnos;

    public static void leerAlumnos() throws IOException{
        String matricula, nombre;

        System.out.println("Solicitud de informacion de cada estudiante");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("-------------------------------------------");
            System.out.println("Escribe la matricula: ");
            entrada = bufer.readLine();
            matricula = entrada;
            System.out.println("Escribe el nombre: ");
            entrada = bufer.readLine();
            nombre = entrada;
            // creacion de un objeto Alumno (POLLO)
           Alumnos a = new Alumnos(nombre, matricula);
           System.out.println("Escribe calificacion de estructuras: ");
           entrada = bufer.readLine();
           a.setEstrucuturas(Double.parseDouble(entrada));
           System.out.println("Escribir calificaciones de ingles: ");
           entrada = bufer.readLine();
           a.setIngles(Double.parseDouble(entrada));
           System.out.println("Escribe la calificacion de IOT: ");
           entrada = bufer.readLine();
           a.setIot(Double.parseDouble(entrada));
           a.setPromedio();
           //Agregando un alumno al arreglo
           alumnos[i] = a;
        }
    }
    public static void imprimirAlumnos(){
        System.out.println("Contenido del arreglo alumnos: ");
        for (Alumnos a : alumnos ) {
            System.out.println("--------------------------");
            System.out.println("Informacion del alumno: ");
            System.out.println(a.toString());
        }
    }

    public static double calcularPromedioGrupo(){
        double suma = 0;
        for (Alumnos a : alumnos){
            suma += a.getPromedio();
        }
        return (suma/ alumnos.length);
    }

    public static void main(String[] args) throws IOException {
    int n; // tamaño del grupo
    double promedio;


    // double[] calificaciones; // calificaciones de cada alumno
    // double suma = 0; // suma de las calificaciones
    // double promedio;

    System.out.println("Programa que calcula el promedio de un grupo");
    System.out.println("---------------------------------------------");
    // Recuperando el tamaño del grupo
    System.out.println("Escribe el número de alumnos en el grupo:");
    entrada = bufer.readLine(); // Lectura del teclado
    n = Integer.parseInt(entrada); // conversión de string a int

    // construir el arreglo alumnos
    alumnos = new Alumnos[n];
        //Introducir informacion
    leerAlumnos();
    //mostrar informacion
    imprimirAlumnos();
    //obtener promedio
    promedio = calcularPromedioGrupo();


    System.out.println("---------------------------------------");
    System.out.println("El promedio del grupo es: " + promedio);
}
}