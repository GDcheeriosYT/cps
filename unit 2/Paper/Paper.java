public class Paper {
    
    private String color, type;

    private double height, width;

    private boolean holes;

    private double thickness;

    //
    public Paper(String col) {

        type = "blank";
        height = 11;
        width = 8.5;
        holes = true;
        thickness = 0.001;
        color = col;
        System.out.println("you created " + color + " paper!");

    }

    public Paper(String color_thing, String type_thing, double height_thing, double width_thing, boolean hole_thing, double thicc_thing) {

        type = type_thing;
        height = height_thing;
        width = width_thing;
        holes = holes_thing;
        thickness = thicc_thing;
        color = color_thing;

    }

}