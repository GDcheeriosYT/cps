public class Paper {
    
    private String color, type;

    private double height, width;

    private boolean holes;

    private double thickness;

    //
    public Paper(String col) {

        type = "blank";
        height = 11;
        height = 8.5;
        holes = true;
        thickness = 0.001;
        color = col;
        System.out.println("you created " + color + " paper!");

    }

}