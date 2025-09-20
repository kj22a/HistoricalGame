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
        otherWarrior.sayAttackedPhrase();
    }

    protected void sayAttackPhrase() {
        System.out.println("ATTACK!!!");
    }

    protected void sayAttackedPhrase() {
        System.out.println("Ouch!");
    }
}
