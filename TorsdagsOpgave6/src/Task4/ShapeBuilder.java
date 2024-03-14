package Task4;

import java.util.ArrayList;

public class ShapeBuilder {

    ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public double getTotalArea(){
        double totalArea = 0;
        for(int i = 0; i < shapes.size(); i++){
            totalArea += shapes.get(i).getArea();
        }
        return totalArea;
    }
}
