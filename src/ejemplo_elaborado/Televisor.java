package ejemplo_elaborado;

/**
 * Esta es una implementación concreta de Dispositivo: Televisor.
 * La clase Televisor representa un dispositivo de televisor que puede reproducir medios.
 * Implementa la interfaz Dispositivo y proporciona implementaciones para los métodos definidos en dicha interfaz.
 * 
 * @author Carlos Mijail Mamani Anccasi
 * @email cmamania@ulasalle.edu.pe
 * @version 1.0
 * @since 2023-05-30
 */
public class Televisor implements Dispositivo {
    
    /**
     * Método utilizado para establecer una conexión con el televisor.
     * La implementación de este método imprime un mensaje indicando que se está conectando el televisor.
     */
    @Override
    public void conectar() {
        System.out.println("Conectando televisor");
    }

    /**
     * Método utilizado para desconectar el televisor.
     * La implementación de este método imprime un mensaje indicando que se está desconectando el televisor.
     */
    @Override
    public void desconectar() {
        System.out.println("Desconectando televisor");
    }

    /**
     * Método utilizado para reproducir un medio en el televisor.
     * La implementación de este método imprime un mensaje indicando que se está reproduciendo el medio en el televisor,
     * y luego invoca al método reproducir() del medio recibido como parámetro.
     * 
     * @param medio El medio a reproducir en el televisor.
     *              Debe ser una instancia válida de la clase que implementa la interfaz `Medio`.
     */
    @Override
    public void reproducirMedio(Medio medio) {
        System.out.println("Reproduciendo medio en el televisor");
        medio.reproducir();
    }

    /**
     * Método utilizado para detener la reproducción actual en el televisor.
     * La implementación de este método imprime un mensaje indicando que se está deteniendo la reproducción en el televisor.
     */
    @Override
    public void detenerReproduccion() {
        System.out.println("Deteniendo reproducción en el televisor");
    }
}