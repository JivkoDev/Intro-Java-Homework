/**
 * Created by Jivko on 3/20/2016.
 */
import java.util.Scanner;
public class SumNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x;
        int sum =0;
        for (x = 1; x<=a;x++){
            sum +=x;
            }
        System.out.println(sum);
    }
            }

