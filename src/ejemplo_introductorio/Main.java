package ejemplo_introductorio;

/**
 * Clase principal que demuestra el uso del patrón Bridge.
 * Esta clase contiene el método main que crea instancias de implementaciones
 * y abstracciones y muestra cómo se utiliza el patrón Bridge.
 * 
 * @author Carlos Mijail Mamani Anccasi [cmamania@ulasalle.edu.pe].
 * @version 1.0
 * @since 2023-05-29
 */
public class Main {
    /**
     * Método principal que inicia la ejecución del programa.
     * Crea instancias de ImplementacionA e ImplementacionB, luego crea abstracciones
     * utilizando estas implementaciones y llama al método operacion() en cada una.
     * 
     * @param args Los argumentos de la línea de comandos. No se utilizan en este programa.
     */
    public static void main(String[] args) {
        Implementacion implementacionA = new ImplementacionA();
        Implementacion implementacionB = new ImplementacionB();

        Abstraccion abstraccion1 = new AbstraccionRefinada(implementacionA);
        Abstraccion abstraccion2 = new AbstraccionRefinada(implementacionB);

        abstraccion1.operacion();
        abstraccion2.operacion();
    }
}