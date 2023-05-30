package ejemplo_elaborado;

/**
 * Esta es la interfaz que define la interfaz para los diferentes tipos de medios(Implementaciones).
 * Implementar esta interfaz permite reproducir y detener un medio.
 * 
 * @author Carlos Mijail Mamani Anccasi [cmamania@ulasalle.edu.pe].
 * @version 1.0
 * @since 2023-05-30
 */
public interface Medio {
    
    /**
     * Metodo utilizado para reproducir el medio.
     * La implementacion de este metodo debe iniciar la reproduccion del medio.
     */
    void reproducir();
    
    /**
     * Metodo utilizado para detener la reproduccion del medio.
     * La implementacion de este metodo debe detener la reproduccion actual del medio y ponerlo en un estado de detencion.
     */
    void detener();
}
