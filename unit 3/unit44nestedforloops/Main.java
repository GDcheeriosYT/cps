public class Main {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 5; j++){
            System.out.println(i + " " + j);
            }
        }

        for(int i = 0; i < 10; i++){
            for(int j = i + 1; j < 10; j++){
            System.out.println(i + " vs " + j);
            }
        }
    }
}
