package ejemplo_elaborado;

/**
 * Esta es otra implementación concreta de Dispositivo: Altavoz.
 * La clase Altavoz representa un dispositivo de altavoz que puede reproducir medios.
 * Implementa la interfaz Dispositivo y proporciona implementaciones para los métodos definidos en dicha interfaz.
 * 
 * @author Carlos Mijail Mamani Anccasi
 * @email cmamania@ulasalle.edu.pe
 * @version 1.0
 * @since 2023-05-30
 */
public class Altavoz implements Dispositivo {
    
    /**
     * Método utilizado para establecer una conexión con el altavoz.
     * La implementación de este método imprime un mensaje indicando que se está conectando el altavoz.
     */
    @Override
    public void conectar() {
        System.out.println("Conectando altavoz");
    }

    /**
     * Método utilizado para desconectar el altavoz.
     * La implementación de este método imprime un mensaje indicando que se está desconectando el altavoz.
     */
    @Override
    public void desconectar() {
        System.out.println("Desconectando altavoz");
    }

    /**
     * Método utilizado para reproducir un medio en el altavoz.
     * La implementación de este método imprime un mensaje indicando que se está reproduciendo el medio en el altavoz,
     * y luego invoca al método reproducir() del medio recibido como parámetro.
     * 
     * @param medio El medio a reproducir en el altavoz.
     *              Debe ser una instancia válida de la clase que implementa la interfaz `Medio`.
     */
    @Override
    public void reproducirMedio(Medio medio) {
        System.out.println("Reproduciendo medio en el altavoz");
        medio.reproducir();
    }

    /**
     * Método utilizado para detener la reproducción actual en el altavoz.
     * La implementación de este método imprime un mensaje indicando que se está deteniendo la reproducción en el altavoz.
     */
    @Override
    public void detenerReproduccion() {
        System.out.println("Deteniendo reproducción en el altavoz");
    }
}