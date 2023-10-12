public class Trapecio implements FiguraGeometrica{
    //Trapecio Isoseles 
    private double catetoA;
    private double catetoB;
    private double catetoBMayor;
    private double altura;

    public Trapecio(double catetoA, double catetoB, double catetoBMayor, double altura){
        this.catetoA=catetoA;
        this.catetoB=catetoB;
        this.catetoBMayor=catetoBMayor;
        this.altura=altura;
    }
    public void setCatetoA(double catetoA){
        this.catetoA=catetoA;
    }
    public double getCatetoA(){
        return catetoA;
    }
    
    public void setCatetoB(double catetoB) {
        this.catetoB = catetoB;
    }
    public void setCatetoBMayor(double catetoBMayor) {
        this.catetoBMayor = catetoBMayor;
    }
    
    public double getCatetoB() {
        return catetoB;
    }
    public double getCatetoBMayor() {
        return catetoBMayor;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override    
    public double calcularArea(){
        double area= ((getCatetoB() +getCatetoBMayor())*getAltura())/2;
        return area;
    }
    @Override
    public void informacion(){
        System.out.println("El trapecio Isoseles tiene \nLado A: "+getCatetoA()+"\nLado b: "+getCatetoB()
        +"\nLado B Mayor: "+getCatetoBMayor()+"\nAltura: "+ getAltura());
    }

}
