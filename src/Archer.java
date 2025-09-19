public class Archer extends Warrior {

    Archer() {
        super(100, 5);
    }

    protected void sayAttackPhrase() {
        System.out.println("The Archer says: Die scum!");
    }
}
