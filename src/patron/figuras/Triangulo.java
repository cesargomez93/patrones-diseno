package patron.figuras;

/**
 *
 * @author César
 */
public class Triangulo implements Figura {

    private int longitud;

    public Triangulo(int longitud) {
        this.setLongitud(longitud);
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public void mostrarDimensiones() {
        System.out.println("Información del triángulo:");
        System.out.println("Longitud: " + longitud);
    }

    @Override
    public void calcularPerimetro() {
        
    }

    @Override
    public void calcularArea() {
        
    }
}