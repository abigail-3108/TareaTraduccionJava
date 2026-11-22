/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaTraduccionJava;

import java.util.Scanner;

/**
* @author Delia Abigail Yunga Lavanda
*/
public class Ejercicio11 {

public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);

int numero;
int mayor;
int menor;

System.out.print("Ingrese el numero 1: ");
numero = entrada.nextInt();

mayor = numero;
menor = numero;

for (int i = 2; i <= 10; i++) {
System.out.print("Ingrese el numero " + i + ": ");
numero = entrada.nextInt();

if (numero > mayor) {
mayor = numero;
}

if (numero < menor) {
menor = numero;
}
}

System.out.println("\n--- RESULTADOS ---");
System.out.println("Numero mayor: " + mayor);
System.out.println("Numero menor: " + menor);

entrada.close();
}
}