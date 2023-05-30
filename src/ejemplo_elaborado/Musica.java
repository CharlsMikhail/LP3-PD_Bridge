package ejemplo_elaborado;

/**
 * Esta es una implementación concreta de Medio: Música.
 * La clase Musica representa un medio de música que puede ser reproducido.
 * Implementa la interfaz Medio y proporciona implementaciones para los métodos definidos en dicha interfaz.
 * 
 * Esta implementación específica de Medio se enfoca en la reproducción de música, y tiene propiedades como título y artista.
 * 
 * @author Carlos Mijail Mamani Anccasi
 * @email cmamania@ulasalle.edu.pe
 * @version 1.0
 * @since 2023-05-30
 */
public class Musica implements Medio {
    private String titulo;
    private String artista;

    /**
     * Constructor de la clase Musica.
     * Crea una instancia de Musica con el título y artista especificados.
     * 
     * @param titulo El título de la música.
     * @param artista El artista de la música.
     */
    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    /**
     * Método utilizado para reproducir la música.
     * La implementación de este método imprime un mensaje indicando que se está reproduciendo la música,
     * junto con el título y el artista.
     */
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo música: " + titulo + " - " + artista);
    }

    /**
     * Método utilizado para detener la reproducción de la música.
     * La implementación de este método imprime un mensaje indicando que se está deteniendo la música.
     */
    @Override
    public void detener() {
        System.out.println("Deteniendo música");
    }
}