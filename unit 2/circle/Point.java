public class Point {

    // instance variables
    // member variables
    private double x, y;
  
    // constructors create objects by initializing properties
    // name must match class name
    public Point (double x, double y) {
  
      // this is a keyword, it's a reference to this object
      this.x = x;
  
      this.y = y;
  
    }
  
    // header / signature 
    public String toString() {
      return "(" + x + ", " + y + ")";
    }
  
    // getter methods
    public double getX() {
      return x;
    }
  
    public double getY() {
      return y;
    }
  
  // setter methods
    public void setX(double x) {
      this.x = x;
    }
    // void means DOES NOT return a value
    public void setY(double y) {
      this.y = y;
    }
  
    public double distanceTo(Point other) {
  
      double a = other.getX() - x; // my own x value
      double b = other.getY() - y;
      double c2 = a*a + b*b;
      double d = Math.sqrt(c2);
      return d;
    }
  
  }