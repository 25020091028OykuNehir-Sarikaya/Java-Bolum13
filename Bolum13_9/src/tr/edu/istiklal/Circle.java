package tr.edu.istiklal;

public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { 
    	return radius;
    	}
    public void setRadius(double radius) { 
    	this.radius = radius;
    	}

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

   
    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.radius, o.radius);
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle)) return false;
        Circle other = (Circle) obj;
        return this.radius == other.radius;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radius);
    }

    @Override
    public String toString() {
    	super.toString();
        return  " " + radius;
    }
}