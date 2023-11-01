import java.util.Scanner;
public class table {
    


    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int num = s.nextInt();
int i=1;

     while (i<=10) {
                int m = num;
                m = m * i;
                System.out.println(m);
i++;
            }
        }
    }
}


