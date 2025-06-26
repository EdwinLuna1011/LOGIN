/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author enriq
 */
public class Usuario {

    private String nombre, correo, usuario, contraseña, confirmarContraseña, dominio, numero;
    private boolean activo;
   
    public Usuario(String nombre, String correo, String usuario, String contraseña, String confirmarContraseña, String dominio, String numero) {
        this.nombre = nombre;
        this.correo = correo;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.confirmarContraseña = confirmarContraseña;
        this.dominio = dominio;
        this.numero = numero;
        this.activo = true; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getConfirmarContraseña() {
        return confirmarContraseña;
    }

    public void setConfirmarContraseña(String confirmarContraseña) {
        this.confirmarContraseña = confirmarContraseña;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }
     public String getnumero() {
        return numero;
    }

    public void setnumero(String numero) {
        this.numero = numero;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
    
    
    @Override
    public String toString() {
        return "Usuario{" + "correo=" + correo + ", usuario=" + usuario + ", contraseña=="
                + contraseña + "numero"+ numero+'}';
    }
    
    
    
    
}
