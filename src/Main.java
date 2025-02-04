import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        monsters monsters = new monsters();
        Map creatureData = monsters.createMonster();
        List<String> favoritesList = new ArrayList<>();


        System.out.println("Welcome to Monster Girl Encyclopedia (MGE)!");

        while (true) {
            System.out.println("\n< [Show] All Monsters, [View] Favorites list, [Search] for Monsters, [Add] to Favorites, [Remove] from Favorites, [Q]uit >");
            String navigation = sc.nextLine().trim().toLowerCase();

            switch (navigation) {
                case "view":
                    if (favoritesList.isEmpty()) {
                        System.out.println("Your favorites list is empty.");
                    } else {
                        for (int i = 0; i < favoritesList.size(); i++) {
                            System.out.println((i + 1) + ". " + favoritesList.get(i));
                        }
                    }
                    break;

                case "show":
                    int number = 1;
                    for (Object monster : creatureData.keySet()) {
                        System.out.println(number + ". " + monster);
                        number++;
                    }
                    break;

                case "add":
                    System.out.println("Choose your monster: ");
                    String updatedMonster = sc.nextLine();
                    if (creatureData.containsKey(updatedMonster)) {
                        favoritesList.add(updatedMonster);
                    } else {
                        System.out.println("This creature is not in the database.");
                    }
                    break;

                case "remove":
                    System.out.println("Which creature would you like to remove? ");
                    String removedMonster = sc.nextLine();
                    if (creatureData.containsKey(removedMonster)) {
                        favoritesList.remove(removedMonster);
                    } else {
                        System.out.println("This monster is not your favorite, silly!");
                    }
                    break;


                case "search":
                    System.out.println("\nWhich creature would you like to learn about: ");
                    String search = sc.nextLine();
                    if (creatureData.containsKey(search)) {
                        System.out.println(creatureData.get(search));
                    } else {
                        System.out.println("\nThis monster is not available at the moment.");
                    }
                    break;

                case "q":
                    System.out.println("Thank you for visiting Monster Girl Encyclopedia! Please visit again.");
                    sc.close();
                    return;

                default:
                    System.out.println("Sorry, could you repeat that for me?");
            }
        }
    }
}