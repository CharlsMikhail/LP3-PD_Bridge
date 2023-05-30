package ejemplo_basico;

/**
 * Esta es la clase abstracta que define la interfaz para las ABSTRACCIONES de formas.
 */
public abstract class Forma {
    protected Color color;

    /**
     * Constructor de la clase Forma.
     *
     * @param color El color a utilizar.
     */
    public Forma(Color color) {
        this.color = color;
    }

    /**
     * Dibuja la forma.
     */
    public abstract void dibujar();
}
