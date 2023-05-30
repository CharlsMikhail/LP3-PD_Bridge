package ejemplo_introductorio;

/**
 * Esta clase abstracta define la interfaz para las implementaciones de la ABSTRACCION.
 * 
 * @author Carlos Mijail Mamani Anccasi [cmamania@ulasalle.edu.pe].
 * @version 1.0
 * @since 2023-05-29
 */
public abstract class Abstraccion {
	
	/**
	 * Instacia de Implementacion (Este es el Bridge o Puente)
	 */
    protected Implementacion implementacion;

    /**
     * Constructor de la clase Abstraccion.
     *
     * @param _implementacion La implementacion a utilizar.
     */
    public Abstraccion(Implementacion _implementacion) {
        this.implementacion = _implementacion;
    }

    /**
     * Metodo abstracto que debe ser implementado por las subclases para realizar operaciones.
     */
    public abstract void operacion();
}