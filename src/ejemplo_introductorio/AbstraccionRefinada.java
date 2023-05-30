package ejemplo_introductorio;

/**
 * Esta es una subclase de la abstraccion que utiliza la implementacion A.
 * 
 * @author Carlos Mijail Mamani Anccasi [cmamania@ulasalle.edu.pe].
 * @version 1.0
 * @since 2023-05-29
 */
public class AbstraccionRefinada extends Abstraccion {
    /**
     * Constructor de la clase AbstraccionRefinada.
     *
     * @param implementacion La implementacion a utilizar.
     */
    public AbstraccionRefinada(Implementacion implementacion) {
        super(implementacion);
    }

    @Override
    public void operacion() {
        // Realizar operaciones adicionales
        implementacion.operacionImplementacion();
        // Realizar mas operaciones adicionales
    }
}