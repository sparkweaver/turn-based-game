abstract class Character {
    String name;
    int health;
    int attackPower;
    int defense;

    public Character(String name, int health, int attackPower, int defense) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract void attack(Character target);

    public void takeDamage(int damage) {
        int actualDamage = Math.max(damage - defense, 0);
        health -= actualDamage;
        System.out.println(name + " takes " + actualDamage + "damage. Remaining health: " + health);
    }

    public String toString() {
        return name + " (HP: " + health + ")";
    }
}