package ejemplo_basico;

/**
 * Esta es otra implementación concreta de Color.
 */
public class ColorAzul implements Color {
    @Override
    public void rellenar() {
        System.out.println("Rellenando con color azul");
    }
}
