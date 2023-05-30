package ejemplo_elaborado;

/**
 * Esta es la interfaz que define la interfaz para los diferentes tipos de dispositivos(Abstracciones).
 * Implementar esta interfaz permite a los dispositivos conectarse, desconectarse, reproducir medios y detener la reproducción.
 * 
 * @author Carlos Mijail Mamani Anccasi
 * @email cmamania@ulasalle.edu.pe
 * @version 1.0
 * @since 2023-05-30
 */
public interface Dispositivo {
    
    /**
     * Método utilizado para establecer una conexión con el dispositivo.
     * La implementación de este método debe realizar las acciones necesarias para establecer la conexión.
     */
    void conectar();
    
    /**
     * Método utilizado para desconectar el dispositivo.
     * La implementación de este método debe realizar las acciones necesarias para cerrar la conexión y liberar los recursos utilizados.
     */
    void desconectar();
    
    /**
     * Método utilizado para reproducir un medio en el dispositivo.
     * @param medio El medio a reproducir en el dispositivo.
     *              Debe ser una instancia válida de la clase que implementa la interfaz `Medio`.
     */
    void reproducirMedio(Medio medio);
    
    /**
     * Método utilizado para detener la reproducción actual en el dispositivo.
     * La implementación de este método debe detener la reproducción y realizar las acciones necesarias para poner el dispositivo en un estado de detención.
     */
    void detenerReproduccion();
}