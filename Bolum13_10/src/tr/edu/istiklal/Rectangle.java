package tr.edu.istiklal;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() { 
    	return width;
    	}
    public void setWidth(double width) {
    	this.width = width;
    	}
    public double getHeight() { 
    	return height; 
    	}
    public void setHeight(double height) {
    	this.height = height; 
    	}

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    
    @Override
    public int compareTo(Rectangle o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle other = (Rectangle) obj;
        return this.getArea() == other.getArea();
    }

    @Override
    public int hashCode() {
        return Double.hashCode(getArea());
    }

    @Override
    public String toString() {
    	super.toString();
        return  " " + width + " " + height;
    }
}