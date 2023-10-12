public class App {
    public static void main(String[] args) throws Exception {
        AreaCuadrado cuadrado = new AreaCuadrado(7, 7, "Cuadrado");
        cuadrado.informacion();
        double AreaCuadrado = cuadrado.calcularArea();
        System.out.println("Área cuadrado: " + AreaCuadrado);
    }
}
