package ejemplo_introductorio;

/**
 * Esta clase abstracta define la interfaz para las implementaciones de la ABSTRACCION.
 * @author Carlos Mijail Mamani Anccasi
 * @email cmamania@ulasalle.edu.pe
 * @version 1.0
 * @since 2023-05-29
 */
public abstract class Abstraccion {
    protected Implementacion implementacion;

    /**
     * Constructor de la clase Abstraccion.
     *
     * @param implementacion La implementacion a utilizar.
     */
    public Abstraccion(Implementacion implementacion) {
        this.implementacion = implementacion;
    }

    /**
     * Metodo abstracto que debe ser implementado por las subclases para realizar operaciones.
     */
    public abstract void operacion();
}