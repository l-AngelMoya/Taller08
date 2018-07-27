package patron.estructural;

/**
 * 
 */
public class NotaDeCreditoAdapter extends AdapteeFactura {

    /**
     * Default constructor
     */
    public NotaDeCreditoAdapter() {
    }

    /**
     * 
     */
    private String detalleModificacion;

    /**
     * @return
     */
    public String getDetalle() {
        // TODO implement here
        return this.detalleModificacion;
    }
    
    public boolean setDetalle(String detalle) {
    		this.detalleModificacion=detalle;
    		return true;
    }

}