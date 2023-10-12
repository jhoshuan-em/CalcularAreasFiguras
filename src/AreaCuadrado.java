public class AreaCuadrado implements FiguraGeometrica {
    private double Lado1;
    private double Lado2;
    private String Nombre;

    @Override
    public double calcularArea() {
        return Lado1 * Lado2;
    }

    public AreaCuadrado(double lado1, double lado2, String nombre) {
        Lado1 = lado1;
        Lado2 = lado2;
        Nombre = nombre;
    }

    public void informacion() {
        System.out.println("Nombre de la figura: " + Nombre);
        System.out.println("Valor del lado 1: " + Lado1);
        System.out.println("Valor del lado 2: ");
    }
}
