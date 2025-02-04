import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> creatureData = new HashMap<>();
        List<String> favoritesList = new ArrayList<>();

        creatureData.put("Basilisk", "Snake-like monster with a torso of a woman.");
        creatureData.put("Mucus Toad", "A toad-like monster covered in mucus to maintain its wet body.");
        creatureData.put("Angel", "Servants of god with beautiful white wings revered by the Order of the Chief God.");
        creatureData.put("Demon", "Higher-rank fiends that have blue skin and black sclera, whose bodies contain vastly powerful wicked magic.");
        creatureData.put("Umi Osho", "A monster with a large turtle shell on its back that inhabits the seas of Zipangu.");
        creatureData.put("Hellhound", "A hound monster that has dark skin and fur, and burning red eyes.");
        creatureData.put("Owl Mage", "A kind of nocturnal harpy that inhabits the dark depths of forests.");
        creatureData.put("Mantis", "An insect monster distinguished by the huge scythes equipped on both of its arms.");
        creatureData.put("Chimaera", "Formerly a Hybrid beast born from a combination of several demon beasts via sorcery.");
        creatureData.put("Bogie", "A bizarre looking monster with the appearance of a clown whose white fingers drip with red drops of mana.");
        creatureData.put("Yuuki-Onna", "An ice elemental, possessing blue skin and a chilly cold body, that lives in snowy mountains.");
        creatureData.put("Elf", "The most well-known type of elves, also known as the forest elves.");
        creatureData.put("Slime", "Semi-liquid monsters that mostly live in plains, grasslands etc. near towns.");
        creatureData.put("Fairy", "This race is the most numerous of all the fairies living in the Fairy Kingdom.");
        creatureData.put("Living Doll", "Strong sentiment that builds up in dolls that were mistreated or thrown away fuses with mamono mana, causing them to come to life.");
        creatureData.put("Dr. Manhattan","a powerful reality warping entity that is nihilistic towards life and humanity");
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
                    for (String monster : creatureData.keySet()) {
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