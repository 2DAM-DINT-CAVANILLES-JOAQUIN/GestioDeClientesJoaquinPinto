/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Cliente {

    private String nombre;
    private String apellidos;
    private Date fechaAlta;
    private String provincia;
    private String email;
    private int telefono;

    public Cliente(String nombre, String apellidos, Date fechaAlta, String provincia, String email,int telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaAlta = fechaAlta;
        this.provincia = provincia;
        this.email = email;
        this.telefono = telefono;
    }
// Getters y setters (puedes generarlos con Alt+Insert)

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
// Para volcar el objeto en la tabla:

    public String[] toArrayString() {
        // Definimos el formato de fecha día/mes/año
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String telefonoCast = Integer.toString(telefono); //castear de int a string

        // Validamos si la fecha existe para evitar errores de puntero nulo
        String fechaFormateada = (fechaAlta != null) ? sdf.format(fechaAlta) : "";

        // Retornamos el array con la información organizada
        return new String[]{nombre, apellidos, fechaFormateada, provincia, email, telefonoCast};
    }
}
