import java.util.Scanner;

public class pattern_10 {
    public static void main(String args[]) throws Exception {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = scn.nextInt();

        int i = 1;

        while(i <= n) {
            int j = 1;
            char ch = 'A';

            while(j <= n) {
                System.out.print(ch + " ");
                j++;
                ch++;
            }

            System.out.print("\n");
            i++;
        }
    }
}
