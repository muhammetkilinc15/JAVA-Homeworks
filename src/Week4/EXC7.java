package Week4;

import java.util.Random;
import java.util.Scanner;

public class EXC7 {
    /** (Game: hangman) Write a hangman game that randomly generates a word and
     prompts the user to guess one letter at a time, as presented in the sample run.
     Each letter in the word is displayed as an asterisk. When the user makes a correct
     guess, the actual letter is then displayed. When the user finishes a word, display
     the number of misses and ask the user whether to continue to play with another
     word. Declare an array to store words, as follows:

      Add any words you wish in this array
     String[] words = {"write", "that",...}

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usedWorld = "", tempWorld = "",exit = "";

        boolean isFlag;
        do {
            int count=0; // This veriable for incorrect letters
            isFlag = true;
            String world = getWorld();
            if (!usedWorld.contains(world)) {
                usedWorld += world + " ";
                tempWorld = world;
                world = fillAsteriskWorld(world);
                while (true) {
                    System.out.print("(Guess) Enter a letter in world " + world + " > ");
                    char a = scanner.nextLine().charAt(0);

                    if (!tempWorld.contains(a+"")){
                        System.out.println(a+" is not in the world");
                        count++;
                    }

                    if (world.contains(a+"")){
                        System.out.println(a+" is already in the world");
                    }

                    world=updateWord(tempWorld,a,world);

                    if (tempWorld.equals(world)) {
                        isFlag = false;
                        break;
                    }
                }
            }
            if (!isFlag) {
                System.out.println("The world is "+tempWorld+". You missed "+count +" time");
                System.out.println("Do you want to guess another word? Enter y or n> ");
                exit = scanner.nextLine();
            }
        } while (!exit.equals("n"));
    }
    // This method if user enter correct letter, it update the asterix world
    public static String updateWord(String world1, char a, String world2) {
        if (world1.contains(a + "")) {
            int index = world1.indexOf(a);
            while (index != -1) {
                world2 = world2.substring(0, index) + a + world2.substring(index + 1, world2.length());
                index = world1.indexOf(a, index + 1);
            }
            return world2;
        }
        return world2;
    }
    public static String getWorld() {
        String[] worlds = {"programming", "coding", "computer", "administor", "screen", "color", "calender", "eyes", "beard","monster","notebook","telephone"};
        Random random = new Random();
        return worlds[random.nextInt(0, worlds.length)];
    }
    public static String fillAsteriskWorld(String world) {
        String str = "";
        for (int i = 0; i < world.length(); i++) {
            str += "*";
        }
        return str;
    }
}
