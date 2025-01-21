import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    int myNumber = (int) (Math.random() * 100);
    int num;
    do {
      System.out.println("Guess a number");
      num = s1.nextInt();
      if (num == myNumber) {
        System.out.println("Congratulations!You guessed it correctly");
        break;
      } else if (num > myNumber) {
        System.out.println("Number is greater");
      } else {
        System.out.println("Number is smaller");
      }
    } while (num >= 0);
    System.out.println("my number was:" + myNumber);
    s1.close();
    System.out.println("hello");
  }
}