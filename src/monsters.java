import java.util.HashMap;
import java.util.Map;

public class monsters {

    public static Map<String, String> createMonster() {
        Map<String, String> creatureData = new HashMap<>();

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

        return creatureData;
    }
}
