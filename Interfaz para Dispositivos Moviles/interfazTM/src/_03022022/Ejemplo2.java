package _03022022;

import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        int numero1;
        double numero2;
        char letra;
        boolean busqueda;
        String nombre;
        letra = 'S';
        nombre = "Juan Perez";
        busqueda = false;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese un numero decimal: ");
        numero2 = entrada.nextDouble();
        System.out.println("Ingrese una palabra: ");
        nombre = entrada.nextLine();
        double raiz = Math.sqrt(81);
        System.out.println("El valor de PI es: " + Math.round(Math.PI));
        entrada.close();
    }
}
