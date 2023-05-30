package ejemplo_elaborado;

/**
 * Esta es una implementacion concreta de Dispositivo: Televisor.
 * La clase Televisor representa un dispositivo de televisor que puede reproducir medios.
 * Implementa la interfaz Dispositivo y proporciona implementaciones para los metodos definidos en dicha interfaz.
 * 
 * @author Carlos Mijail Mamani Anccasi
 * @email cmamania@ulasalle.edu.pe
 * @version 1.0
 * @since 2023-05-30
 */
public class Televisor implements Dispositivo {
    
    /**
     * Metodo utilizado para establecer una conexion con el televisor.
     * La implementacion de este metodo imprime un mensaje indicando que se esta conectando el televisor.
     */
    @Override
    public void conectar() {
        System.out.println("Conectando televisor");
    }

    /**
     * Metodo utilizado para desconectar el televisor.
     * La implementacion de este metodo imprime un mensaje indicando que se esta desconectando el televisor.
     */
    @Override
    public void desconectar() {
        System.out.println("Desconectando televisor");
    }

    /**
     * Metodo utilizado para reproducir un medio en el televisor.
     * La implementacion de este metodo imprime un mensaje indicando que se esta reproduciendo el medio en el televisor,
     * y luego invoca al metodo reproducir() del medio recibido como parametro.
     * 
     * @param medio El medio a reproducir en el televisor.
     *              Debe ser una instancia valida de la clase que implementa la interfaz `Medio`.
     */
    @Override
    public void reproducirMedio(Medio medio) {
        System.out.println("Reproduciendo medio en el televisor");
        medio.reproducir();
    }

    /**
     * Metodo utilizado para detener la reproduccion actual en el televisor.
     * La implementacion de este metodo imprime un mensaje indicando que se esta deteniendo la reproduccion en el televisor.
     */
    @Override
    public void detenerReproduccion() {
        System.out.println("Deteniendo reproduccion en el televisor");
    }
}