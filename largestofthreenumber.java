import java.util.Scanner;

public class largestofthreenumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            if (a >= b && a >= c) {
                System.out.print(a);
            } else {
                if (b >= c && b >= a) {

                    System.out.print(b);
                } else {
                System.out.print(c);
                }
            }
        }
    }


