package ejemplo_elaborado;

/**
 * Esta es la interfaz que define la interfaz para los diferentes tipos de dispositivos(Abstracciones).
 * Implementar esta interfaz permite a los dispositivos conectarse, desconectarse, reproducir medios y detener la reproduccion.
 * 
 * @author Carlos Mijail Mamani Anccasi
 * @email cmamania@ulasalle.edu.pe
 * @version 1.0
 * @since 2023-05-30
 */
public interface Dispositivo {
    
    /**
     * Metodo utilizado para establecer una conexion con el dispositivo.
     * La implementacion de este metodo debe realizar las acciones necesarias para establecer la conexion.
     */
    void conectar();
    
    /**
     * Metodo utilizado para desconectar el dispositivo.
     * La implementacion de este metodo debe realizar las acciones necesarias para cerrar la conexion y liberar los recursos utilizados.
     */
    void desconectar();
    
    /**
     * Metodo utilizado para reproducir un medio en el dispositivo.
     * @param medio El medio a reproducir en el dispositivo.
     *              Debe ser una instancia valida de la clase que implementa la interfaz `Medio`.
     */
    void reproducirMedio(Medio medio);
    
    /**
     * Metodo utilizado para detener la reproduccion actual en el dispositivo.
     * La implementacion de este metodo debe detener la reproduccion y realizar las acciones necesarias para poner el dispositivo en un estado de detencion.
     */
    void detenerReproduccion();
}