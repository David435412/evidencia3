package co.edu.sena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Bienvenido a la miscelánea de ejercicios.");
        System.out.println("Por favor, elija una opción:");
        System.out.println("1. Operadores");
        System.out.println("2. Condicionales");
        System.out.println("3. Ciclos");

        int opcion = scr.nextInt();

        switch (opcion) {
            case 1:
                ejecutarOperadores();
                break;
            case 2:
                ejecutarCondicionales();
                break;
            case 3:

                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static void ejecutarOperadores() {
        Scanner scr = new Scanner(System.in);
        Ejercicios ejercicios = new Ejercicios();
        double dato1, dato2, dato3, dato4;

        System.out.println("Operadores:");
        System.out.println("1. Calcular el área de un triángulo");
        System.out.println("2. Ingresar 2 números y sumarlos");
        System.out.println("3. Ingresar un número y visualizar el número al cuadrado");
        System.out.println("4. Escribir un algoritmo que convierta de euros a dólares");
        System.out.println("5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del perímetro");
        System.out.println("6. Escribir un algoritmo que determine el área y el volumen de un cilindro");
        System.out.println("7. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y el área del círculo inscrito");
        System.out.println("8. Calcular el promedio de tres números ingresados por teclado");

        int ejercicio = scr.nextInt();

        switch (ejercicio) {
            case 1:
                System.out.println("Ingrese la base del triángulo: ");
                dato1 = scr.nextDouble();
                System.out.println("Ingrese la altura del triángulo: ");
                dato2 = scr.nextDouble();
                dato3 = ejercicios.areaTriangulo(dato1, dato2);
                System.out.println("El área del triángulo es: " + dato3);
                break;
            case 2:
                System.out.println("Ingrese el primer número: ");
                dato1 = scr.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                dato2 = scr.nextDouble();
                dato3 = ejercicios.sumarNumeros(dato1, dato2);
                System.out.println("La suma es: " + dato3);
                break;
            case 3:
                System.out.println("Ingrese un número: ");
                dato1 = scr.nextDouble();
                dato2 = ejercicios.numeroCuadrado(dato1);
                System.out.println("El número al cuadrado es: " + dato2);
                break;
            case 4:
                System.out.println("Ingrese la cantidad en Euros para convertir a dólar: ");
                dato1 = scr.nextDouble();
                dato2 = ejercicios.euroDolar(dato1);
                System.out.println("Sus euros equivalen a " + dato2 + " dólares");
                break;
            case 5:
                System.out.println("Ingrese el lado del cuadrado: ");
                dato1 = scr.nextDouble();
                dato2 = ejercicios.cuadradoArea(dato1);
                dato3 = ejercicios.cuadradoPerimetro(dato1);
                System.out.println("El área del cuadrado es " + dato2 + " y el perímetro es " + dato3);
                break;
            case 6:
                System.out.println("Ingrese el radio de la base del cilindro: ");
                dato1 = scr.nextDouble();
                System.out.println("Ingrese la altura del cilindro: ");
                dato2 = scr.nextDouble();
                dato3 = ejercicios.cilindroArea(dato1, dato2);
                dato4 = ejercicios.cilindroVolumen(dato1, dato2);
                System.out.println("El área del cilindro es " + dato3 + " y el volumen es " + dato4);
                break;
            case 7:
                System.out.println("Ingrese el radio del círculo: ");
                dato1 = scr.nextDouble();
                dato2 = ejercicios.circuloLongitud(dato1);
                dato3 = ejercicios.circuloArea(dato1);
                System.out.println("La longitud del círculo es " + dato2 + " y el área es " + dato3);
                break;
            case 8:
                System.out.println("Ingrese el primer número: ");
                dato1 = scr.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                dato2 = scr.nextDouble();
                System.out.println("Ingrese el tercer número: ");
                dato3 = scr.nextDouble();
                dato4 = ejercicios.promedio(dato1, dato2, dato3);
                System.out.println("El promedio de los 3 números es: " + dato4);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static void ejecutarCondicionales() {
        Scanner scr = new Scanner(System.in);
        Ejercicios ejercicios = new Ejercicios();
        double dato1, dato2, dato3, dato4;

        System.out.println("Condicionales:");
        System.out.println("1. Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo.");
        System.out.println("2. Escribir un algoritmo que reciba dos números por teclado y diga cuál es el mayor y cuál el menor.");
        System.out.println("3. Escriba un programa que lea tres números enteros positivos y que calcule e imprima en pantalla el menor y el mayor de ellos.");
        System.out.println("4. Dados dos números A y B, sumarlos si A es menor que B o sino restarlos.");
        System.out.println("5. Dados dos números A y B encontrar el cociente entre A y B.");
        System.out.println("6. Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplicarlos.");
        System.out.println("7. Escribir un algoritmo que determine si un año es bisiesto o no.");

        int ejercicio = scr.nextInt();

        switch (ejercicio) {
            case 1:
                System.out.println("Ingrese un número:");
                dato1 = scr.nextDouble();
                if (dato1 > 0) {
                    System.out.println("El número es positivo.");
                } else if (dato1 < 0) {
                    System.out.println("El número es negativo.");
                } else {
                    System.out.println("El número es cero.");
                }
                break;

            case 2:
                System.out.println("Ingrese el primer número:");
                dato1 = scr.nextDouble();
                System.out.println("Ingrese el segundo número:");
                dato2 = scr.nextDouble();
                if (dato1 > dato2) {
                    System.out.println("El mayor es: " + dato1);
                    System.out.println("El menor es: " + dato2);
                } else if (dato1 < dato2) {
                    System.out.println("El mayor es: " + dato2);
                    System.out.println("El menor es: " + dato1);
                } else {
                    System.out.println("Los números son iguales.");
                }
                break;

            case 3:
                System.out.println("Ingrese el primer número");
                dato1 = scr.nextDouble();
                System.out.println("Ingrese el segundo número");
                dato2 = scr.nextDouble();
                System.out.println("Ingrese el tercer número");
                dato3 = scr.nextDouble();

                if (dato1 < 0 || dato2 < 0 || dato3 < 0) {
                    System.out.println("Los números deben ser positivos");
                } else if (dato1 == dato2 || dato1 == dato3) {
                    System.out.println("Digite 3 números distintos");
                } else if (dato2 == dato1 || dato2 == dato3) {
                    System.out.println("Digite 3 números distintos");
                } else if (dato3 == dato1 || dato3 == dato2) {
                    System.out.println("Digite 3 números distintos");
                } else if (dato1 > dato2 && dato1 > dato3 && dato2 < dato3) {
                    System.out.println("El número mayor es " + dato1 + " y el número menor es " + dato2);
                } else if (dato1 > dato2 && dato1 > dato3 && dato3 < dato2) {
                    System.out.println("El número mayor es " + dato1 + " y el número menor es " + dato3);
                } else if (dato2 > dato1 && dato2 > dato3 && dato1 < dato3) {
                    System.out.println("El número mayor es " + dato2 + " y el número menor es " + dato1);
                } else if (dato2 > dato1 && dato2 > dato3 && dato3 < dato1) {
                    System.out.println("El número mayor es " + dato2 + " y el número menor es " + dato3);
                } else if (dato3 > dato1 && dato3 > dato2 && dato1 < dato2) {
                    System.out.println("El número mayor es " + dato3 + " y el número menor es " + dato1);
                } else if (dato3 > dato1 && dato3 > dato2 && dato2 < dato1) {
                    System.out.println("El número mayor es " + dato3 + " y el número menor es " + dato2);
                }
                break;

            case 4:
                System.out.println("Ingrese el primer número:");
                dato1 = scr.nextDouble();
                System.out.println("Ingrese el segundo número:");
                dato2 = scr.nextDouble();
                if (dato1 < dato2) {
                    System.out.println("La suma es: " + (dato1 + dato2));
                } else {
                    System.out.println("La resta es: " + (dato1 - dato2));
                }
                break;

            case 5:
                System.out.println("Ingrese el dividendo:");
                dato1 = scr.nextDouble();
                System.out.println("Ingrese el divisor:");
                dato2 = scr.nextDouble();
                if (dato2 != 0) {
                    System.out.println("El cociente es: " + (dato1 / dato2));
                } else {
                    System.out.println("No se puede dividir por cero");
                }
                break;

            case 6:
                System.out.println("Ingrese el primer número:");
                dato1 = scr.nextDouble();
                System.out.println("Ingrese el segundo número:");
                dato2 = scr.nextDouble();
                if (dato1 < 0 || dato2 < 0) {
                    System.out.println("La suma es: " + (dato1 + dato2));
                } else {
                    System.out.println("La multiplicación es: " + (dato1 * dato2));
                }
                break;
                
            case 7:
                System.out.println("Ingrese el año:");
                dato1 = scr.nextDouble();            
          
                if ((dato1 % 4 == 0 && dato1 % 100 != 0) || (dato1 % 400 == 0)) {                 
                    System.out.println(dato1 + "es un año bisiesto");
                } else {                   
                    System.out.println(dato1 + "no es un año bisiesto");
                }
                break;               

            default:
                System.out.println("Opción no válida.");
                break;
        }

    }

}
