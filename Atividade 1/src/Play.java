import java.util.Random;
import java.util.Scanner;

public class Play {

    static boolean newTry(Scanner sc, int randomNum){
        System.out.println("Insert your guess between 1 and 1.000");
        int acGuess = sc.nextInt();
        System.out.println(randomNum);
        if (acGuess == randomNum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean hit = false;

        Scanner difficult = new Scanner(System.in);
        System.out.println("Insert difficult:\nEasy: 1-1.000\nMedium: 1-5.000\nHard 1-10.000 ");
        String difficultSet = difficult.nextLine();
        if (difficultSet.equals("Easy")) {
            int randomNum = (int) (Math.random() * 1001);
            Random rr = new Random();
            int test = rr.nextInt(1001);

            Scanner sc = new Scanner(System.in);

            do {

                hit = newTry(sc, test);

            }
            while(!hit);
        }
        else if (difficultSet.equals("Medium")) {
            int randomNum = (int) (Math.random() * 5001);
        }
        else if (difficultSet.equals("Hard")) {
            int randomNum = (int) (Math.random() * 10001);
        }
        else {
            System.out.println("Insert a valid difficult (Easy, Medium or Hard)!");
        }


    }
}


