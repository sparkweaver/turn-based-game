public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 150, 30, 10);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " swings a sword at " + target.name);
        target.takeDamage(attackPower);
    }
}
