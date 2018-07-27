package patron.creacional;

import java.util.*;

/**
 * 
 */
public interface Documento {

    /**
     * 
     */
    public void generarDocumento(): void();

    /**
     * 
     */
    public void setDetallesEmisor(): void();

    /**
     * 
     */
    public void setLogoNegocio(): void();

    /**
     * 
     */
    public void setLemaNegocio(): void();

}