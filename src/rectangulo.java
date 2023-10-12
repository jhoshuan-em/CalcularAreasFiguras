public class rectangulo implements FiguraGeometrica {
  private double altura;
  private double base;

  public rectangulo(double altura, double base) {
    this.altura = altura;
    this.base = base;
  }

  public double getAltura() {
    return this.altura;
  }

  public double getBase() {
    return this.base;
  }

  public void setAltura(double nuevoAltura) {
    this.altura = nuevoAltura;
  }

  public void setBase(double nuevoBase) {
    this.base = nuevoBase;
  }

  @Override
  public double calcularArea() {
    return this.altura * this.base;
  }

  @Override
  public void informacion() {
    System.out.println("El rectangulo tiene: "+"\nAltura : "+this.altura+ "\nBase: "+ this.base);
  }
}
