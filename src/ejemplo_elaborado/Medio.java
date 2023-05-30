package ejemplo_elaborado;

/**
 * Esta es la interfaz que define la interfaz para los diferentes tipos de medios(Implementaciones).
 * Implementar esta interfaz permite reproducir y detener un medio.
 * 
 * @author Carlos Mijail Mamani Anccasi
 * @email cmamania@ulasalle.edu.pe
 * @version 1.0
 * @since 2023-05-30
 */
public interface Medio {
    
    /**
     * Método utilizado para reproducir el medio.
     * La implementación de este método debe iniciar la reproducción del medio.
     */
    void reproducir();
    
    /**
     * Método utilizado para detener la reproducción del medio.
     * La implementación de este método debe detener la reproducción actual del medio y ponerlo en un estado de detención.
     */
    void detener();
}
