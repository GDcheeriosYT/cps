public class Main {
    public static void main(String[] args) {
        //for (spot1; spot2; spot3)
        //spot1: delcraing/initializing an index variable

        //spot2: the loop condition. this loop runs WHILE this is true

        //spot3: updating the index variable


        int i;
        for (i = 0; i < 1000; i++) {
            System.out.println(i);
            
        }

        for (i = 0; i != 55; i+=5) {
            System.out.println(i);

        }

        for (i = 90; i != 68; i-=2) {
            System.out.println(i);

        }

        String str = "whack-a-mole";

        for (i = 0; i <= str.length(); i++){
            System.out.println(str.substring(i, i+1));
        }

    }
}
