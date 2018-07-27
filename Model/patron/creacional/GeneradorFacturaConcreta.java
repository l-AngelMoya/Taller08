package patron.creacional;

import patron.estructural.AdapteeFactura;

/**
 * 
 */
public class GeneradorFacturaConcreta implements Documento {


	private String emisor;
	private String logoNegocio;
	private String lema;
	private AdapteeFactura factura;
	
	
    public GeneradorFacturaConcreta() {
    	this.emisor="Emisor";
    	this.logoNegocio="";
    	this.lema="";
    	this.factura=new AdapteeFactura();
    }


    public GeneradorFacturaConcreta(String emisor, String logoNegocio, String lema, AdapteeFactura factura) {
		
		this.emisor = emisor;
		this.logoNegocio = logoNegocio;
		this.lema = lema;
		this.setFactura(factura);
	}


	/**
     * @return
     */
    public void generarDocumento() {
    	System.out.println(this.toString());
        return;
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


	public AdapteeFactura getFactura() {
		return factura;
	}


	public void setFactura(AdapteeFactura factura) {
		this.factura = factura;
	}


	@Override
	public String toString() {
		return "Factura[emisor=" + emisor + ", logoNegocio=" + logoNegocio + ", lema=" + lema
				+ ", factura=" + factura.toString() + "]";
	}


  

}