/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_poo_2b.pootareas2b;

/**
 *
 * @author svramirez
 * 
 * Creación de variables, metodos y constructores
 * Uso de herencia e interface
 * 
 */
public class persons implements persons_interface {
    private String nombre;
    private String idPerson;
    private int edad;

    public persons(String nombre,  String idPerson, int edad) {
        this.nombre = nombre;
        this.idPerson = idPerson;
        this.edad = edad;
    }

    public persons() {
        this.nombre = "";
        this.idPerson = "";
        this.edad = 0;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
   
    @Override
    public String getIdPerson() {
        return idPerson;
    }
    @Override
    public int getedad() {
        return edad;
  
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }
    
    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
       
}
