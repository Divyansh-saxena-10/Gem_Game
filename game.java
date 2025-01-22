import java.util.Scanner;

class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t, min = 50, max = 80, k;
        int unum, p = 3, f = 5, p1 = 3, f1 = 5;

        t = min + (int)(Math.random() * ((max - min) + 1));
        //System.out.println("Total Gems: " + t);

        while (t > 0) {
            System.out.println("User: Enter Gems between " + p + " and " + f);
            unum = sc.nextInt();
            if (unum >= p && unum <= f) {
                t = t - unum; 
                p++;
                f++;
            } else {
                System.out.println("Wrong input! Try again."); 
            }

            if (t <= 0) {
                System.out.println("User Won!!");
                break;
            }

            k = p1 + (int)(Math.random() * ((f1 - p1) + 1));
            System.out.println("Computer: Enter Gems between " + p1 + " and " + f1);
            System.out.println(k);
            t -= k; 
            p1++;
            f1++;
            //System.out.println("Remaining Gems: " + t);

            if (t <= 0) {
                System.out.println("Computer Won!!");
                break;
            }
        }
    }
}
