package ejemplo_basico;

/**
 * Esta es una subclase de Forma que representa un Rectangulo y utiliza Color.
 * 
 * @author Carlos Mijail Mamani Anccasi [cmamania@ulasalle.edu.pe].
 * @version 2.0
 * @since 2023-05-29
 */
public class Rectangulo extends Forma {
    /**
     * Constructor de la clase Rectangulo.
     *
     * @param color El color a utilizar.
     */
    public Rectangulo(Color color) {
        super(color);
    }
    
    /**
     * Representa el dibujar el rectangulo en pantalla y rellenarlo de color.
     */
    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectangulo");
        color.rellenar();
    }
}
