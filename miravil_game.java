import java.util.Random;
import java.util.Scanner;

interface Player {
    void userplayer();
}

interface GameMode {
    void chooseMode();
}

interface StoryMode {
    void startStory();
}

interface SurvivalMode {
    void startSurvival();
}

class GamePlayer implements Player, GameMode, StoryMode, SurvivalMode {

    public void chooseMode() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String player = in.nextLine();
        System.out.println("Press P to start playing, " + player + "!");
        String startKey = in.nextLine();
        System.out.println("--------------------------------------------------------------");
        if (startKey.equalsIgnoreCase("P")) {
        System.out.println("Choose a game mode:");
        System.out.println("1. Story Mode");
        System.out.println("2. Survival Mode");
        int choice = in.nextInt();
        
        switch (choice) {
            case 1:
                startStory();
                break;
            case 2:
                startSurvival();
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 for Story Mode or 2 for Survival Mode.");
        	}
        }
        }
    public void startStory() {
        System.out.println("Starting Story Mode. Please get ready for this game!.");
        StoryGame storyGame = new StoryGame();
        storyGame.play();
    }

    public void startSurvival() {
        System.out.println("Starting Survival Mode. Prepare for challenges!");
        SurvivalGame survivalGame = new SurvivalGame();
        survivalGame.startSurvivalGame();
    }

    public void userplayer() {
    }
}

class StoryGame implements GameMode {

    public void play() {
        Scanner in = new Scanner(System.in);

        System.out.println("This is a story of 3 heroes that you want to know");
        System.out.println("Goodluck! If you fail, just try again. Choose your Heroes:");
        System.out.println("1. Goku");
        System.out.println("2. Luffy");
        System.out.println("3. Naruto");

        int userChoice = in.nextInt();

        switch (userChoice) {
            case 1:
                askGokuQuestions();
                break;
            case 2:
                askLuffyQuestions();
                break;
            case 3:
                askNarutoQuestions();
                break;
            default:
                System.out.println("Invalid choice. Your journey ends here.");
        }
    }
    
    private void askGokuQuestions() {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Question 1: What race is Goku?");
        System.out.println("A. Saiyan");
        System.out.println("B. Namekian");
        System.out.println("C. Human");
        String dragonball1 = in.nextLine();
        
        if (dragonball1.equalsIgnoreCase("A")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        
        System.out.println("Question 2: What is goku father name?");
        System.out.println("A. Bardock");
        System.out.println("B. Master Roshi");
        System.out.println("C. Whis");
        String dragonball2 = in.nextLine();
        
        if (dragonball2.equalsIgnoreCase("A")) {
        	System.out.println("Correct! Proceed to the next question...");
        } else {
        	System.out.println("Incorrect answer. Your journey ends here.");
        	return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 3: Who is the first teacher of goku ?");
        System.out.println("A. Beerus");
        System.out.println("B. Master Roshi");
        System.out.println("C. Whis");
        String dragonball3 = in.nextLine();
        
        if (dragonball3.equalsIgnoreCase("B")) {
        	System.out.println("Correct! Proceed to the next question...");
        } else {
        	System.out.println("Incorrect answer. Your journey ends here.");
        	return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 4: What is goku's mother name?");
        System.out.println("A. Bulma");
        System.out.println("B. Gine");
        System.out.println("C. Chi-Chi");
        String dragonball4 = in.nextLine();
        
        if (dragonball4.equalsIgnoreCase("B")) {
        	System.out.println("Correct! Proceed to the next question...");
        } else {
        	System.out.println("Incorrect answer. Your journey ends here.");
        	return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 5: Who was the first enemy that goku defeated?");
        System.out.println("A. Krillin");
        System.out.println("B. Vegeta");
        System.out.println("C. Colonel Silver");
        String dragonball5 = in.nextLine();
        
        if (dragonball5.equalsIgnoreCase("C")) {
        	System.out.println("Correct! Proceed to the next question...");
        } else {
        	System.out.println("Incorrect answer. Your journey ends here.");
        	return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 6: Who is greatest rival?");
        System.out.println("A. Jiren");
        System.out.println("B. Vegeta");
        System.out.println("C. Beerus");
        String dragonball6 = in.nextLine();
        
        if (dragonball6.equalsIgnoreCase("B")) {
        	System.out.println("Correct! Proceed to the next question...");
        } else {
        	System.out.println("Incorrect answer. Your journey ends here.");
        	return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 7: Who is the two reals goku son?");
        System.out.println("A. Raditz and broly");
        System.out.println("B. Gohan and Goten");
        System.out.println("C. Trunks and Goten");
        String dragonball7 = in.nextLine();
        
        if (dragonball7.equalsIgnoreCase("B")) {
        	System.out.println("Correct! Proceed to the next question...");
        } else {
        	System.out.println("Incorrect answer. Your journey ends here.");
        	return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 8: What form did Goku use against Jiren?");
        System.out.println("A. Super Saiyan 5");
        System.out.println("B. Super Saiyan God");
        System.out.println("C. Master Ultra Instinct.");
        String dragonball8 = in.nextLine();
        
        if (dragonball8.equalsIgnoreCase("C")) {
        	System.out.println("Correct! Proceed to the next question...");
        } else {
        	System.out.println("Incorrect answer. Your journey ends here.");
        	return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 9: Who is the strongest in dragonball?");
        System.out.println("A. Omni King");
        System.out.println("B. Goku ");
        System.out.println("C. Grand Priest");
        String dragonball9 = in.nextLine();
        
        if (dragonball9.equalsIgnoreCase("A")) {
        	System.out.println("Correct! Proceed to the next question...");
        } else {
        	System.out.println("Incorrect answer. Your journey ends here.");
        	return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 10: What is Goku's full name?");
        System.out.println("A. Kakarot");
        System.out.println("B. Son Goku");
        System.out.println("C. Goku");
        String dragonball10 = in.nextLine();

        if (dragonball10.equalsIgnoreCase("B")) {
            System.out.println("Congratulations! You've completed the quiz!");
        } else {
            System.out.println("Incorrect answer. Your journey ends here.");
            System.out.println("--------------------------------------------------------------");
        }
    }
    private void askLuffyQuestions() {
        Scanner in = new Scanner(System.in);
        while (true) {
        System.out.println("Question 1: What is Luffy's ultimate goal?");
        System.out.println("A. Find the One Piece");
        System.out.println("B. Become the King of Pirates");
        System.out.println("C. Conquer the Grand Line");
        String onepiece1 = in.nextLine();

        if (onepiece1.equalsIgnoreCase("B")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 2: What is the name of Luffy's group?");
        System.out.println("A. Strawhats Pirates");
        System.out.println("B. Luffy best tandem");
        System.out.println("C. The One Piece");
        String onepiece2 = in.nextLine();

        if (onepiece2.equalsIgnoreCase("A")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 3: Who is the first crewmate of luffy?");
        System.out.println("A. Nami");
        System.out.println("B. Sanji");
        System.out.println("C. Zoro");
        String onepiece3 = in.nextLine();

        if (onepiece3.equalsIgnoreCase("C")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 4: Who is the Grandpa of luffy?");
        System.out.println("A. Shanks");
        System.out.println("B. White Beard");
        System.out.println("C. Garp");
        String onepiece4 = in.nextLine();

        if (onepiece4.equalsIgnoreCase("C")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 5: Who is the father of luffy?");
        System.out.println("A. Dragon");
        System.out.println("B. Shanks");
        System.out.println("C. Oden");
        String onepiece5 = in.nextLine();

        if (onepiece5.equalsIgnoreCase("A")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 6: what devil fruit did luffy eat?");
        System.out.println("A. Inu Inu No Mi, Model: Dachshund.");
        System.out.println("B. Hito Hito no Mi, Model: Nika Devil Fruit");
        System.out.println("C. Yami Yami no Mi");
        String onepiece6 = in.nextLine();

        if (onepiece6.equalsIgnoreCase("B")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 7: what is the name of luffy first ship?");
        System.out.println("A. The Oro Jackson");
        System.out.println("B. The Going Merry ");
        System.out.println("C. The Thousand Sunny");
        String onepiece7 = in.nextLine();

        if (onepiece7.equalsIgnoreCase("B")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 8: What is the latest form of luffy?");
        System.out.println("A. Gear 8");
        System.out.println("B. Gear 7 ");
        System.out.println("C. Gear 5");
        String onepiece8 = in.nextLine();

        if (onepiece8.equalsIgnoreCase("C")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 8: Who is the two brother of luffy?");
        System.out.println("A. Ace and Sabo");
        System.out.println("B. Zoro and Sanji");
        System.out.println("C. Ace and Shanks");
        String onepiece9 = in.nextLine();

        if (onepiece9.equalsIgnoreCase("A")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 10: Who is the step mother of luffy");
        System.out.println("A. Nami");
        System.out.println("B. Dadan");
        System.out.println("C. Boa");
        String answer10 = in.nextLine();

        if (answer10.equalsIgnoreCase("B")) {
            System.out.println("Congratulations! You've completed the quiz!");
        } else {
            System.out.println("Incorrect answer. Your journey ends here.");    
            System.out.println("--------------------------------------------------------------");
        	}
        }
    }
    private void askNarutoQuestions() {
        Scanner in = new Scanner(System.in);

        System.out.println("Question 1: Who is Naruto's father?");
        System.out.println("A. Minato");
        System.out.println("B. Kakashi");
        System.out.println("C. Kurama");
        String ninja1 = in.nextLine();

        if (ninja1.equalsIgnoreCase("A")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 2: Who is the mother of Naruto?");
        System.out.println("A. Sakura");
        System.out.println("B. Kushina");
        System.out.println("C. Ino");
        String ninja2 = in.nextLine();

        if (ninja2.equalsIgnoreCase("B")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 3: Who is the first teacher of naruto?");
        System.out.println("A. Jiraiya");
        System.out.println("B. Kakashi");
        System.out.println("C. Iruka Umino");
        String ninja3 = in.nextLine();

        if (ninja3.equalsIgnoreCase("C")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {        	
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 4: Who kissed Naruto first??");
        System.out.println("A. Sasuke");
        System.out.println("B. Sakura");
        System.out.println("C. Hinata");
        String ninja4 = in.nextLine();

        if (ninja4.equalsIgnoreCase("A")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {        	
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 5: Who is the wife of naruto?");
        System.out.println("A. Ino");
        System.out.println("B. Sakura");
        System.out.println("C. Hinata");
        String ninja5 = in.nextLine();

        if (ninja5.equalsIgnoreCase("C")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {        	
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 6: What is inside Naruto body?");
        System.out.println("A. Ten Tails");
        System.out.println("B. Her Father");
        System.out.println("C. Kurama");
        String ninja6 = in.nextLine();

        if (ninja6.equalsIgnoreCase("C")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {        	
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 7: Who is the first crush of naruto?");
        System.out.println("A. Hinata");
        System.out.println("B. Sakura");
        System.out.println("C. Ino");
        String ninja7 = in.nextLine();

        if (ninja7.equalsIgnoreCase("B")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {        	
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 8: What number does Naruto become Hokage?");
        System.out.println("A. 6");
        System.out.println("B. 7");
        System.out.println("C. 8");
        String ninja8 = in.nextLine();

        if (ninja8.equalsIgnoreCase("B")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {        	
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 9: Who is Naruto's favorite sensei?");
        System.out.println("A. Kakashi");
        System.out.println("B. Iruka");
        System.out.println("C. Jiraiya");
        String ninja9 = in.nextLine();

        if (ninja9.equalsIgnoreCase("C")) {
            System.out.println("Correct! Proceed to the next question..");
        } else {        	
            System.out.println("Incorrect answer. Your journey ends here.");
            return;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("Question 10: What was Naruto's dream?");
        System.out.println("A. To become a chef");
        System.out.println("B. To become the greatest ninja");
        System.out.println("C. To become Hokage");
        String answer10 = in.nextLine();

        if (answer10.equalsIgnoreCase("C")) {
            System.out.println("Congratulations! You've completed the quiz!");
        } else {
            System.out.println("Incorrect answer. Your journey ends here.");
            System.out.println("--------------------------------------------------------------");
        }
    }
	public void chooseMode() {
	}
}
    class SurvivalGame implements SurvivalMode {

    	 public void startSurvivalGame() {
    	        Scanner in = new Scanner(System.in);

    	        System.out.println("Choose your hero for Survival Mode:");
    	        System.out.println("1. Goku");
    	        System.out.println("2. Luffy");
    	        System.out.println("3. Naruto");
    	        int userChoice = in.nextInt();

    	        switch (userChoice) {
    	            case 1:
    	                GokuSurvival gokuSurvival = new GokuSurvival();
    	                gokuSurvival.startSurvival();
    	                break;
    	            case 2:
    	            	LuffySurvival luffySurvival = new LuffySurvival();
    	            	luffySurvival.startSurvival();
    	                break;
    	            case 3:
    	            	NarutoSurvival narutoSurvival = new NarutoSurvival();
    	            	narutoSurvival.startSurvival();
    	                break;
    	            default:
    	                System.out.println("Invalid choice. Exiting Survival Mode.");
    	        }
    	    }

		@Override
		public void startSurvival() {
			
		}
    }
    	class GokuSurvival {
    	    private int gokuHealth;
    	    private int enemyHealth;

    	    public GokuSurvival() {
    	        gokuHealth = 100;
    	        enemyHealth = 100;
    	    }

    	    public void startSurvival() {
    	        Scanner in = new Scanner(System.in);

    	        do {
    	            System.out.println("You encountered an enemy! Prepare for battle!");
    	            Random random = new Random();

    	            System.out.println("Choose a skill for Goku:");
    	            System.out.println("A. Kame Kame ha");
    	            System.out.println("B. Punch");
    	            System.out.println("C. Spirit Bomb");
    	            System.out.println("D. Teleport");

    	            String userSkill = in.next();

    	            int userDamage = 0;

    	            switch (userSkill.toUpperCase()) {
    	                case "A":
    	                    System.out.println("Goku used Kame Kame ha!");
    	                    userDamage = -30;
    	                    break;
    	                case "B":
    	                    System.out.println("Goku used Punch!");
    	                    userDamage = -20;
    	                    break;
    	                case "C":
    	                    System.out.println("Goku used Spirit Bomb!");
    	                    userDamage = -50;
    	                    break;
    	                case "D":
    	                    System.out.println("Goku used Teleport!");
    	                    userDamage = 0;
    	                    break;
    	                default:
    	                    System.out.println("Invalid skill. Choose a valid skill.");
    	                    continue;
    	            }

    	            int enemySkill = random.nextInt(4);
    	            int enemyDamage = 0;

    	            switch (enemySkill) {
    	                case 0:
    	                    System.out.println("Enemy used Punch!");
    	                    enemyDamage = -15;
    	                    break;
    	                case 1:
    	                    System.out.println("Enemy used Kick!");
    	                    enemyDamage = -15;
    	                    break;
    	                case 2:
    	                    System.out.println("Enemy used Scratch!");
    	                    enemyDamage = -10;
    	                    break;
    	                case 3:
    	                    System.out.println("Enemy used Ultimate Skill!");
    	                    enemyDamage = -20;
    	                    break;
    	            }

    	            gokuHealth += enemyDamage;
    	            enemyHealth += userDamage;

    	            System.out.println("Goku's Health: " + gokuHealth);
    	            System.out.println("Enemy's Health: " + enemyHealth);

    	            if (enemyHealth <= 0) {
    	                System.out.println("Enemy's health is zero. You defeated the enemy!");
    	                System.out.println("Do you want to add another enemy? (Y/N)");
    	                String addEnemy = in.next();

    	                if (addEnemy.equalsIgnoreCase("Y")) {
    	                    enemyHealth = 100;  
    	                } else {
    	                    System.out.println("Exiting Survival Mode. Goku wins!");
    	                    return; 
    	                }
    	            }

    	            if (gokuHealth <= 0) {
    	                System.out.println("Goku fainted. Game Over!");
    	                break; 
    	            }

    	        } while (true);
    	    }
    	}

    	class LuffySurvival {
    	    private int luffyHealth;
    	    private int enemyHealth;

    	    public LuffySurvival() {
    	        luffyHealth = 100;
    	        enemyHealth = 100;
    	    }

    	    public void startSurvival() {
    	        Scanner in = new Scanner(System.in);

    	        do {
    	            System.out.println("You encountered an enemy! Prepare for battle!");
    	            Random random = new Random();

    	            System.out.println("Choose a skill for Luffy:");
    	            System.out.println("A.  Gomu Gomu no jet pistol");
    	            System.out.println("B. Gomu Gomu no Gatling");
    	            System.out.println("C. Gomu Gomu no Red Hawk");
    	            System.out.println("D. Gomu Gomu no Grizzly Magnum");

    	            String userSkill = in.next();

    	            int userDamage = 0;

    	            switch (userSkill.toUpperCase()) {
    	                case "A":
    	                    System.out.println("Luffy use Gomu Gomu no jet pistol!");
    	                    userDamage = -30;
    	                    break;
    	                case "B":
    	                    System.out.println("Luffy used Gomu Gomu no Gatling!");
    	                    userDamage = -20;
    	                    break;
    	                case "C":
    	                    System.out.println("Luffy used Gomu Gomu no Red Hawk!");
    	                    userDamage = -50;
    	                    break;
    	                case "D":
    	                    System.out.println("Luffy used Gomu Gomu no Grizzly Magnum!");
    	                    userDamage = 0;
    	                    break;
    	                default:
    	                    System.out.println("Invalid skill. Choose a valid skill.");
    	                    continue;
    	            }

    	            int enemySkill = random.nextInt(4);
    	            int enemyDamage = 0;

    	            switch (enemySkill) {
    	                case 0:
    	                    System.out.println("Enemy used Punch!");
    	                    enemyDamage = -15;
    	                    break;
    	                case 1:
    	                    System.out.println("Enemy used Kick!");
    	                    enemyDamage = -15;
    	                    break;
    	                case 2:
    	                    System.out.println("Enemy used Scratch!");
    	                    enemyDamage = -10;
    	                    break;
    	                case 3:
    	                    System.out.println("Enemy used Ultimate Skill!");
    	                    enemyDamage = -20;
    	                    break;
    	            }

    	            luffyHealth += enemyDamage;
    	            enemyHealth += userDamage;

    	            System.out.println("Luffy's Health: " + luffyHealth);
    	            System.out.println("Enemy's Health: " + enemyHealth);

    	            if (enemyHealth <= 0) {
    	                System.out.println("Enemy's health is zero. You defeated the enemy!");
    	                System.out.println("Do you want to add another enemy? (Y/N)");
    	                String addEnemy = in.next();

    	                if (addEnemy.equalsIgnoreCase("Y")) {
    	                    enemyHealth = 100;  
    	                } else {
    	                    System.out.println("Exiting Survival Mode. Luffy wins!");
    	                    return; 
    	                }
    	            }

    	            if (luffyHealth <= 0) {
    	                System.out.println("Luffy fainted. Game Over!");
    	                break; 
    	            }

    	        } while (true);
    	    }
    	}
    	class NarutoSurvival {
    	    private int narutoHealth;
    	    private int enemyHealth;

    	    public NarutoSurvival() {
    	        narutoHealth = 100;
    	        enemyHealth = 100;
    	    }

    	    public void startSurvival() {
    	        Scanner in = new Scanner(System.in);

    	        do {
    	            System.out.println("You encountered an enemy! Prepare for battle!");
    	            Random random = new Random();

    	            System.out.println("Choose a skill for naruto:");
    	            System.out.println("A.  Gomu Gomu no jet pistol");
    	            System.out.println("B. Gomu Gomu no Gatling");
    	            System.out.println("C. Gomu Gomu no Red Hawk");
    	            System.out.println("D. Shadow clone jutsu");

    	            String userSkill = in.next();

    	            int userDamage = 0;

    	            switch (userSkill.toUpperCase()) {
    	                case "A":
    	                    System.out.println("Naruto use punch!");
    	                    userDamage = -10;
    	                    break;
    	                case "B":
    	                    System.out.println("Naruto summon kurama! Attack him!");
    	                    userDamage = -50;
    	                    break;
    	                case "C":
    	                    System.out.println("Naruto Throw shuriken!");
    	                    userDamage = -20;
    	                    break;
    	                case "D":
    	                    System.out.println("Naruto used Shadow clone jutsu!");
    	                    userDamage = -10;
    	                    break;
    	                default:
    	                    System.out.println("Invalid skill. Choose a valid skill.");
    	                    continue;
    	            }

    	            int enemySkill = random.nextInt(4);
    	            int enemyDamage = 0;

    	            switch (enemySkill) {
    	                case 0:
    	                    System.out.println("Enemy used Punch!");
    	                    enemyDamage = -15;
    	                    break;
    	                case 1:
    	                    System.out.println("Enemy used Kick!");
    	                    enemyDamage = -15;
    	                    break;
    	                case 2:
    	                    System.out.println("Enemy used Scratch!");
    	                    enemyDamage = -10;
    	                    break;
    	                case 3:
    	                    System.out.println("Enemy used Ultimate Skill!");
    	                    enemyDamage = -20;
    	                    break;
    	            }

    	            narutoHealth += enemyDamage;
    	            enemyHealth += userDamage;

    	            System.out.println("Luffy's Health: " + narutoHealth);
    	            System.out.println("Enemy's Health: " + enemyHealth);

    	            if (enemyHealth <= 0) {
    	                System.out.println("Enemy's health is zero. You defeated the enemy!");
    	                System.out.println("Do you want to add another enemy? (Y/N)");
    	                String addEnemy = in.next();

    	                if (addEnemy.equalsIgnoreCase("Y")) {
    	                    enemyHealth = 100;  
    	                } else {
    	                    System.out.println("Exiting Survival Mode. Luffy wins!");
    	                    return; 
    	                }
    	            }

    	            if (narutoHealth <= 0) {
    	                System.out.println("Luffy fainted. Game Over!");
    	                break; 
    	            }

    	        } while (true);
    	    }
    	}
public class miravil_game {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        
        while (true) {
            GamePlayer player = new GamePlayer();
            player.chooseMode();

            System.out.println("Do you want to play again? (Y/N)");
            String playAgain = in.nextLine();

            if (!playAgain.equalsIgnoreCase("Y")) {
                System.out.println("Thanks for playing. Exiting the game.");
                break; 
            }
        }
    }
}