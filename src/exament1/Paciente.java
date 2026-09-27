/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exament1;
/**
 *
 * @author LENOVO
 */
public class Paciente {
    private String nombreCompleto;
    private String tipoDocumento;
    private String numeroIdentificacion;
    private String tipoSangre;
    private String listaAlergias;
    private String telefono;
    private String correoElectronico;
    
    public Paciente() {
    }
    public Paciente(String nombreCompleto, String tipoDocumento, String numeroIdentificacion, 
       String tipoSangre, String listaAlergias, String telefono, String correoElectronico) {
        this.nombreCompleto = nombreCompleto;
        this.tipoDocumento = tipoDocumento;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoSangre = tipoSangre;
        this.listaAlergias = listaAlergias;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getListaAlergias() {
        return listaAlergias;
    }

    public void setListaAlergias(String listaAlergias) {
        this.listaAlergias = listaAlergias;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public boolean validarDatos() {
        if (nombreCompleto == null || nombreCompleto.trim().isEmpty()) return false;
        if (numeroIdentificacion == null || numeroIdentificacion.trim().isEmpty()) return false;
        if (correoElectronico == null || !correoElectronico.contains("@") || !correoElectronico.endsWith(".com")) return false;
        if (telefono == null || telefono.length() != 9) return false;
        return true;
    }

    @Override
    public String toString() {
        return "----------------------------------------\n" +
               "Paciente: " + nombreCompleto + "\n" +
               "Tipo Doc: " + tipoDocumento + " | N° ID: " + numeroIdentificacion + "\n" +
               "Tipo de Sangre: " + tipoSangre + "\n" +
               "Alergias: " + listaAlergias + "\n" +
               "Telefono: " + telefono + " | Correo: " + correoElectronico + "\n" +
               "----------------------------------------";
    }
}
