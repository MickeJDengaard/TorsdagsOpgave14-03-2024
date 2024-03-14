package Task4;

public class Square implements Shape{

    double længde;
    public Square(double længde) {
        this.længde = længde;
    }

    @Override
    public double getArea() {
        double area = længde * længde;
        return area;

    }
}
