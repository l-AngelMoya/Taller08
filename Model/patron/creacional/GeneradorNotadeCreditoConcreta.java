package patron.creacional;

import patron.estructural.NotaDeCreditoAdapter;

/**
 * 
 */
public class GeneradorNotadeCreditoConcreta implements Documento {

    private String emisor;
	private String logoNegocio;
	private String lema;
	private NotaDeCreditoAdapter nota;

	/**
     * Default constructor
     * @return 
     */
    public GeneradorNotadeCreditoConcreta() {
    	this.emisor="Emisor";
    	this.logoNegocio="";
    	this.lema="";
    	this.setNota(new NotaDeCreditoAdapter());
    }


    public GeneradorNotadeCreditoConcreta(String emisor, String logoNegocio, String lema, NotaDeCreditoAdapter nota) {
		this.emisor = emisor;
		this.logoNegocio = logoNegocio;
		this.lema = lema;
		this.nota=nota;
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


	public NotaDeCreditoAdapter getNota() {
		return nota;
	}


	public void setNota(NotaDeCreditoAdapter nota) {
		this.nota = nota;
	}


	@Override
	public void generarDocumento() {
		System.out.println(this.toString());
		
	}


	@Override
	public String toString() {
		return "Nota de Credito [emisor=" + emisor + ", logoNegocio=" + logoNegocio + ", lema=" + lema
				+ nota.toString()+"]";
	}



	

    

}