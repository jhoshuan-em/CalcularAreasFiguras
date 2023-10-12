public class Triangulo implements FiguraGeometrica {
    private double altura;
    private double base;
    private String nombre;
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }

    public Triangulo(double altura, double base, String nombre) {
        this.altura = altura;
        this.base = base;
        this.nombre = nombre;
    }

    public void informacion(){
        System.out.println("Nombre de la figura: " + nombre);
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }
}
