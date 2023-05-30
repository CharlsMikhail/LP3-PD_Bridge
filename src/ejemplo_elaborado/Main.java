package ejemplo_elaborado;

/**
 * Clase principal que demuestra el uso del patrón Bridge.
 * La clase Main contiene el método main, que es el punto de entrada de la aplicación.
 * En este método se crea una instancia de cada medio (Musica y Pelicula) y de cada dispositivo (Televisor y Altavoz),
 * y se realizan acciones como conectar, reproducir y detener en los dispositivos utilizando los diferentes medios.
 * 
 * Esta clase principal es utilizada para mostrar un ejemplo funcional del patrón Bridge.
 * 
 * @author Carlos Mijail Mamani Anccasi
 * @email cmamania@ulasalle.edu.pe
 * @version 1.0
 * @since 2023-05-30
 */
public class Main {
    /**
     * Método principal de la aplicación.
     * Este método es el punto de entrada de la aplicación y demuestra el uso del patrón Bridge.
     * Se crean instancias de los medios (Musica y Pelicula) y los dispositivos (Televisor y Altavoz),
     * y se realizan acciones como conectar, reproducir y detener en los dispositivos utilizando los diferentes medios.
     * 
     * @param args Los argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Crear los medios
        Medio musica = new Musica("Canción de ejemplo", "Artista de ejemplo");
        Medio pelicula = new Pelicula("Película de ejemplo", "Director de ejemplo");

        // Crear los dispositivos
        Dispositivo televisor = new Televisor();
        Dispositivo altavoz = new Altavoz();

        // Reproducir medios en los dispositivos
        televisor.conectar();
        televisor.reproducirMedio(musica);
        televisor.detenerReproduccion();
        televisor.reproducirMedio(pelicula);
        televisor.desconectar();

        altavoz.conectar();
        altavoz.reproducirMedio(musica);
        altavoz.detenerReproduccion();
        altavoz.reproducirMedio(pelicula);
        altavoz.desconectar();
    }
}
