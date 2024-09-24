public class Healer extends Character{
    public Healer(String name) {
        super(name, 120, 10, 5);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " uses magic to heal " + target.name);
        target.takeDamage(attackPower);
    }

    public void heal(Character target) {
        target.health += 20;
        System.out.println(target.name + " is healed for 20 health. New health: " + target.health);
    }
}
