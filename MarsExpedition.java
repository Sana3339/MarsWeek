import java.util.Scanner;

public class MarsExpedition {

  public MarsExpedition() {

    Scanner input = new Scanner(System.in);
    System.out.println("Initializing...");
    System.out.println("Heating up...");
    System.out.println("We're up and running!");
    System.out.println("What is your name?");
    String name = input.nextLine();
    
    System.out.println();
    System.out.println("Hello " + name + " -- Welcome to the " + 
      "expedition prep program Are you ready to head out into the new world?" +
      " Type Y or N.");

    String response = input.nextLine();

    if (response.equalsIgnoreCase("y")) {
      System.out.println("I knew you'd say that. You're a team " + 
        "leader for a reason.");
    } else {
      System.out.println("Too bad you are team leader. You have to go.");
    }

    System.out.println();
    System.out.println("How many people do you want on your team?");
    int teamSize = input.nextInt();
    input.nextLine();

    System.out.println();
    if (teamSize > 2) {
      System.out.println("That's way too many people. We can only send " +
        "2 more members.");
        teamSize = 2;
    } else if (teamSize < 2) {
      System.out.println("That's not enough. We need you and 2 more members.");
    } else if (teamSize == 2) {
      System.out.println("That's a perfect sized team. Good job.");
    }

    System.out.println("You're allowed to bring one snack with you. " + 
      "What do you want to bring?");

    String snack = input.nextLine();
    System.out.println("Nice choice. You will bring a " + snack + " with you.");

    System.out.println();
    System.out.println("Now it's time for you to choose a vehicle.");
    System.out.println("Choose between the following: " + 
      "\nA. Mini Spaceship" + 
      "\nB. Unicorn" + 
      "\nC. Truck" + 
      "\nChoose A, B or C");

    String vehicle = input.nextLine();
    
    if (vehicle.equalsIgnoreCase("a")) {
      vehicle = "the dinghy spaceship";
    } else if (vehicle.equalsIgnoreCase("b")) {
      vehicle = "ATV";
    } else if (vehicle.equalsIgnoreCase("c")) {
      vehicle = "pet dragon";
    }
    
    System.out.println();
    System.out.println("Thank you " + name + ". You and " + teamSize + 
      " other people will be traversing Mars on a " + vehicle + ". Good luck!" + 
      "\n3...." + 
      "\n2...." + 
      "\n1...." + 
      "\nGo!");
  }
}