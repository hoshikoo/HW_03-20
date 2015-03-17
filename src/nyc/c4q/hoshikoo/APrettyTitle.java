package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/16/15.
 */

import java.lang.String;
public class aPrettyTitle {
    public static void main(String[] args) {
        printTitle("hello hoshiko oki", '*');
    }

    public static void printTitle(String text, char c){
        System.out.println(text);

        System.out.print(text.substring(0, 1).toUpperCase());
        System.out.println(text.substring(1));
        //System.out.println();
        for (int i = 0; i <text.length() ; i++) {

            if(text.charAt(i)== ' ') {
                System.out.print(' ');
            } else{
                System.out.print(c);
            }
        }

        // for (int i = 0; i <text.length() ; i++) {
        //String[] out = text.split(" ");

        //if (text.charAt(i) == ' ') {


        //} else {
        //   System.out.print(text.charAt(i));
        //}

    }



}
