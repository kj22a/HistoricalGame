public abstract class Warrior {
    protected int health;
    protected int attack;

    Warrior(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public void attack(Warrior otherWarrior) {
        otherWarrior.health -= attack;
        sayAttackPhrase();
        otherWarrior.sayAttackedPhrase();
    }

    abstract protected void sayAttackPhrase();

    abstract protected void sayAttackedPhrase();
}
