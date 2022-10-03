import java.util.Random;
import java.util.Scanner;

public class MainGame {


    public static void main(String[] args) {

        //System objects
        Scanner scanner = new Scanner((System.in));
        Random random = new Random();


        //Game variables
        Enemie[] enemies = new Enemie[]{
                new Warrior("Warrior", 70, 50),
                new Skeleton("Skeleton", 50, 35),
                new Wizard("Wizard", 45, 60),
                new Zombie("Zombie", 60, 30),
                new Assassin("Assassin", 30, 80)};


        //Player variables
        int playerHealth = 100;
        int playerAttackDamage = 50;

        //Potion variables
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50; //Percentage

        boolean running = true;

        System.out.println("Welcome to the Dungeon, traveller!");

        GAME:
        //Lable GAME for restarting the while loop
        while (running) {
            System.out.println("----------------------------------------------------------");


            Enemie enemy = enemies[random.nextInt(enemies.length)];

            System.out.println("\t# " + enemy + " appeard! #\n");

            while (enemy.getMaxEnemyHealth() > 0) {
                System.out.println("\tYour HP: " + playerHealth);
                System.out.println("\t" + enemy + "'s HP: " + enemy.getMaxEnemyHealth());
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink health potion");
                System.out.println("\t3. Run!");

                String input = scanner.nextLine();
                if (input.equals("1")) {
                    int damageDealt = random.nextInt(playerAttackDamage);
                    int damageTaken = random.nextInt(enemy.getEnemyAttackDamage());

                    enemy.setMaxEnemyHealth(enemy.getMaxEnemyHealth() - damageDealt);
                    playerHealth -= damageTaken;

                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage!");
                    System.out.println("\t> You recieve " + damageTaken + " in retaliation!");

                    if (playerHealth < 1) {
                        System.out.println("\t You have taken too much damage! You are too weak to go on!");
                        break;
                    }

                } else if (input.equals("2")) {
                    if (numHealthPotions > 0) {
                        playerHealth += healthPotionHealAmount;
                        numHealthPotions--;
                        System.out.println("\t You drink a health potion, heling yourself for " + healthPotionHealAmount +
                                "\n\t> You now have " + playerHealth + " HP." +
                                "\n\t> You have " + numHealthPotions + " health potions left. \n");
                    } else {
                        System.out.println("\t> You have no health potions left! Defeat enemies for a chance to get one!\n");
                    }


                } else if (input.equals("3")) {
                    System.out.println("\tYou run away from the " + enemy + "!");
                    continue GAME; //Jump back to the beginning of while loop
                } else {
                    System.out.println("\tInvalid command!");
                }
            }
            if (playerHealth < 1) {
                System.out.println("You limp out of the dungeon, weak from battle!");
                break;
            }
            System.out.println("----------------------------------------------------------");
            System.out.println(" # " + enemy + " was defeated! # ");
            System.out.println(" # You have " + playerHealth + " HP left. #");
            if (random.nextInt(100) < healthPotionDropChance) {
                numHealthPotions++;
                System.out.println(" # The " + enemy + " dropped a health potion! # ");
                System.out.println(" # You have " + numHealthPotions + " health potion(s). # ");
            }
            System.out.println("----------------------------------------------------------");
            System.out.println("What would you like to do!");
            System.out.println("1. Continue fighting");
            System.out.println("2. Exit the dungeon");

            String input = scanner.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid commands!");
                input = scanner.nextLine();
            }
            if (input.equals("1")) {
                System.out.println("You continue on your adventure!");
            } else if (input.equals("2")) {
                System.out.println("You exit the dungeon, successful from your adventure! ");
                break;
            }
        }
        System.out.println("#######################");
        System.out.println("# THANKS FOR PLAYING! #");
        System.out.println("#######################");
    }
}