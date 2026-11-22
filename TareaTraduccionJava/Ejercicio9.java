/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaTraduccionJava;

import java.util.Scanner;

/**
 * @author Delia Abigail Yunga Lavanda
 */
public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero entero: ");
        numero = entrada.nextInt();

        System.out.println("\n--- TABLA DEL " + numero + " ---");

        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        entrada.close();
    }
}