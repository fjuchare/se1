package ru.nesterenko.se;

import java.util.Scanner;

/**
 * HomeWork3
 */
public class guessNumber {
    public static void main(String[] args) {

        int rand = 10;
        int x = (int) (Math.random() * rand);

        System.out.println("ENTER YOUR NUMBER");
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            int j = sc.nextInt();
            while (x == j) {
                System.out.println("You're win");
                System.out.println("An other game? Y/N");
                Scanner yn = new Scanner(System.in);
                String another = yn.next();

                switch (another) {
                    case ("Y"):
                        i = 0;
                        System.out.println("ENTER YOUR NUMBER");
                        x = (int) (Math.random() * rand);
                        j = sc.nextInt();
                        break;
                    case ("N"):
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong");
                }

            }
            if (x > j) {
                System.out.println("Need some more");
            }
            if (x < j)
                System.out.println("Need some min");
        }
    }
}