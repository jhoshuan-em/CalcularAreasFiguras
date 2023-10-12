public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo(5, "Circulo");
        circulo.informacion();
        double areaCirculo = circulo.calcularArea();
        System.out.println("Area del circulo: "  + areaCirculo);

        Triangulo triangulo = new Triangulo(4, 3, "Triangulo");
        triangulo.informacion();
        double areaTrinagulo = triangulo.calcularArea();
        System.out.println("Area del triangulo: " + areaTrinagulo); 
    }
}
