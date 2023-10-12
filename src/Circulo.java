public class Circulo implements FiguraGeometrica {
    private double radio;
    private String nombre;
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public Circulo(double radio, String nombre) {
        this.radio = radio;
        this.nombre = nombre;
    }

    public void informacion(){
        System.out.println("Nombre de la figura: " + nombre);
        System.out.println("Radio: " + radio);
    }
}
