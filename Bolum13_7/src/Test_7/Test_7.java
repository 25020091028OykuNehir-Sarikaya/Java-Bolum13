package Test_7;

import tr.edu.istiklal.GeometricObject;
import tr.edu.istiklal.Square;
import tr.edu.istiklal.Colorable;

public class Test_7 {

    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = new Square(i + 1);
        }

        for (GeometricObject obj : objects) {
            System.out.println(  obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
        }
    }
}