package poogrupo;

import java.util.Scanner;

/**
 *
 * @author ET36
 */
public class Sueldo {

    private double obraSocial;
    private double jubilacion;
    private double presentismo;
    private double asignacionFamiliar;
    private String cargo;
    private String genero;
       
    
    public Sueldo(double obraSocial, double jubilacion, double presentismo, double asignacionFamiliar, String cargo, char genero) {
        this.obraSocial = obraSocial;
        this.jubilacion = jubilacion;
        this.presentismo = presentismo;
        this.asignacionFamiliar = asignacionFamiliar;
        this.cargo = cargo;
        
    }

    public void emitir(){
        System.out.println("Sueldo neto: " + this.calcSueldoN());
        System.out.println("Sueldo básico: " + this.calcSueldoB());
        System.out.println("Obra social: " + obraSocial + "\n Jubilación: " + jubilacion + "/n Presentismo: " + presentismo + "/n Asignación Familiar: " + asignacionFamiliar);
        System.out.println("");
    }
    
    public double calcSueldoB(){
        double sb = 0.0;
        if (cargo.equals("Panadero")){
            sb = 98000;
        }
        if (cargo.equals("Repostero")){
            sb = 110000;
        }
        if (cargo.equals("Vendedor")){
            sb = 70000;
        }
        return sb;
    }
    
    public double calcSueldoN(Empleado emp){
        
        String pres ;
        String obra ;
        int edad = 0;
        Scanner teclado = new Scanner(System.in);
        double sn = 0;
        double jubilacion = (calcSueldoB() * 11 / 100);
        double obraSocial = (calcSueldoB() * 3 / 100);
        double presentismo = (calcSueldoB() * 10 / 100);
        double valH = 11.465;
        emp.Hijos(int cantH);
        
        System.out.println("Ingrese la edad: ");
        edad = teclado.nextInt();
        if (edad > 60){
            sn = sn - jubilacion;
        }
        
        System.out.println("Posee obra social?: ");
        obra = teclado.next();
        if ("si".equalsIgnoreCase(obra)){
            sn = sn - obraSocial;
        }
        
        System.out.println("Cu�ntos hijos tiene?: ");
        cantH = teclado.nextInt();
        if (cantH > 0){
            sn = sn + (valH * cantH);
        }
        
        System.out.println("Respet� el presentismo?: ");
        pres = teclado.next();
        if("si".equalsIgnoreCase(pres)){
            sn = sn + presentismo;
        }
        
        System.out.println("Especifique su genero: ");
        genero = teclado.next();
        if("hombre".equalsIgnoreCase(genero)){
            plusHombre();
        }
        
        return sn;
        
    }
    
     public double plusHombre(){
         double plusRepostero = 0;
         
        if (cargo.equals("Repostero")){
        plusRepostero += 110000*10 / 100;
        }
        else{
            plusRepostero =0;
        }
        return plusRepostero;
     }
 
     
    
}