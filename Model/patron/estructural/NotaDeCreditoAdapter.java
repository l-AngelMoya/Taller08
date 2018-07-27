package patron.estructural;

import java.util.Date;
import java.util.LinkedList;

/**
 * 
 */
public class NotaDeCreditoAdapter extends AdapteeFactura {
	 /**
     * 
     */
    private String detalleModificacion;
    /**
     * Default constructor
     */
    public NotaDeCreditoAdapter() {
    	super();
    	this.detalleModificacion="no mod";
    }
    
   

    public NotaDeCreditoAdapter(int numeroAutorizacion, String nombreCliente, String claveAcceso, String codigo,
			Date fecha, double total) {
		super(numeroAutorizacion, nombreCliente, claveAcceso, codigo, fecha, new LinkedList<String>(), total);
		
	}



	/**
     * @return
     */
    public String getDetalle() {
        return this.detalleModificacion;
    }
    
    public boolean setDetalle(String detalle) {
    		this.detalleModificacion=detalle;
    		return true;
    }



	@Override
	public String toString() {
		return "["+ super.toString()+"detalleModificacion=" + detalleModificacion
				+ "]";
	}

}