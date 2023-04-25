package poogrupo;

public class Vendedor extends Empleado{
   private double cantVendida;
    
    public Vendedor(String nombre, int CUIT, String direccion, int telefono, int cantHijos, Sueldo sueldo, double cantVendida){
        super(nombre, CUIT, direccion, telefono, cantHijos, sueldo);
        this.cantVendida = cantVendida;
    }
    public void setcantVendida(double cantVendida){
        this.cantVendida = cantVendida;
    }
    public double getcantVendida(){
        return cantVendida;
            /*
        if (cargo.equals("Vendedor")){
         System.out.println("Ingrese la cantidad de ventas: ");
         cantV = teclado2.nextInt();
         plus = (cantV * 2 / 100);
        return plus;
        }
        */
    }

}
