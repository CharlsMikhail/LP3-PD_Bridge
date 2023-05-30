package ejemplo_elaborado;

/**
 * Esta es otra implementacion concreta de Medio: Pelicula.
 * La clase Pelicula representa un medio de pelicula que puede ser reproducido.
 * Implementa la interfaz Medio y proporciona implementaciones para los metodos definidos en dicha interfaz.
 * 
 * Esta implementacion especifica de Medio se enfoca en la reproduccion de peliculas, y tiene propiedades como titulo y director.
 * 
 * @author Carlos Mijail Mamani Anccasi [cmamania@ulasalle.edu.pe].
 * @version 1.0
 * @since 2023-05-30
 */
public class Pelicula implements Medio {
    private String titulo;
    private String director;

    /**
     * Constructor de la clase Pelicula.
     * Crea una instancia de Pelicula con el titulo y director especificados.
     * 
     * @param titulo El titulo de la pelicula.
     * @param director El director de la pelicula.
     */
    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    /**
     * Metodo utilizado para reproducir la pelicula.
     * La implementacion de este metodo imprime un mensaje indicando que se esta reproduciendo la pelicula,
     * junto con el titulo y el director.
     */
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo pelicula: " + titulo + " - " + director);
    }

    /**
     * Metodo utilizado para detener la reproduccion de la pelicula.
     * La implementacion de este metodo imprime un mensaje indicando que se esta deteniendo la pelicula.
     */
    @Override
    public void detener() {
        System.out.println("Deteniendo pelicula");
    }
}
