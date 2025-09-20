public class Cavalry extends Warrior {

    Cavalry() {
        super(250, 2);
    }
    protected void sayAttackPhrase() {
        System.out.println("Allahu Akbar");
    }

    protected void sayAttackedPhrase() {
        System.out.println("Arghhhh!");
    }
}
