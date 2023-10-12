public class Pentagono implements FiguraGeometrica{
    private double lado;
    private int numLados = 5;
    public Pentagono(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea(){
        return (numLados * Math.pow((this.getLado()/2),2))*(Math.sqrt(((5*Math.pow(this.getLado(),2))/8)+1));
        }
    @Override
    public double calcularPerimetro(){
        return ((numLados)*this.getLado());
        }
    @Override
    public void informacion(){
        System.out.println("Pentagono con base " + this.getLado()+":");
        System.out.println("\t-Área: "+this.calcularArea());
        System.out.println("\t-Perímetro: "+this.calcularPerimetro());
    }
}
