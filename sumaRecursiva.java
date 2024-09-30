public class sumaRecursiva{

    public static int Suma(int num){
        System.out.println("En suma, con num = " + num);
        
        if (num == 1){
            System.out.println("En suma, en el caso base, num = " + num);
            return 1;
        } else {
            System.out.println("Invocando suma con num = " + (num-1));
            return num + Suma(num - 1);
        }
    }

    public static void main(String[] args){
        int numero = 6;
        int resultado;

        System.out.println("Suma Recursiva de un Número");
        resultado = Suma(numero);
        System.out.println("La suma de " + numero + " es: " + resultado);
    }
}