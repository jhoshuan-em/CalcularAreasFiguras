public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Trapecio Trapecio1 = new Trapecio(6, 7, 8, 5);
        System.out.println(Trapecio1.calcularArea());
        Trapecio1.informacion();
    }
}
