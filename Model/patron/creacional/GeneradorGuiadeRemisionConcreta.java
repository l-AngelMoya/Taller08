package patron.creacional;

import patron.estructural.GuiadeRemisionAdapter;

/**
 * 
 */
public class GeneradorGuiadeRemisionConcreta implements Documento {

	private String emisor;
	private String logoNegocio;
	private String lema;
	private GuiadeRemisionAdapter guia;
    /**
     * Default constructor
     */
    public GeneradorGuiadeRemisionConcreta() {
    	this.emisor="Emisor";
    	this.logoNegocio="";
    	this.lema="";
    	this.setGuia(new GuiadeRemisionAdapter());
    }

    public GeneradorGuiadeRemisionConcreta(String emisor, String logoNegocio, String lema, GuiadeRemisionAdapter guia) {
		
		this.emisor = emisor;
		this.logoNegocio = logoNegocio;
		this.lema = lema;
		this.guia = guia;
	}

	@Override
    public void setDetallesEmisor(String emisor) {
    	this.emisor=emisor;
    }

    @Override
    public void setLogoNegocio(String logo) {
    	this.logoNegocio=logo;
    }

    @Override
    public void setLemaNegocio(String lema) {
        this.lema=lema;
    }


	public GuiadeRemisionAdapter getGuia() {
		return guia;
	}


	public void setGuia(GuiadeRemisionAdapter guia) {
		this.guia = guia;
	}


	@Override
	public void generarDocumento() {
		System.out.println(this.toString());
		
	}

	@Override
	public String toString() {
		return "Guia de Remision[emisor=" + emisor + ", logoNegocio=" + logoNegocio + ", lema=" + lema
				+ ", guia=" + guia + "]";
	}

   

}