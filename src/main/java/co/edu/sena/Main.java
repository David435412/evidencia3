package co.edu.sena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double dato1;
        double dato2;
        double dato3;
        double dato4;

        // Todo Menú y Submenús
        Ejercicios ejercicios = new Ejercicios();

        System.err.println("1.1 Calcular el área de un triángulo");
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese la base del triángulo: ");
        dato1 = scr.nextDouble();
        System.out.println("Ingrese la altura del triángulo: ");
        dato2 = scr.nextDouble();
        dato3 = ejercicios.areaTriangulo(dato1, dato2);
        System.out.println("El area del triángulo es: " + dato3);

    }

}

class Sumnumbers {
    public static void main(String[] args) {
        double dato1;
        double dato2;
        double dato3;
        double dato4;

        // Todo Menú y Submenús
        Ejercicios ejercicios = new Ejercicios();

        System.err.println("1.2 Ingresar 2 numeros y sumarlos");
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        dato1 = scr.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        dato2 = scr.nextDouble();
        dato3 = ejercicios.sumarNumeros(dato1, dato2);
        System.out.println("La suma es: " + dato3);
    }
}
