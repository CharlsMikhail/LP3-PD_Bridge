package ejemplo_elaborado;

/**
 * Esta es otra implementación concreta de Medio: Película.
 * La clase Pelicula representa un medio de película que puede ser reproducido.
 * Implementa la interfaz Medio y proporciona implementaciones para los métodos definidos en dicha interfaz.
 * 
 * Esta implementación específica de Medio se enfoca en la reproducción de películas, y tiene propiedades como título y director.
 * 
 * @author Carlos Mijail Mamani Anccasi
 * @email cmamania@ulasalle.edu.pe
 * @version 1.0
 * @since 2023-05-30
 */
public class Pelicula implements Medio {
    private String titulo;
    private String director;

    /**
     * Constructor de la clase Pelicula.
     * Crea una instancia de Pelicula con el título y director especificados.
     * 
     * @param titulo El título de la película.
     * @param director El director de la película.
     */
    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    /**
     * Método utilizado para reproducir la película.
     * La implementación de este método imprime un mensaje indicando que se está reproduciendo la película,
     * junto con el título y el director.
     */
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo película: " + titulo + " - " + director);
    }

    /**
     * Método utilizado para detener la reproducción de la película.
     * La implementación de este método imprime un mensaje indicando que se está deteniendo la película.
     */
    @Override
    public void detener() {
        System.out.println("Deteniendo película");
    }
}
