package Task4;

public class Main {
    public static void main(String[] args){
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(2);
        Square s1 = new Square(15);
        Square s2 = new Square(20);
        ShapeBuilder sb1 = new ShapeBuilder();

        System.out.println(c1.getArea());
        System.out.println(s1.getArea());

        sb1.addShape(c1);
        sb1.addShape(s1);

        System.out.println(sb1.getTotalArea());


    }

}
