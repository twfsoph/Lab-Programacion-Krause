package main.java.com.trabajopractico.tp3.Ejercicio4;

public class Main2 {
    public static void main(String[] args) {

        Vendedor uan = new Vendedor("sopia");
        Vendedor chu = new Vendedor("brune");
        Vendedor tri = new Vendedor("nache");

        Vehiculo v1 = new Vehiculo("aute1");
        Vehiculo v2 = new Vehiculo("aute2");
        Vehiculo v3 = new Vehiculo("aute3");
        Vehiculo v4 = new Vehiculo("aute4");
        Vehiculo v5 = new Vehiculo("aute5");
        Vehiculo v6 = new Vehiculo("aute6");
        Vehiculo v7 = new Vehiculo("aute7");
        Vehiculo v8 = new Vehiculo("aute8");
        Vehiculo v9 = new Vehiculo("aute9");
        Vehiculo v10 = new Vehiculo("aute10");

        uan.agregarVehiculo(v3);
        uan.mostrarVehiculosVendedor();
        uan.borrarVehiculo(v3);
        uan.mostrarVehiculosVendedor();
         uan.agregarVehiculo(v2);
         uan.agregarVehiculo(v1);

         chu.agregarVehiculo(v4);
         chu.agregarVehiculo(v5);
         chu.agregarVehiculo(v6);

         tri.agregarVehiculo(v7);
         tri.agregarVehiculo(v8);
         tri.agregarVehiculo(v9);
         chu.agregarVehiculo(v10);
    }
}




import java.util.ArrayList;
import java.util.List;

class Vendedor {
    private String nombre;
    private List<Vehiculo> vehiculos;

    public Vendedor(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>;
        
    }

    public void agregarVehiculo(Vehiculo v){
        vehiculos.add(v);
    }
    public void borrarVehiculo(Vehiculo v){
        vehiculos.delete(v);
    }
    public void mostrarVehiculosVendedor()
    {
        
        return "Nombre Vendedor: " + nombre + "Vehiculo : " + vehiculos ;
    }
    
    
}


class Vehiculo {
    private String nombre;
    private String Marca;
    private String Patente;

    public Vehiculo(String nombre,String Marca, String Patente) {
        this.nombre = nombre;
        this.marca = marca;
        this.patente
    }
}
