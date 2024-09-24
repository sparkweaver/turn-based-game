public class Mage extends Character {
    public Mage(String name) {
        super(name, 100, 40, 5);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " casts a fireball at " + target.name);
        target.takeDamage(attackPower);
    }
}
