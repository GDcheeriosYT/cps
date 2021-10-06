public class Topic2829 {
    
    public static void main(String[] args) {

        //Interger, Double, Math
        //int, double are primatives

        int x= 5;
        double y= 7.2;
        Integer objectInt = new Integer(5); //cross through means it is "gone"
        System.out.println(objectInt);
        int sum = x + objectInt;
        System.out.println(sum);
        //System.out.println(objectInt.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);

        //Overflow is when we try to stor too big or too small of a value
        int whoops = Integer.MAX_VALUE + 2;
        System.out.println(whoops);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Math.pow(2.1, 5));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(8, 1/3));
        System.out.println(Math.abs(-9));
        System.out.println(Math.abs(-2.1));
        long bigNum = 3333333333l; //must have an L after long values
        System.out.println(Math.random() * 100); //is a double value from 0.0 to 1.0
        //for (int i =0; i < 5000; i++)
        double dice = (int) (Math.random() * 6) + 1;
        System.out.println((int)dice);

        //random integers from 1 to 6
        for (int i =0; i < 5; i++)
        System.out.println((int) (Math.random() * 6) + 1);

        //integers from 60 to 70
        for (int i =0; i < 5; i++)
        System.out.println((int) (Math.random() * 11) + 60);

        //in general, to get in a certain range...
        //Math.random() * (difference of number range + 1) + (lowest number)

        //integers from -2 to 5
        for (int i =0; i < 5; i++)
        System.out.println((int) (Math.random() * 8) + -2);

        /* all methods in the Math are static methods
        which means they are methods that belong to the class
        not to an individual Math object*/

        System.out.println("joe " + Topic2829.randInt(2, 9));

        quadraticSolver("24^2");

    }

    public static int randInt(int low, int high){

        int randomValue = (int)(Math.random() * (high - low) + 1 + low);

        return randomValue;

    }

    public static double quadraticSolver(int a, int b, int c){

       return 0;

    }

    
    public static double quadraticSolver(String equation){

    //ax^2 + bx + c = 0

    String stepOne = Integer.parseInt(equation.substring(0, (equation.indexOf(/* looking for this character */"^", /* the position to start search*/0) - 1))) equation.substring(equation.indexOf(, equation.indexOf("^", 0)), );

    //String stepTwo = (Integer.parseInt(stepOne) - )
    


    }

    public static String mathGrabber(String problem){
        if(problem.substring(problem.indexOf("^2") + 2) == "+"){
            return "+";
        }

        else{
            return "-";
        }
    }

}
