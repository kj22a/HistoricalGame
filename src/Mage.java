public class Mage extends Warrior {

    Mage() {
        super(40, 12);
    }

    protected void sayAttackPhrase() {
        System.out.println("WOLOLOLO!");
    }

    protected void sayAttackedPhrase() {
        System.out.println("ARGHHHH!");
    }
}
