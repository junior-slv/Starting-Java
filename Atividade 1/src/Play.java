import java.util.Scanner;
public class Play {
    public static void main(String[] args) {
        int tries = 1;
        int maxTries = 0;
        int randomNum = 0;
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("Insert difficult:\nEasy: 1-1.000\nMedium: 1-5.000\nHard 1-10.000 ");
            String difficultSet = sc.nextLine();
            if (difficultSet.equalsIgnoreCase("EASY")) {
                randomNum = 1 + (int) (Math.random() * 1000);
                maxTries = 16;
                loop = false;
            } else if (difficultSet.equalsIgnoreCase("MEDIUM")) {
                randomNum = 1 + (int) (Math.random() * 5000);
                maxTries = 13;
                loop = false;
            } else if (difficultSet.equalsIgnoreCase("HARD")) {
                randomNum = 1+ (int) (Math.random() * 10000);
                maxTries = 11;
                loop = false;
            } else {
                System.out.println("Insert a valid difficult (Easy, Medium or Hard)!");
            }
        }
        boolean Congratulations = false;
        int guess;
        while(tries < maxTries ){
            System.out.println("Insert your guess: ");
            guess = sc.nextInt();
            if (guess == randomNum){
                System.out.println("Congratulations, the correct number as: "+randomNum);
                Congratulations= true;
                break;
            }
            else if (guess < randomNum){
                System.out.println("Insert a upper value, attempt: "+tries);
            }
            else if (guess > randomNum){
                System.out.println("Insert a lower value, attempt: "+tries);
            }
            tries++;
        }
        if(Congratulations){
            System.out.println("Parabens :)");
        }else{
            System.out.println("Out of attempts, the correct number as: "+randomNum);
        }
    }
}
