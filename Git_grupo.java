package com.mycompany.git_grupo;

public class Git_grupo {
    private String nombre;
    private int cuit;
    private String direccion;
    private int telefono;
    private int cantHijos;
    private Sueldo sueldo;

    public Git_grupo(String nombre, int CUIT, String direccion, int telefono, int cantHijos, Sueldo sueldo) {
        this.nombre = nombre;
        this.cuit = CUIT;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantHijos = cantHijos;
        this.sueldo = sueldo;
    }
    
    public static void main(String[] args) {
        System.out.println("NOMBRE:" + nombre + "CUIT:" + cuit + "DIRECCION:" + direccion + "TELEFONO:" + telefono + "CANTIDAD DE HIJOS:" + cantHijos + "SUELDO:" + sueldo.datosSueldo());
    }
}
