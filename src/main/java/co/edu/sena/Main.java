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

class NumberSquared {
    public static void main(String[] args) {
        double dato1;
        double dato2;
        double dato3;
        double dato4;

        // Todo Menú y Submenús
        Ejercicios ejercicios = new Ejercicios();

        System.err.println("1.3 Ingresar un número y visualizar el número al cuadrado");
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        dato1 = scr.nextDouble();
        dato2 = ejercicios.numeroCuadrado(dato1);
        System.out.println("El número al cuadrado es: " + dato2);
    }
}

class EuroDollar {
    public static void main(String[] args) {
        double dato1;
        double dato2;
        double dato3;
        double dato4;

        // Todo Menú y Submenús
        Ejercicios ejercicios = new Ejercicios();

        System.err.println("1.4 Escribir un algoritmo que convierta de euros a dólares");
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese la cantidad en Euros para convertir a dólar: ");
        dato1 = scr.nextDouble();
        dato2 = ejercicios.euroDolar(dato1);
        System.out.println("Sus euros equivalen a " + dato2 + " dólares");
    }

}

class Squared {
    public static void main(String[] args) {
        double dato1;
        double dato2;
        double dato3;
        double dato4;

        // Todo Menú y Submenús
        Ejercicios ejercicios = new Ejercicios();

        System.err.println("1.5 Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del area y del perimetro");
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese el lado del cuadrado: ");
        dato1 = scr.nextDouble();
        dato2 = ejercicios.cuadradoArea(dato1);
        dato3 = ejercicios.cuadradoPerimetro(dato1);
        System.out.println("El área del cuadrado es "  + dato2  + " y el perimetro es "  + dato3);
    }
}
