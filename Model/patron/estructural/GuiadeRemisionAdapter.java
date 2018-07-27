package patron.estructural;

import java.util.Date;
import java.util.LinkedList;

/**
 * 
 */
public class GuiadeRemisionAdapter extends AdapteeFactura {

    /**
     * Default constructor
     */
    public GuiadeRemisionAdapter() {
    	super();
    	this.destino="desconocido";
    	this.placa="sin placa";
    }
    

    public GuiadeRemisionAdapter(int numeroAutorizacion, String claveAcceso, String codigo,
			Date fecha, LinkedList<String> productos, double total, String destino, String placa) {
		super(numeroAutorizacion, "", claveAcceso, codigo, fecha, productos, total);
		this.destino=destino;
		this.placa=placa;
		
	}


	/**
     * 
     */
    private String destino;

    /**
     * 
     */
    private String placa;

    /**
     * @return
     */
    public String getDestino() {
        return this.destino;
    }

    /**
     * @param String str 
     * @return
     */
    public boolean setDestino(String str) {
        this.destino=str;
        return true;
    }

    /**
     * @return
     */
    public String getPlaca() {
        return this.placa;
    }

    /**
     * @param String str 
     * @return
     */
    public boolean setPlaca(String str) {
        this.placa=str;
        return true;
    }


	@Override
	public String toString() {
		return "[ "+ super.toString()+ "destino=" + destino + ", placa=" + placa + ", toString()=" + 
				"]";
	}



}