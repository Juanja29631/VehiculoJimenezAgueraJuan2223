package vehiculo;

/**
 *
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

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /**
     * Constructor general sin parámetros
     */
    public VehiculoJimenezAgueraJuan2223() {
    }

    /**
     * Constructor para iniciar todas las propiedades del vehiculo tres
     * parámetros.
     *
     * @param nom
     * @param precio
     * @param stock
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
     * @return nombre
     */
    public String obtenerNombre() {
        return getNombre();
    }

    // Método que me devuelve el stock de vehiculos disponible en cada momento
    public int obtenerStock() {
        return getStock();
    }

    /* Método para comprar vehiculos. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        }
        setStock(getStock() + cantidad);
    }

    
    /**
     * Método para asignar el nombre del vehiculo
     *
     * @param cantidad de vehículos se van a vender
     * @param Exception Muestra excepción si se intenta vender cantidad negativa de vehículos
     * o mayor a las existencias
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
     * @return  nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return  precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the precioIVA
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * @param precioIVA the precioIVA to set
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

}
