/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ignacio.ñarfit;

/**
 *
 * @author brand
 */
public class Socio {

    //Definición de atributos
    private String nombre;
    private String cedula;
    private String id;
    private String correo;
    private String fechaPago;
    private String fechaVencimiento;
    private String edad;

   
    //Definición de constructor
  
    
    //Definición de getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

 

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    //Definición de toString

    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", cedula=" + cedula + ", id=" + id + ", correo=" + correo + ", fechaPago=" + fechaPago + ", fechaVencimiento=" + fechaVencimiento + ", edad=" + edad + '}';
    }
   
   
    
}
