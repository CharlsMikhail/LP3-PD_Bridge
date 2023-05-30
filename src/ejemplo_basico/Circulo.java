package ejemplo_basico;

/**
 * Esta es una subclase de Forma que representa un Circulo con radio y utiliza Color.
 */
public class Circulo extends Forma {
    private int radio;

    /**
     * Constructor de la clase Circulo.
     *
     * @param color El color a utilizar.
     * @param radio El radio del círculo.
     */
    public Circulo(Color color, int radio) {
        super(color);
        this.radio = radio;
    }

    /**
     * Obtiene el radio del círculo.
     *
     * @return El radio del círculo.
     */
    public int getRadio() {
        return radio;
    }
    
    /**
     * Representa el dibujar el círculo en pantalla con su radio y rellenarlo de color.
     */
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo con radio " + radio);
        color.rellenar();
    }
}
