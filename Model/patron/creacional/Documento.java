package patron.creacional;


/**
 * 
 */
public interface Documento {

    /**
     * @return 
     * 
     */
    public void generarDocumento();

    /**
     * 
     */
    public void setDetallesEmisor(String str);

    /**
     * 
     */
    public void setLogoNegocio(String str);

    /**
     * 
     */
    public void setLemaNegocio(String str);

}