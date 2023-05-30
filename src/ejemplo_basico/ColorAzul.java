package ejemplo_basico;

/**
 * Esta es otra implementación concreta de Color.
 * @author Carlos Mijail Mamani Anccasi
 * @email cmamania@ulasalle.edu.pe
 * @version 2.0
 * @since 2023-05-29
 */
public class ColorAzul implements Color {
    @Override
    public void rellenar() {
        System.out.println("Rellenando con color azul");
    }
}
