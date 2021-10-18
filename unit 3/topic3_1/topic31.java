public class topic31{
    
    public static void main(String[] args) {
        
        int votesForA = randInt(200, 1000);
        int votesForB = randInt(200, 1000);

        System.out.println("this thing got " + votesForA + " and this thing got " + votesForB);

        if (votesForA == votesForB){
            System.out.println("tied");
        }

        else if (votesForA > votesForB){
            System.out.println("canidate A won!");
        }

        else{
            System.out.println("canidate B won!");
        }
    }

    public static int randInt(int low, int high){

        int randomValue = (int)(Math.random() * (high - low) + 1 + low);

        return randomValue;

    }

}