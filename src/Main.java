public class Main {
    public static void main(String[] args) {
        Archer Archer1 = new Archer(100, 5);
        Army army = new Army();
        army.addWarrior(Archer1);
        int armySize = army.armySize();
        System.out.println("The size of the army is: " + armySize);
        }
    }