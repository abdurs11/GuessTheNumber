package guessthenumber;

import java.util.*;
    public class GuessTheNumber {

        public static void main(String[] args)
        {
            int count = 0;
            int stars;

            Scanner sc = new Scanner(System.in);
            Random rn = new Random();

            int randomNumber = rn.nextInt(10) +1;


            System.out.print("Guess a number from 1 to 10: ");
            int Number = sc.nextInt();

            while (Number != randomNumber)
            {
                if (Number > randomNumber) System.out.println("Number is smaller");
                else System.out.println("Number is bigger");
                System.out.println("Try again: ");
                Number = sc.nextInt();
                count++;
            }

            if (count == 0) stars = 5;
            else if (count == 1) stars = 4;
            else stars = 3;

            System.out.println("Well done");
            System.out.println("Stars: " + stars);
        }

    }



