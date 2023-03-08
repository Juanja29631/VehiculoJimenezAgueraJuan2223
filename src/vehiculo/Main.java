package vehiculo;

/**
 *
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
