package classwork;

public class AllShapesDemo {
    public static void main (String [] args){
        Shape [] shapeObject = {
            new Circle(),
            new Triangle(),
            new Rectangle ()
        };
        
        for(Shape shape : shapeObject){
            shape.draw();
        }
    }
}