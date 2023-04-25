package poogrupo;

import java.util.Scanner;

public class Empleado {
    
    private String nombre;
    private int cuit;
    private String direccion;
    private int telefono;
    private int cantH = 0;
    private Sueldo sueldo;

    public Empleado(String nombre, int CUIT, String direccion, int telefono, Sueldo sueldo) {
        this.nombre = nombre;
        this.cuit = CUIT;
        this.direccion = direccion;
        this.telefono = telefono;
        
    }
    
    public int Hijos(int cantH){
        this.cantH = cantH; 
    }
    
    public String mostrarDatos() {
       
        Scanner teclado = new Scanner(System.in);        
        for(int i = 0; i < 6; i++){
            System.out.println("Ingrese el nombre: ");
            nombre = teclado.next();
            System.out.println("Ingrese el CUIT: ");
            cuit = teclado.nextInt();
            System.out.println("Ingrese la direccion: ");
            direccion = teclado.next();
            System.out.println("Ingrese el telefono: ");
            telefono = teclado.nextInt();
            System.out.println("Ingrese la cantidad de hijos: ");
            cantH = teclado.nextInt();
            System.out.println("Ingrese el sueldo: ");
            sueldo = teclado.nextSueldo();

        }
        return "NOMBRE:" + nombre + "CUIT:" + cuit + "DIRECCION:" + direccion + "TELEFONO:" + telefono + "CANTIDAD DE HIJOS:" + cantH + "\n SUELDO:" + sueldo.calcSueldoN();
    }

}
