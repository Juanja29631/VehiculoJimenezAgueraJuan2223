package vehiculo;

/**
 * Clase que realiza operaciones de compra y venta dede Vehiculos. Recogiendo el
 * stock disponible.
 *
 * @since 01/01/2022
 * @author IES Aguadulce
 */
public class VehiculoJimenezAgueraJuan2223 {

    static void operativaVehiculosJimenezAgueraJuan2223(VehiculoJimenezAgueraJuan2223 miVehiculoJimenezAgueraJuan2223, int cantidad) {
        try {
            System.out.println("Venta de Vehiculos");
            miVehiculoJimenezAgueraJuan2223.vender(20);
        } catch (Exception e) {
            System.out.print("Fallo al vender");
        }
        try {
            System.out.println("Compra de Vehiculos");
            miVehiculoJimenezAgueraJuan2223.comprar(100);
        } catch (Exception e) {
            System.out.print("Fallo al comprar");
        }
    }
    /**
     * Nombre del vehículo
     */
    private String nombre;
    /**
     * Precio del vehículo
     */
    private double precio;
    /**
     * Precio con iva del vehículo
     */
    private double precioIVA;
    /**
     * Estocaje de vehículos
     */
    private int stock;

    //CONSTRUCTORES
    /**
     * Constructor general sin parámetros
     */
    public VehiculoJimenezAgueraJuan2223() {
    }

    /**
     * Constructor para iniciar todas las propiedades del vehiculo tres
     * parámetros.
     *
     * @param nom nombre del vehículo
     * @param precio precio del vehículo
     * @param stock disponibilidad de vehículos
     */
    public VehiculoJimenezAgueraJuan2223(String nom, double precio, int stock) {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
    }

    //MÉTODOS
    // Método para asignar el nombre del vehiculo
    /**
     * Método para asignar el nombre del vehiculo
     *
     * @param nom nombre del vehículo.
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Método que me devuelve el nombre del vehiculo
     *
     * @return nombre del vehículo
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Método que me devuelve el stock de vehiculos disponible en cada momento
     *
     * @return stock de vehiculos disponible en cada momento
     */
    // Método que me devuelve el stock de vehiculos disponible en cada momento
    public int obtenerStock() {
        return getStock();
    }

    /**
     * Método para comprar vehiculos. Modifica el stock.
     *
     * @param cantidad número de vehículos.
     * @throws Exception si se compra numero negativo de vehículos.
     *
     */
    //Este método va a ser probado con Junit
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        }
        setStock(getStock() + cantidad);
    }

    /**
     * Método para vender vehiculos
     *
     * @param cantidad de vehículos se van a vender
     * @throws Exception Muestra excepción si se intenta vender cantidad
     * negativa de vehículos o mayor a las existencias
     *
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede vender una cantidad negativa de vehiculos");
        }
        if (obtenerStock() < cantidad) {
            throw new Exception("No se hay suficientes vehiculos para vender");
        }
        setStock(getStock() - cantidad);
    }

    /**
     * * Método para retornar el nombre del vehiculo
     *
     * @return nombre del vehiculo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para asignar normbre
     *
     * @param nombre el nombre a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método da el precio
     *
     * @return precio del vehiculo
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método para asignar el precio
     *
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método para precio con iva
     *
     * @return devuelve el precioIVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Método para asignar el precio con iva
     *
     * @param precioIVA the precioIVA to set
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Método devuelve el stock disponible
     *
     * @return el stock de vehiculos
     */
    public int getStock() {
        return stock;
    }

    /**
     * Método para asignar el stock de vehículos
     *
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

}
