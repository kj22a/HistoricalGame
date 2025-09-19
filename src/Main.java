public class Main {
    public static void main(String[] args) {
        Archer archer1 = new Archer(100, 5);
        Archer archer2 = new Archer(150, 4);
        Mage mage1 = new Mage(40, 12);

        Army army = new Army();
        army.addWarrior(archer1);
        army.addWarrior(archer2);
        army.addWarrior(mage1);
        int armySize = army.armySize();
        System.out.println("The size of the army is: " + armySize);
    }
}