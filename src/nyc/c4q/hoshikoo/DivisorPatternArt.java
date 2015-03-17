package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/16/15.
 */
public class DivisorPatternArt {

    public static void main(String[] args) {

        divisorPatternArt(20);
    }

    public static void divisorPatternArt(int N){

        for(int i =1; i<= N; i++){

            for (int j =1; j <=N; j++){

                if (i%j==0 || j%i==0){
                    System.out.print("@ ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
