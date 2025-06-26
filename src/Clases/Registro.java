/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author enriq
 */
public class Registro extends Persona {
    
    String ID_empleado;

    public Registro(String ID_empleado, String CURP, String RFC, String nombre, byte edad, byte genero, String nacionalidad) {
        super(CURP, RFC, nombre, edad, genero, nacionalidad);
        this.ID_empleado = ID_empleado;
    }

    public String getID_empleado() {
        return ID_empleado;
    }

    public void setID_empleado(String ID_empleado) {
        this.ID_empleado = ID_empleado;
    }

    public static class Datos {

        public static int size() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public static Object get(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public Datos() {
        }
    }
    
    
    
}
