import java.util.*;
class hari {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, j, c = 1;
        for (i = 1; i <= (2 * n) - 1; i++) {
            for (j = 1; j <= (2 * n) - 1; j++) {
                if (i == j || i + j == 2 * n)
                    System.out.print(c);
                else
                    System.out.print(" ");
            }
            if (i < n)
                c++;
            else
                c--;
            System.out.println();
        }
    }
}