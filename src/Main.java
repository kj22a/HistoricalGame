public class Main {
    public static void main(String[] args) {
        Archer archer1 = new Archer();
        Archer archer2 = new Archer();
        Mage mage1 = new Mage();

        Army army = new Army();
        army.addWarrior(archer1);
        army.addWarrior(archer2);
        army.addWarrior(mage1);
        System.out.println(archer1.health);

        int armySize = army.armySize();
        System.out.println("The size of the army is: " + armySize);

        archer2.Attack(archer1);
        System.out.println(archer1.health);

        mage1.Attack(archer1);
        System.out.println(archer1.health);
    }
}