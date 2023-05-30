package ejemplo_elaborado;

/**
 * Esta es una implementacion concreta de Medio: Msica.
 * La clase Musica representa un medio de msica que puede ser reproducido.
 * Implementa la interfaz Medio y proporciona implementaciones para los metodos definidos en dicha interfaz.
 * 
 * Esta implementacion especifica de Medio se enfoca en la reproduccion de msica, y tiene propiedades como titulo y artista.
 * 
 * @author Carlos Mijail Mamani Anccasi [cmamania@ulasalle.edu.pe].
 * @version 1.0
 * @since 2023-05-30
 */
public class Musica implements Medio {
    private String titulo;
    private String artista;

    /**
     * Constructor de la clase Musica.
     * Crea una instancia de Musica con el titulo y artista especificados.
     * 
     * @param titulo El titulo de la msica.
     * @param artista El artista de la msica.
     */
    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    /**
     * Metodo utilizado para reproducir la msica.
     * La implementacion de este metodo imprime un mensaje indicando que se esta reproduciendo la msica,
     * junto con el titulo y el artista.
     */
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo msica: " + titulo + " - " + artista);
    }

    /**
     * Metodo utilizado para detener la reproduccion de la msica.
     * La implementacion de este metodo imprime un mensaje indicando que se esta deteniendo la msica.
     */
    @Override
    public void detener() {
        System.out.println("Deteniendo msica");
    }
}