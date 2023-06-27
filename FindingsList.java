import java.util.Scanner;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;

public class FindingsList {

  public FindingsList() throws InterruptedException {

    Thread.sleep(500);
    
    System.out.println("\nWelcome Back! Let's catalog what you found.");
    
    ArrayList<String> rockList = new ArrayList<>();
    
    rockList.add("rock");
    rockList.add("weird rock");
    rockList.add("smooth rock");
    rockList.add("no rock");
    
    System.out.println("Below are your list of rocks: ");
    System.out.println(rockList);

    System.out.println("\nOh no! There's a non-rock in the list. Let's remove it.");
    rockList.remove(3);
   
    System.out.println("\nPerfect\n.");

    Thread.sleep(1000);

    HashMap<String, String> fossilDirectory = new HashMap<>();

    System.out.println("Fossil data downloaded");

    fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
    fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
    fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

    System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)?");

    Scanner input = new Scanner(System.in);

    String fossilChoice = input.nextLine();

    if (fossilChoice.equalsIgnoreCase("Bird")) {
        System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
    } else if (fossilChoice.equalsIgnoreCase("Fish")) {
        System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
    } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
        System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
    }
    
    Thread.sleep(700);

    HashSet<String> supplies = new HashSet<>();
    supplies.add("shovel");
    supplies.add("brush");
    supplies.add("water");

    supplies.remove("brush");
    Iterator itr = supplies.iterator();

    System.out.println("Supplies Before Expedition: ");
    
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
