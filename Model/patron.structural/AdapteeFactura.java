package patron.structural;

import java.util.*;

/**
 * 
 */
public class AdapteeFactura extends FacturaStrategy {

    /**
     * Default constructor
     */
    public AdapteeFactura() {
    }

    /**
     * 
     */
    private int numeroAutorización;

    /**
     * 
     */
    private String nombreCliente;

    /**
     * 
     */
    private String claveAcceso;

    /**
     * 
     */
    private String codigo;

    /**
     * 
     */
    private Date fecha;

    /**
     * 
     */
    private LinkedList productos;

    /**
     * 
     */
    private double total;

    /**
     * @return
     */
    public int getNumeroAutorización() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public String getNombreCliente() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getClaveAcceso() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getCodigo() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public Date getFecha() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public LinkedList getProductos() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public double getTotal() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param int n 
     * @return
     */
    public boolean setNumeroAutorización(void int n) {
        // TODO implement here
        return false;
    }

    /**
     * @param String str 
     * @return
     */
    public boolean setNombreCliente(void String str) {
        // TODO implement here
        return false;
    }

    /**
     * @param String clave 
     * @return
     */
    public boolean setClaveAcceso(void String clave) {
        // TODO implement here
        return false;
    }

    /**
     * @param Date time 
     * @return
     */
    public boolean setFecha(void Date time) {
        // TODO implement here
        return false;
    }

    /**
     * @param LinkedList productos 
     * @return
     */
    public boolean setProductos(void LinkedList productos) {
        // TODO implement here
        return false;
    }

    /**
     * @param double can 
     * @return
     */
    public boolean setTotal(void double can) {
        // TODO implement here
        return false;
    }

}