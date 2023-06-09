package ejemplo_basico;

/**
 * Clase principal que demuestra el uso BASICO del patron Bridge.
 * 
 * @author Carlos Mijail Mamani Anccasi [cmamania@ulasalle.edu.pe].
 * @version 2.0
 * @since 2023-05-29
 */
public class Main {
    /**
     * Punto de entrada principal del programa.
     *
     * @param args Los argumentos de linea de comandos.
     */
    public static void main(String[] args) {
    	
    	/**
    	 * Se instacian dos Formas Rectagulo de diferente Color.
    	 */
        Forma rectanguloRojo = new Rectangulo(new ColorRojo());
        Forma circuloAzul = new Circulo(new ColorAzul(), 2);
        
        /**
    	 * Se invoca a la funcion de Dibujar a ambas Formas.
    	 */
        rectanguloRojo.dibujar();
        circuloAzul.dibujar();
    }
}
