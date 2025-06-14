package PraticaListas.Forma;

public class Quadrado implements Forma{

    private double area;

    public double getArea(){
        return area;
    }

    public void setArea(double area){
        this.area = area;
    }

    @Override
    public double calcularArea() {
        return getArea() * getArea();
    }
}
