/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaTraduccionJava;

import java.util.Scanner;

/**
 * @author Delia Abigail Yunga Lavanda
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre;
        String carrera;
        int edad;
        double estatura;

        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Ingrese su carrera: ");
        carrera = entrada.nextLine();

        System.out.print("Ingrese su estatura en metros: ");
        estatura = entrada.nextDouble();

        System.out.println("\n--- DATOS INGRESADOS ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " anos");
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura + " metros");

        entrada.close();
    }
}
    
