public class Warrior {
    protected int health;
    protected int attack;

    Warrior(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public void Attack(Warrior otherWarrior) {
        otherWarrior.health -= attack;
        sayAttackPhrase();
    }

    protected void sayAttackPhrase() {
        System.out.println("ATTACK!!!");
    }
}
