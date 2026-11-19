package tr.edu.istiklal;

public class ComparableCircle extends Circle implements Comparable<GeometricObject> {
    public ComparableCircle() { }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

   
    @Override
    public int compareTo(GeometricObject o) {
        return Double.compare(getArea(), o.getArea());
    }
}
