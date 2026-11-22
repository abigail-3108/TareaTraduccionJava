/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaTraduccionJava;

import java.util.Scanner;

/**
 * @author Delia Abigail Yunga Lavanda
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String contrasena;

        do {
            System.out.print("Ingrese la contrasena: ");
            contrasena = entrada.nextLine();

            if (!contrasena.equals("java2026")) {
                System.out.println("Contrasena incorrecta. Intente nuevamente.");
            }

        } while (!contrasena.equals("java2026"));

        System.out.println("Acceso concedido.");

        entrada.close();
    }
}
