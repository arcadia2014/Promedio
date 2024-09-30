public class funcionalidadPercursica{

public static int factorial(int num){
    System.out.println("En factorial, con num = " + num);
    // Caso base
    if (num == 0){
        System.out.println("En factorial en el caso base, num = " + num);
        return 1;
    }
    else {
        System.out.println("Invocando factorial con num = " + (num - 1));
        return num * factorial(num - 1);
    }
}

public static void main(String[] args) throws Exception {
    int numero = 5;
    int fack;
        
    System.out.println("Factorial Recursivo de un número");
    fack = factorial(numero);
    System.out.println("El factorial de " + numero + " es: " + fack);

    }
}