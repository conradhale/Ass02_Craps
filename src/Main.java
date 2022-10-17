import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    boolean done = false;
    boolean pointDone;
    int rndDieOne;
    int rndDieTwo;
    int rndDieSum;
    int point;
    Random rnd = new Random();
    Scanner in = new Scanner(System.in);
    String input;

    while (!done) {
      rndDieOne = rnd.nextInt(6) + 1;
      System.out.println("The first dice roll is " + rndDieOne);

      rndDieTwo = rnd.nextInt(6) + 1;
      System.out.println("The second dice roll is " + rndDieTwo);

      rndDieSum = rndDieOne + rndDieTwo;
      System.out.println("The sum of the dice rolls is " + rndDieSum);

      if (rndDieSum == 12 || rndDieSum == 2 || rndDieSum == 3) {
        System.out.println("Craps! You lose!");
      } else if (rndDieSum == 11 || rndDieSum == 7) {
        System.out.println("Natural! You win!");
      } else {
        point = rndDieSum;
        System.out.println(point + " is now the point!");
        pointDone = false;

        while (!pointDone) {
          System.out.println("Rolling again...");
          rndDieOne = rnd.nextInt(6) + 1;
          System.out.println("The first dice roll is " + rndDieOne);

          rndDieTwo = rnd.nextInt(6) + 1;
          System.out.println("The second dice roll is " + rndDieTwo);

          rndDieSum = rndDieOne + rndDieTwo;
          System.out.println("The sum of the dice rolls is " + rndDieSum);

          if (rndDieSum == point) {
            System.out.println("You win!");
            pointDone = true;
          } else if (rndDieSum == 7) {
            System.out.println("You lose!");
            pointDone = true;
          }
        }
      }
      input = "";
      while (!(input.equals("y") || input.equals("n"))) {
        System.out.print("Play Again? [y/n]: ");
        input = in.next();
        in.nextLine();
        if (input.equalsIgnoreCase("n")) {
          done = true;
        } else if (input.equalsIgnoreCase("y")) {
          done = false;
        }
      }
    }
  }
}