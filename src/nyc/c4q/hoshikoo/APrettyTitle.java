package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/16/15.
 */


public class aPrettyTitle {
    public static void main(String[] args) {

        printTitle("this is a pen", '*');

    }

    public static void printTitle(String text, char a){

        String[] words = text.split(" ");
        for(int i=0; i<words.length; i++){

            System.out.print(words[i].substring(0, 1).toUpperCase());
            System.out.print(words[i].substring(1)+" ");
        }

        System.out.println();
        for (int i = 0; i <text.length() ; i++) {

            if(text.charAt(i)== ' ') {
                System.out.print(' ');
            } else{
                System.out.print(a);
            }
        }

    }
}
