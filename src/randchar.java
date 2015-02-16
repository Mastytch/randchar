import java.util.Scanner;



public class randchar {

    public static void main(String[] args) {

        int xnumber;

        xnumber = (int) (Math.random() * 99 + 1);

        Scanner keyboard = new Scanner(System.in);

        int answer;

        do {

            System.out.print("Enter a guess (1-100): ");

            answer = keyboard.nextInt();

            if (answer == xnumber)

                System.out.println("Your guess is correct. Congratulations!");

            else if (answer < xnumber)

                System.out.println("Your guess is smaller than the secret number.");

            else if (answer > xnumber)

                System.out.println("Your guess is greater than the secret number.");

        } while (answer != xnumber);

    }

}