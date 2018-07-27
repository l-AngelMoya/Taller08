import patron.creacional.*;

public class MainStupendo {

	public static void main(String[] args) {
		
		System.out.println("*****************STUPENDO FACTURACION****************");
		printDefaults();
	}

	
	static void printDefaults() {
		
		System.out.println("+++++++++++++Factura Default++++++++++++++++");
		
		
		GeneradorFacturaConcreta ffactory= new GeneradorFacturaConcreta ();
		ffactory.generarDocumento();
		
		System.out.println("+++++++++++++++Nota de Credito Default+++++++++++++++++");
		
		
		GeneradorGuiadeRemisionConcreta ndcfactory= new GeneradorGuiadeRemisionConcreta ();
		ndcfactory.generarDocumento();
		
		
		System.out.println("+++++++++++++++Guia de Remision Default++++++++++++++++++");
		
		
		GeneradorNotadeCreditoConcreta grfactory= new GeneradorNotadeCreditoConcreta ();
		grfactory.generarDocumento();
		
		
	}
}

	