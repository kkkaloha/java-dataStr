

import java.util.Scanner;

public class daka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(daka.leaveTime(in.nextDouble()));

        int a[] = {1, 2};
        System.out.println(a);

        String s[] = new String[]{"32"};
    }

    public static double leaveTime(double arriveTime) {
        //rest:12:00-13:30 18:00-18:30
        if (arriveTime > 9.30) {
            System.out.println("you are late!");
            return -1;
        }
        if (arriveTime <= 8.30) {
            return 18.00;
        }
        if (arriveTime > 8.30&&arriveTime<=9.30) {
            return arriveTime + 10;
        }
        return -1;
    }
}
