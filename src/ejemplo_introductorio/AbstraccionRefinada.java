package ejemplo_introductorio;

/**
 * Esta es una subclase de la abstracción que utiliza la implementación A.
 * @author Carlos Mijail Mamani Anccasi
 * @email cmamania@ulasalle.edu.pe
 * @version 1.0
 * @since 2023-05-29
 */
public class AbstraccionRefinada extends Abstraccion {
    /**
     * Constructor de la clase AbstraccionRefinada.
     *
     * @param implementacion La implementación a utilizar.
     */
    public AbstraccionRefinada(Implementacion implementacion) {
        super(implementacion);
    }

    @Override
    public void operacion() {
        // Realizar operaciones adicionales
        implementacion.operacionImplementacion();
        // Realizar más operaciones adicionales
    }
}