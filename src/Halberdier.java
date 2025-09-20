public class Halberdier extends Warrior {

    Halberdier() {
        super(150, 4);
    }

    protected void sayAttackPhrase() {
        System.out.println("For Sparta!!");
    }

    protected void sayAttackedPhrase() {
        System.out.println("OUCH!");
    }
}
