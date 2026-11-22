/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaTraduccionJava;

import java.util.Scanner;

/**
 * @author Delia Abigail Yunga Lavanda
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int suma;
        int resta;
        int multiplicacion;

        System.out.print("Ingrese el primer numero entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        numero2 = entrada.nextInt();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);

        if (numero2 != 0) {
            double division = (double) numero1 / numero2;
            int residuo = numero1 % numero2;

            System.out.println("Division: " + division);
            System.out.println("Residuo: " + residuo);
        } else {
            System.out.println("No se puede dividir entre cero.");
            System.out.println("No se puede calcular el residuo.");
        }

        entrada.close();
    }
}