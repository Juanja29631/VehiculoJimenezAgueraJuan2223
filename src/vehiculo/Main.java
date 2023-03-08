package vehiculo;
/**
 * Clase que realiza una serie de operaciones (compra, venta, stock, 
 * resultados por pantalla..) con un objeto de la clase 
 * VehiculoJimenezAgueraJuan2223 y utilizando dos métodos 
 * derivados de la misma. 
 * @author portatil_profesorado
 * @since 01/01/2022
 * @version 1.0, 22/02/2022
 */
/**
 * Clase que realiza una serie de operaciones (compra, venta, stock, 
 * resultados por pantalla..) con un objeto de la clase 
 * JamonMuleroPedrosaBenjamin2122 y utilizando dos métodos 
 * derivados de la misma.
 * @author IES Aguadulce
 */
public class Main {

    public static void main(String[] args) {
        VehiculoJimenezAgueraJuan2223 miVehiculoJimenezAgueraJuan2223;
        int stockActual;

        miVehiculoJimenezAgueraJuan2223 = new VehiculoJimenezAgueraJuan2223("Seat", 18000, 100);
        VehiculoJimenezAgueraJuan2223.operativaVehiculosJimenezAgueraJuan2223(miVehiculoJimenezAgueraJuan2223, 50);
        stockActual = miVehiculoJimenezAgueraJuan2223.obtenerStock();
        System.out.println("El stock actual es" + stockActual);
    }

}
