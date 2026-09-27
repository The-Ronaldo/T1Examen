/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exament1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXAMENT1 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controlador controlador = new Controlador();
        int opcion = 0;

        System.out.println("*** SISTEMA DE GESTION HOSPITALARIA - HOSPITAL REGIONAL XYZ ***");

        do {
            try {
                System.out.println("\n1. Registrar nuevo Paciente");
                System.out.println("2. Listar Pacientes registrados");
                System.out.println("3. Salir");
                System.out.print("Selecciona una opcion ");
                
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("\nIngrese Nombre Completo: ");
                        String nombre = scanner.nextLine();

                        System.out.print("Ingrese Tipo de Documento (DNI, Carnet Extranjeria o Pasaporte): ");
                        String tipoDoc = scanner.nextLine();

                        System.out.print("Ingrese numero de identificación: ");
                        String numDoc = scanner.nextLine();

                        System.out.print("Ingrese tipo de sangre (Ej: O+, A-): ");
                        String sangre = scanner.nextLine();

                        System.out.print("Ingrese alergias (Ej: penicilina, frutos secos): ");
                        String alergias = scanner.nextLine();

                        System.out.print("Ingrese telefono |9 dígitos obligatorios|: ");
                        String telefono = scanner.nextLine();

                        System.out.print("Ingrese Correo electronico (debe contener '@' y terminar en '.com'): ");
                        String correo = scanner.nextLine();

                        Paciente nuevoPaciente = new Paciente(nombre, tipoDoc, numDoc, sangre, alergias, telefono, correo);
                        if (controlador.agregarPaciente(nuevoPaciente)) {
                            System.out.println("\n[ÉXITO] Paciente registrado correctamente.");
                        } else {
                            System.out.println("\n[ERROR] Los datos no cumplen con las reglas de validacion. No se pudo registrar.");
                        }
                        break;

                    case 2:
                        controlador.listarPacientes();
                        break;

                    case 3:
                        System.out.println("\nSALIENDO DEL SISTEMA...");
                        break;

                    default:
                        System.out.println("\n[AVISO] Opcion invalida. Ingrese un número entre 1 y 3.");
                }

            } catch (InputMismatchException e) {
                System.out.println("\n[ERROR] Debe ingresar un numero entero valido en el menú.");
                scanner.nextLine(); 
                opcion = 0;
            }

        } while (opcion != 3);

        scanner.close();
    }
}
