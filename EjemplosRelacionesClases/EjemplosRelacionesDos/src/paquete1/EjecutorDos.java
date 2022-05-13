/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class EjecutorDos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Crear un objeto de tipo barrio
        //ingresar por teclado el valor del nombre Barrio
        String nomBarrio;
        System.out.println("Ingrese el nombre del Barrio");
        nomBarrio = entrada.nextLine();
        Barrio bar1 = new Barrio(nomBarrio);
        // Crear un objeto de tiupo persona
        // ingresar por teclado el nombre, cedula
        // asociar el barrio ingresado anteriormente 
        System.out.println("Ingrese el Nombre de la persona");
        String nomPersona = entrada.nextLine();
        System.out.println("Ingrese la cedula");
        String cedula = entrada.nextLine();
        Persona per1 = new Persona(nomPersona, cedula, bar1);
        // Presentar la representacion del objeto persona
        System.out.printf("%s\n",per1);
    }
}
