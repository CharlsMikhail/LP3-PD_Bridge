package ejemplo_basico;

/**
 * Esta es una subclase de Forma que representa un Circulo con radio y utiliza Color.
 * 
 * @author Carlos Mijail Mamani Anccasi [cmamania@ulasalle.edu.pe].
 * @version 2.0
 * @since 2023-05-29
 */
public class Circulo extends Forma {
    private int radio;

    /**
     * Constructor de la clase Circulo.
     *
     * @param color El color a utilizar.
     * @param radio El radio entero del circulo.
     */
    public Circulo(Color color, int radio) {
        super(color);
        this.radio = radio;
    }

    /**
     * Obtiene el radio del circulo.
     *
     * @return El radio del circulo.
     */
    public int getRadio() {
        return radio;
    }
    
    /**
     * Representa el dibujar el circulo en pantalla con su radio y rellenarlo de color.
     */
    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo con radio " + radio);
        color.rellenar();
    }
}
