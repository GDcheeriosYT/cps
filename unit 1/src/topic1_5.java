public class topic1_5{
    
    public static void main(String[] args) {

        //(int)(3.8 + 0.5) = (int)(4.3) = 4
        //(int)(3.1 + 0.5) = (int)(-2.4) = 3
        //(int)(-2.9 + 0.5) = (int)(-2.4) = -2

        double height = 4.5;
        double radius = 3.2;

        double volume = Math.PI * radius * radius * height / 3;
        int vol = (int)(volume + 0.5);
        Math.pow(radius, 2);
        //int vol = (1/3)PI*radius^2*height

    }

}