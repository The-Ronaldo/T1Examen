/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exament1;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<Paciente> listaPacientes;

    public Controlador() {
        this.listaPacientes = new ArrayList<>();
    }
    
    public boolean agregarPaciente(Paciente paciente) {
        if (paciente != null && paciente.validarDatos()) {
            listaPacientes.add(paciente);
            return true;
        }
        return false;
    }
    public void listarPacientes() {
        if (listaPacientes.isEmpty()) {
            System.out.println("\nNo hay pacientes registrados en el sistema actualmente.");
        } else {
            System.out.println("\n****0 LISTA DE PACIENTES REGISTRADOS |HOSPITAL XYZ|****");
            for (Paciente p : listaPacientes) {
                System.out.println(p.toString());
            }
        }
    }
}