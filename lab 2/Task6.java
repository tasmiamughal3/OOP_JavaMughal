import java.util.Scanner;

class Task6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Plz Enter age: ");
    int age = input.nextInt();
    
    if (age >= 18) {
      System.out.print("You are eligible to vote.");
    }
  }
}
