package patron.estructural;

import java.util.*;

import patron.comportamiento.FacturaStrategy;

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
    private int numeroAutorizacion;

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
    private LinkedList<String> productos;

    /**
     * 
     */
    private double total;

    /**
     * @return
     */
    public int getNumeroAutorizacion() {
        // TODO implement here
        return this.numeroAutorizacion;
    }

    /**
     * @return
     */
    public String getNombreCliente() {
        // TODO implement here
        return this.nombreCliente;
    }

    /**
     * @return
     */
    public String getClaveAcceso() {
        // TODO implement here
        return this.claveAcceso;
    }

    /**
     * @return
     */
    public String getCodigo() {
        // TODO implement here
        return this.codigo;
    }

    /**
     * @return
     */
    public Date getFecha() {
        // TODO implement here
        return this.fecha;
    }

    /**
     * @return
     */
    public LinkedList<String> getProductos() {
        // TODO implement here
        return this.productos;
    }

    /**
     * @return
     */
    public double getTotal() {
        // TODO implement here
        return this.total;
    }

    /**
     * @param int n 
     * @return
     */
    public boolean setNumeroAutorizacion(int n) {
        // TODO implement here
        return false;
    }

    /**
     * @param String str 
     * @return
     */
    public boolean setNombreCliente(String str) {
        // TODO implement here
        return false;
    }

    /**
     * @param String clave 
     * @return
     */
    public boolean setClaveAcceso(String clave) {
        // TODO implement here
        return false;
    }

    /**
     * @param Date time 
     * @return
     */
    public boolean setFecha(Date time) {
        // TODO implement here
        return false;
    }

    /**
     * @param LinkedList<String> productos 
     * @return
     */
    public boolean setProductos(LinkedList<String> productos) {
        // TODO implement here
        return false;
    }

    /**
     * @param double can 
     * @return
     */
    public boolean setTotal(double can) {
        // TODO implement here
        return false;
    }
} 

