package ejemplo_basico;

/**
 * Esta es una implementación concreta de Color.
 */
public class ColorRojo implements Color {
    @Override
    public void rellenar() {
        System.out.println("Rellenando con color rojo");
    }
}
