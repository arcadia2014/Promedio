import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arreglos {
    public static void main(String[] args) throws IOException {
        //Declaracion y cinstruccion de un arreglo
        int[]arreglo1 = new int[5];

        //Asignacion de valores al arreglo
        for ( int i =0; i < arreglo1.length; i++ )
        arreglo1[i] = i + 1;

        //Imprimer el contenido del arreglo usando un for extendido
        for ( int elemento : arreglo1 )
            System.out.println("Elemento: " + elemento);

        //Declaracion de un arreglo
        double[] arreglo2;

        //No se puede usarf un arreglo que no ha sido construido
       // arreglo2[0] = 12.47;

       //Onjetos para introducir valores
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        //Tamaño del arreglo
        int t;

        System.out.println("¿Cual es el tamaño del arreglo?: ");
        entrada = bufer.readLine();
        t = Integer.parseInt(entrada);

        //construimos el arreglo
        arreglo2 = new double[t];

        //Rellenar arreglo mediante teclado
        for ( int i = 0; i < arreglo2.length; i++ ){
            System.out.println("Escribe elemento [ "+ (i+1) +" ]");
            entrada = bufer.readLine();
            arreglo2[i] = Double.parseDouble(entrada);
        }

        //Imprimir los elementos del arreglo2
        System.out.println("Contenido del arreglo: ");
        for (double elemento : arreglo2) {
            System.out.println("Elemento: " + elemento);
        }

    }
}