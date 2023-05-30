package ejemplo_elaborado;

/**
 * Esta es otra implementacion concreta de Dispositivo: Altavoz.
 * La clase Altavoz representa un dispositivo de altavoz que puede reproducir medios.
 * Implementa la interfaz Dispositivo y proporciona implementaciones para los metodos definidos en dicha interfaz.
 * 
 * @author Carlos Mijail Mamani Anccasi
 * @email cmamania@ulasalle.edu.pe
 * @version 1.0
 * @since 2023-05-30
 */
public class Altavoz implements Dispositivo {
    
    /**
     * Metodo utilizado para establecer una conexion con el altavoz.
     * La implementacion de este metodo imprime un mensaje indicando que se esta conectando el altavoz.
     */
    @Override
    public void conectar() {
        System.out.println("Conectando altavoz");
    }

    /**
     * Metodo utilizado para desconectar el altavoz.
     * La implementacion de este metodo imprime un mensaje indicando que se esta desconectando el altavoz.
     */
    @Override
    public void desconectar() {
        System.out.println("Desconectando altavoz");
    }

    /**
     * Metodo utilizado para reproducir un medio en el altavoz.
     * La implementacion de este metodo imprime un mensaje indicando que se esta reproduciendo el medio en el altavoz,
     * y luego invoca al metodo reproducir() del medio recibido como parametro.
     * 
     * @param medio El medio a reproducir en el altavoz.
     *              Debe ser una instancia valida de la clase que implementa la interfaz `Medio`.
     */
    @Override
    public void reproducirMedio(Medio medio) {
        System.out.println("Reproduciendo medio en el altavoz");
        medio.reproducir();
    }

    /**
     * Metodo utilizado para detener la reproduccion actual en el altavoz.
     * La implementacion de este metodo imprime un mensaje indicando que se esta deteniendo la reproduccion en el altavoz.
     */
    @Override
    public void detenerReproduccion() {
        System.out.println("Deteniendo reproduccion en el altavoz");
    }
}