package vehiculo;

/**
 * Clase que realiza una serie de operaciones (compra, venta, stock de
 * vehículos, mostrando resultados por pantalla.) con un objeto
 * miVehiculoJimenezAgueraJuan2223 de la clase VehiculoJimenezAgueraJuan2223 y
 * utilizando un método de operativa con dos métodos derivados de la misma uno
 * de compra y otro de venta.
 *
 * @author IES Aguadulce
 * @since 22/02/2023
 * @version 1.0, 22/02/2023
 */

public class Main {

    /**
     * Metodo que crea un objeto VehiculoJimenezAgueraJuan2223, que recoge la
     * operativa del objeto miVehiculoJimenezAgueraJuan2223, la cual realiza una
     * venta sobre el mismo, posteriormente una compra y recoge un stock
     * disponible.
     *
     * @param args argumentos que se les puede pasar al método principal
     */
    public static void main(String[] args) {
        VehiculoJimenezAgueraJuan2223 miVehiculoJimenezAgueraJuan2223;

        int stockActual;

        miVehiculoJimenezAgueraJuan2223 = new VehiculoJimenezAgueraJuan2223("Seat", 18000, 100);// //Creación objeto miVehiculoJimenezAgueraJuan2223
        VehiculoJimenezAgueraJuan2223.operativaVehiculosJimenezAgueraJuan2223(miVehiculoJimenezAgueraJuan2223, 50);//
        stockActual = miVehiculoJimenezAgueraJuan2223.obtenerStock();// Cantidad de vehículos disponible
        System.out.println("El stock actual es " + stockActual);//Salida por pantalla del stock.
    }

}
