package sinPatron;


/**
 * 
 */
public class Cliente {

    /**
     * Default constructor
     */
    public Cliente() {
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String nombre;

    /**
     * @return
     */
    public String getID() {
    	return this.id;
    }

    /**
     * @param String id 
     * @return
     */
    public boolean setID(String id) {
    	this.id=id;
        return false;
    }

    /**
     * @return
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @param String str 
     * @return
     */
    public boolean setNombre(String str) {
        this.nombre=str;
        return false;
    }

}