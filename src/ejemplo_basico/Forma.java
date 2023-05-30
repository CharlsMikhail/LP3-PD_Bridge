package ejemplo_basico;

/**
 * Esta es la clase abstracta que define la interfaz para las ABSTRACCIONES de formas.
 * 
 * @author Carlos Mijail Mamani Anccasi [cmamania@ulasalle.edu.pe].
 * @version 2.0
 * @since 2023-05-29
 */
public abstract class Forma {
	
	/**
	 * Instacia de Color (Este es el Bridge o Puente)
	 */
    protected Color color;

    /**
     * Constructor de la clase Forma.
     *
     * @param _color El color a utilizar.
     */
    public Forma(Color _color) {
        this.color = _color;
    }

    /**
     * Dibuja la forma.
     */
    public abstract void dibujar();
}
