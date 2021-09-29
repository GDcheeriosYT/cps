class Main {
    public static void main(String[] args) {
      
      Point p1 = new Point(7, 1);
      Point p2 = new Point(-3, 2);
  
      System.out.println(p1.toString());
  
      // assign a whole new object
      p1 = new Point(2, 5);
  
  
      // can you SET the points x and y values to 1 more than they use to be?
      p1.setX(p1.getX() + 1);
      p1.setY(p1.getY() + 1);
      System.out.println(p1);
  
      System.out.println(p1.distanceTo(p2));
      System.out.println(p2.distanceTo(p1));

      Point c = new Point(3, 2);
      circle thing = new circle(10, c);

      circle otherThing = new circle(5, new Point(10, 10));

      System.out.println(thing.area());
      System.out.println(otherThing.area());
      System.out.println(thing.circumference());
      System.out.println(otherThing.circumference());
      
    }
  }