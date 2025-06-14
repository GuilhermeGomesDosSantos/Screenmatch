package PraticaListas.Forma;

public class Circulo implements Forma{
    private double area;

    public double getArea(){
        return area;
    }
    public void setArea(double area){
        this.area = area;
    }
    @Override
    public double calcularArea() {
        return 3.14 * (getArea() * getArea());
    }

}
