import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.EOFException;

public class promedioGrupo{

    public static void main(String[] args) {
        int n; // tamaño del grupo
        double[] calificaciones; //calificaciones de cada alumno
        double suma; //para sumar calificaciones
        double promedio; // el promedio del grupo

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.err.println("Programa que calcula el promedio de un grupo");
        System.err.println("--------------------------------------------");
        // REcupeprnaod el tamaño del grupo

        System.err.println("Escribe el numero del ali¿umnisen el grupo:");
        entrada = bufer.readLine(); //lectura de teclado
        n = Integer.parseInt(entrada); //conversion de string a int

    }
}a