package ejemplo_introductorio;

/**
 * Clase principal que demuestra el uso del patron Bridge.
 * 
 * @author Carlos Mijail Mamani Anccasi [cmamania@ulasalle.edu.pe].
 * @version 1.0
 * @since 2023-05-29
 */
public class Main {
    public static void main(String[] args) {
        Implementacion implementacionA = new ImplementacionA();
        Implementacion implementacionB = new ImplementacionB();

        Abstraccion abstraccion1 = new AbstraccionRefinada(implementacionA);
        Abstraccion abstraccion2 = new AbstraccionRefinada(implementacionB);

        abstraccion1.operacion();
        abstraccion2.operacion();
    }
}