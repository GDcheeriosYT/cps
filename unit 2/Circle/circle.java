public class circle {

    private double radius;

    private Point center = new Point(0, 0);

    public circle(double r, Point c) {
        this.radius = r;
        center = c;
    }

    public double area() {
        return (double) 3.14 * this.radius * this.radius;
        
    }

    public double circumference(){
        return (double) 2 * 3.14 * this.radius;
    }

    public boolean contains(Pointer other){
        return center.distanceTo(other) <= radius;
    }

}
