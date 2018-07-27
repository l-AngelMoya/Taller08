package patron.estructural;

import java.util.*;

import patron.comportamiento.FacturaStrategy;


/**
 * 
 */
public class AdapteeFactura extends FacturaStrategy {

	
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
     * Default constructor
     */
    public AdapteeFactura() {
    	this.numeroAutorizacion = 99999;
		this.nombreCliente = "Consumidor";
		this.claveAcceso = "9999999999";
		this.codigo = "9999999999";
		this.fecha = new Date(); 
		this.productos = new LinkedList<>();
		this.total = 0.0;
    }

    public AdapteeFactura(int numeroAutorizacion, String nombreCliente, String claveAcceso, String codigo, Date fecha,
			LinkedList<String> productos, double total) {
		this.numeroAutorizacion = numeroAutorizacion;
		this.nombreCliente = nombreCliente;
		this.claveAcceso = claveAcceso;
		this.codigo = codigo;
		this.fecha = fecha;
		this.productos = productos;
		this.total = total;
	}


    /**
     * @return
     */
    public int getNumeroAutorizacion() {
        return this.numeroAutorizacion;
    }

    /**
     * @return
     */
    public String getNombreCliente() {
        return this.nombreCliente;
    }

    /**
     * @return
     */
    public String getClaveAcceso() {
        return this.claveAcceso;
    }

    /**
     * @return
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * @return
     */
    public Date getFecha() {
        return this.fecha;
    }

    /**
     * @return
     */
    public LinkedList<String> getProductos() {
        return this.productos;
    }

    /**
     * @return
     */
    public double getTotal() {
        return this.total;
    }

    /**
     * @param int n 
     * @return
     */
    public boolean setNumeroAutorizacion(int n) {
        this.numeroAutorizacion=n;
        return true;
    }

    /**
     * @param String str 
     * @return
     */
    public boolean setNombreCliente(String str) {
    	this.nombreCliente=str;
    	return true;
    }

    /**
     * @param String clave 
     * @return
     */
    public boolean setClaveAcceso(String clave) {
    	this.claveAcceso=clave;
    	return true;
    }

    /**
     * @param Date time 
     * @return
     */
    public boolean setFecha(Date time) {
    	this.fecha=time;
    	return true;
    }

    /**
     * @param LinkedList<String> productos 
     * @return
     */
    public boolean setProductos(LinkedList<String> productos) {
        this.productos=productos;
    	return true;
    }

    /**
     * @param double can 
     * @return
     */
    public boolean setTotal(double can) {
        this.total=can;
        return true;
    }

	@Override
	public String toString() {
		return "[numeroAutorizacion=" + numeroAutorizacion + ", nombreCliente=" + nombreCliente
				+ ", claveAcceso=" + claveAcceso + ", codigo=" + codigo + ", fecha=" + fecha + ", productos="
				+ productos + ", total=" + total + "]";
	}

	
} 

