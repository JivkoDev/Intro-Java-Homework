/**
 * Created by Jivko on 3/20/2016.
 */
import java.util.Scanner;
public class GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        String result = " ";
        for (int i = 0; i < input.length; i++) {
            String ghetto = " ";

            switch (input [i]){
                case '0': ghetto = "Gee";
                    break;
                case '1':  ghetto ="Bro";
                    break;
                case '2': ghetto = "Zuz";
                    break;
                case '3': ghetto ="Ma";
                    break;
                case '4': ghetto ="Duh";
                    break;
                case '5': ghetto = "Yo";
                    break;
                case '6': ghetto = "Dis";
                    break;
                case '7': ghetto = "Hood";
                    break;
                case '8': ghetto ="Jam";
                    break;
                case '9': ghetto = "Mack";
                    break;

            }
            result += ghetto;
        }
    System.out.println(result);
    }
}
