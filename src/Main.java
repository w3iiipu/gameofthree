import java.util.Scanner;

/*
First, you mash in a random large number to start with. Then, repeatedly do the following:
If the number is divisible by 3, divide it by 3.
If it's not, either add 1 or subtract 1 (to make it divisible by 3), then divide it by 3.
The game stops when you reach "1".

The input is a single number: the number at which the game starts.
Write a program that plays the Threes game, and outputs a valid sequence of steps you need to take to get to 1.
Each step should be output as the number you start at,
followed by either -1 or 1 (if you are adding/subtracting 1 before dividing), or 0 (if you are just dividing).
The last line should simply be 1.
*/

public class Main {

    public static void main(String[] args) {

        System.out.println("The game of 3's");
        System.out.print("Enter a number please: ");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input > 1) {

            if (input % 3 == 0) {
                System.out.println(input + " 0");
                input = input / 3;
            } else if (input % 3 == 1) {
                System.out.println(input + " -1");
                input = (input - 1) / 3;
            } else if (input % 3 == 2) {
                System.out.println(input + " 1");
                input = (input + 1) / 3;
            }
        }
        System.out.println(input);

//        while (input > 1) {
//            int n = input % 3 == 0 ? 0 : input % 3 == 1 ? -1 : 1;
//            System.out.println(input + " " + n);
//            input = (input + n) / 3;
//        }
//        System.out.println(input);
//
//    }
    }
}




