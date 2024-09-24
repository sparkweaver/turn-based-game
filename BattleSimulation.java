public class BattleSimulation {
    public static void main(String[] args) {
        Character warrior = new Warrior("Conan the Barbarian");
        Character mage = new Mage("Gandalf the Grey");
        Character healer = new Healer("Florence the Healer");

        simulateBattle(warrior, mage);
    }

    public static void simulateBattle(Character character1, Character character2) {
        if (!character1.isAlive() || !character2.isAlive()) {
            System.out.println("The battle is over!");
            if (!character1.isAlive()) {
                System.out.println(character1.name + " is defeated. " + character2.name + " wins!");
            } else {
                System.out.println(character2.name + " is defeated. " + character1.name + " wins!");
            }
            return;
        }

        character1.attack(character2);
        if(!character2.isAlive()) {
            System.out.println(character2.name + " is defeated.");
            return;
        }

        character2.attack(character1);
        if (!character1.isAlive()) {
            System.out.println(character1.name + " is defeated.");
            return;
        }

        simulateBattle(character1, character2);
    }
}
